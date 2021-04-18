package squelette;

import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.glu.GLU;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import Lib3d.* ;

import java.util.*;

import java.io.FileReader;
import java.nio.FloatBuffer ;

import org.antlr.runtime.*;

import XScene.*;


public class JavaRenderer implements GLEventListener, KeyListener, MouseMotionListener, MouseListener
{
	/** Camera rotation step (in degree) */
	static final float rotationAngle = 0.5f ;
	/** Camera translation step */
	static final float translationStep = 2.0f ;
	   
	/** OpenGL utilities */
   private static final GLU glu = new GLU();
   
   /** Scene graph root */
   private Lib3d.SceneGraph.Group m_root = new Lib3d.GlSceneGraph.Group() ;

   /** Materials library */
   private MaterialLib materialLib = new MaterialLib() ;
   
   /** Camera position */
   Lib3d.Vector3d m_cameraPosition  = new Vector3d(0.0f, 100.0f, 800.0f); 
   /** Camera angle around Y axis */
   float m_cameraAngleY = 0.0f ;
   /** Camera angle around X axis */
   float m_cameraAngleX = 0.0f ;
   /** Last mouse position on X axis */
   float m_lastMouseX = 0.0f ;
   /** Last mouse position on Y axis */
   float m_lastMouseY = 0.0f ;
   
   // Canvas
   GLCanvas m_canvas ;
   
   JavaRenderer(GLCanvas canvas)
   {
	   m_canvas = canvas ;
   }
   
   /**
    * Display method 
    */
   public void display(GLAutoDrawable glDrawable) 
   {
	   // display callback
       final GL2 gl = glDrawable.getGL().getGL2();
       
       // clear color and depth buffer
       gl.glClear(GL.GL_COLOR_BUFFER_BIT);
       gl.glClear(GL.GL_DEPTH_BUFFER_BIT);
       
       // Transformations (équivalent à une translation de 300cm de la caméra suivant l'axe Z et une translation de 100cm suivant l'axe Y)
       gl.glLoadIdentity();
       
       // Camera transformations 
       gl.glRotatef(-m_cameraAngleX, 1.0f, 0.0f, 0.0f) ;
       gl.glRotatef(-m_cameraAngleY, 0.0f, 1.0f, 0.0f) ;
       gl.glTranslatef(-m_cameraPosition.get(0), -m_cameraPosition.get(1), -m_cameraPosition.get(2)) ;

       
       // Maj de la scene
       m_root.update();
       // rendu de la scene
       m_root.draw(glDrawable);
   }

   public void displayChanged(GLAutoDrawable glDrawable, boolean modeChanged, boolean deviceChanged) 
   {}

   /** 
    * Initialisation method
    */
   public void init(GLAutoDrawable glDrawable) 
   {	   
       final GL2 gl = glDrawable.getGL().getGL2();

       // --------------------------
       // Initialisation de la scène
       // --------------------------
       
       // On recupere le chemin vers la scène
       System.out.println("Quelle scène souhaitez-vous charger ? ");
       Scanner sc = new Scanner(System.in);
       String t_sceneName = sc.nextLine();
       sc.close();
       try {
    	   // Compilation du fichier contenant la scène
    	   FileReader reader = new FileReader("data/scenesDescription/"+t_sceneName+".sc") ;
           GraphSceneLexer lexer = new GraphSceneLexer(new ANTLRReaderStream(reader));
           GraphSceneParser parser = new GraphSceneParser(new CommonTokenStream(lexer)) ;
           // On recupère la racine du graphe
           m_root = parser.graph();
           // On recupere la librairie de matériaux
           materialLib = parser.materialLib;
           System.out.println("You just started the scene " + parser.sc_name);
           materialLib.setTexturePath("data");
    	   materialLib.registerTextures(gl) ; // Charge et enregistre les textures au niveau d'OpenGL 
       }
       catch (Exception e) {
    	   System.out.println("ERROR "+e.getMessage());
       }
	   
	   //-----------------------
	   // Initialisations OpenGL
	   //-----------------------

       gl.glShadeModel(GL2.GL_SMOOTH); // Shading mode
       gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); // Frame buffer clear color
       // init z-buffer
       gl.glClearDepth(1.0f);
       gl.glEnable(GL2.GL_DEPTH_TEST);
       gl.glDepthFunc(GL2.GL_LEQUAL);
       gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL.GL_NICEST);
       // Enalbles textures
       gl.glEnable(GL2.GL_TEXTURE_2D);     
       // Enables lights
       gl.glEnable(GL2.GL_LIGHTING) ;
       // Enables light 0
       gl.glEnable(GL2.GL_LIGHT0) ;
       gl.glEnable(GL2.GL_NORMALIZE); 
       float[] lightColor = {1f, 1f, 1f} ;	// Couleur de la lumière (Mis de 0.3 à 1 pour bien faire ressortir les couleurs et faire les tests)
       float[] lightPosition = {0.0f, 0.0f, 0.0f} ; // Position de la lumière
       // Initializes light 0
       gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_AMBIENT, FloatBuffer.wrap(lightColor)) ;
       gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_DIFFUSE, FloatBuffer.wrap(lightColor)) ;
       gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_SPECULAR, FloatBuffer.wrap(lightColor)) ;
       // Light positionning
     gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_POSITION, FloatBuffer.wrap(lightPosition)) ;
       
       // Keyboard listener
//       glDrawable.addKeyListener(this);
       m_canvas.addKeyListener(this);
       // Mouse listeners
//       glDrawable.addMouseMotionListener(this) ;
       m_canvas.addMouseMotionListener(this) ;
//       glDrawable.addMouseListener(this) ;
       m_canvas.addMouseListener(this) ;
   }

   /**
    * Reshape of the rendering window
    */
   public void reshape(GLAutoDrawable gLDrawable, int x, int y, int width, int height) 
   {
       final GL2 gl = gLDrawable.getGL().getGL2();
       if(height <= 0) { height = 1; }
       // camera and perspective
       final float aspectRatio = (float)width / (float)height;
       gl.glMatrixMode(GL2.GL_PROJECTION);
       gl.glLoadIdentity();
       glu.gluPerspective(50.0f, aspectRatio, 1.0, 1000.0);
       gl.glMatrixMode(GL2.GL_MODELVIEW);
       gl.glLoadIdentity();
   }

   @Override
   public void keyPressed(KeyEvent e) 
   {
       if(e.getKeyCode() == KeyEvent.VK_ESCAPE) 
       {
           JavaMain.bQuit = true;
           System.exit(0);
       }
       else if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyChar() == 'w')
       {
    	   Vector3d translation = new Vector3d(0.0f, 0.0f, -translationStep) ;
    	   translation = new MatrixRotationY((float)(m_cameraAngleY/180.0f*Math.PI)).transform(translation) ;
    	   m_cameraPosition = Vector3d.add(m_cameraPosition, translation) ;
       }
       else if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyChar() == 's')
       {
    	   Vector3d translation = new Vector3d(0.0f, 0.0f, translationStep) ;
    	   translation = new MatrixRotationY((float)(m_cameraAngleY/180.0f*Math.PI)).transform(translation) ;
    	   m_cameraPosition = Vector3d.add(m_cameraPosition, translation) ;    	   
       }
       else if(e.getKeyCode() == KeyEvent.VK_LEFT  || e.getKeyChar() == 'a')
       {
    	   Vector3d translation = new Vector3d(0.0f, 0.0f, -translationStep) ;
    	   translation = new MatrixRotationY((float)(m_cameraAngleY/180.0f*Math.PI+Math.PI/2.0)).transform(translation) ;
    	   m_cameraPosition = Vector3d.add(m_cameraPosition, translation) ;
       }
       else if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyChar() == 'd')
       {
    	   Vector3d translation = new Vector3d(0.0f, 0.0f, -translationStep) ;
    	   translation = new MatrixRotationY((float)(m_cameraAngleY/180.0f*Math.PI-Math.PI/2.0)).transform(translation) ;
    	   m_cameraPosition = Vector3d.add(m_cameraPosition, translation) ;
       }
   }

	@Override
   public void keyReleased(KeyEvent e) 
   {
   }

	@Override
   public void keyTyped(KeyEvent e) 
   {
   }

	@Override
	public void mouseDragged(MouseEvent e) 
	{
		m_cameraAngleY += -(e.getX()-m_lastMouseX)*rotationAngle ;
		m_cameraAngleX += -(e.getY()-m_lastMouseY)*rotationAngle ;
		
		m_lastMouseX = e.getX() ;
		m_lastMouseY = e.getY() ;
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) 
	{
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		m_lastMouseX = e.getX() ;
		m_lastMouseY = e.getY() ;
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
	}

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

  
}
