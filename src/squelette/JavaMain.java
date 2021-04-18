package squelette;

//import com.jogamp.opengl.GLCanvas;
import com.jogamp.opengl.awt.GLCanvas;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaMain implements Runnable 
{
    static Thread displayT = new Thread(new JavaMain());
    static boolean bQuit = false;

    public static void main(String[] args) {
        displayT.start();
    }

    public void run() {
        Frame frame = new Frame("Compilation pour l'image");
        GLCanvas canvas = new GLCanvas();
        canvas.addGLEventListener(new JavaRenderer(canvas));
        frame.add(canvas);
        frame.setSize(640, 480);
        //frame.setUndecorated(false);
        //frame.setUndecorated(true); // fullscreen
        int size = frame.getExtendedState();
        //size |= Frame.MAXIMIZED_BOTH;
        frame.setExtendedState(size);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                bQuit = true;
                System.exit(0);
            }
        });
        frame.setVisible(true);
        canvas.requestFocus();
        
        while( !bQuit ) {
            canvas.display();
        }
    }
}
