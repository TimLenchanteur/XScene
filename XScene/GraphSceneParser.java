package XScene;
// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g 2019-12-30 17:18:22


import Lib3d.* ;
//import Lib3d.GlSceneGraph.*;
import Lib3d.SceneGraph.*;
import Lib3d.Loader.*;
import java.io.IOException;

import java.util.Vector;
import javafx.util.Pair;
	

import org.antlr.runtime.*;
import java.util.ArrayList;

/*
 * Parser generer par antlr
 * */
public class GraphSceneParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "COMMENT", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "INT", "EXPONENT", "FLOAT", "'-'", "'name'", "':'", "'type'", "'rotation'", "'translation'", "'scale'", "'angle'", "'axeX'", "'axeY'", "'axeZ'", "'anim'", "'x'", "'y'", "'z'", "'ratio'", "'ratioXYZ'", "'('", "','", "')'", "'Transform'", "'Group'", "'Cone'", "'Cube'", "'Cylinder'", "'Sphere'", "'Teapot'", "'Tetrahedron'", "'Torus'", "'Defined'", "'base'", "'height'", "'slices'", "'stack'", "'size'", "'top'", "'rad'", "'inRad'", "'outRad'", "'sides'", "'rings'", "'shape'", "'mat'", "'<define'", "'/>'", "'objectFile'", "'<vertex'", "'<normal'", "'<txtCoord'", "'<face'", "'s1'", "'/'", "'s2'", "'s3'", "'colorTypeINT'", "'Ka'", "'Kd'", "'Ks'", "'shine'", "'textFile'", "'textX'", "'textY'", "'tr'", "'rot'", "'sc'", "'stop'", "'start'", "'time'", "'ang'", "'<node'", "'>'", "'</node>'", "'<object'", "'<getSbtree'", "'<scene'", "'</scene>'"
    };
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int ID=4;
    public static final int COMMENT=5;
    public static final int WS=6;
    public static final int ESC_SEQ=7;
    public static final int STRING=8;
    public static final int HEX_DIGIT=9;
    public static final int UNICODE_ESC=10;
    public static final int OCTAL_ESC=11;
    public static final int INT=12;
    public static final int EXPONENT=13;
    public static final int FLOAT=14;

    // delegates
    // delegators


        public GraphSceneParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GraphSceneParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GraphSceneParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g"; }


    	private Group gS = new Lib3d.GlSceneGraph.Group();
    	public String sc_name = "Empty";
    	protected Vector2d textureScale = new Vector2d(1.0f, 1.0f) ;
    	protected String textureFile = null ;
    	Color wh = new Color(1,1,1); 
    	public Material white = new Material("white", wh, wh, wh, 1.0f,1.0f, textureScale, textureFile);
    	java.util.HashMap<String, Material> m_materials= new java.util.HashMap<String, Material>() ;
    	java.util.HashMap<String, Node> m_subTree= new java.util.HashMap<String, Node>() ;
    	public MaterialLib materialLib = new MaterialLib() ;
    	
    	java.util.HashMap<String, Pair<Vector3d, Pair<Float, Float>>> m_animTr= new java.util.HashMap<String, Pair<Vector3d, Pair<Float, Float>>>() ;
    	java.util.HashMap<String, Pair<Float, Pair<Float, Float>>> m_animRot= new java.util.HashMap<String, Pair<Float, Pair<Float, Float>>>() ;
    	java.util.HashMap<String, Pair<Float, Pair<Float, Float>>> m_animSc= new java.util.HashMap<String, Pair<Float, Pair<Float, Float>>>() ;
    	java.util.HashMap<String, Object3d> m_shapes= new java.util.HashMap<String, Object3d>() ;


    public static class constante_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "constante"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:90:1: constante : ( '-' )? ( INT | FLOAT ) ;
    public final GraphSceneParser.constante_return constante() throws RecognitionException {
        GraphSceneParser.constante_return retval = new GraphSceneParser.constante_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:90:12: ( ( '-' )? ( INT | FLOAT ) )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:90:14: ( '-' )? ( INT | FLOAT )
            {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:90:14: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:90:14: '-'
                    {
                    match(input,15,FOLLOW_15_in_constante549); 

                    }
                    break;

            }

            if ( input.LA(1)==INT||input.LA(1)==FLOAT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constante"

    public static class optName_return extends ParserRuleReturnScope {
        public String val;
    };

    // $ANTLR start "optName"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:93:1: optName returns [String val] : 'name' ':' n= STRING ;
    public final GraphSceneParser.optName_return optName() throws RecognitionException {
        GraphSceneParser.optName_return retval = new GraphSceneParser.optName_return();
        retval.start = input.LT(1);

        Token n=null;

        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:93:30: ( 'name' ':' n= STRING )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:93:31: 'name' ':' n= STRING
            {
            match(input,16,FOLLOW_16_in_optName568); 
            match(input,17,FOLLOW_17_in_optName570); 
            n=(Token)match(input,STRING,FOLLOW_STRING_in_optName576); 
             retval.val = (n!=null?n.getText():null).replace("\"", "");

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optName"


    // $ANTLR start "optTransfo"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:96:1: optTransfo returns [Group val] : 'type' ':' ( 'rotation' r= optRot | 'translation' ts= optTrans | 'scale' sc= optSc ) ;
    public final Group optTransfo() throws RecognitionException {
        Group val = null;

        Lib3d.GlSceneGraph.Rotation r = null;

        Lib3d.GlSceneGraph.Translation ts = null;

        Lib3d.GlSceneGraph.Scale sc = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:97:2: ( 'type' ':' ( 'rotation' r= optRot | 'translation' ts= optTrans | 'scale' sc= optSc ) )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:97:4: 'type' ':' ( 'rotation' r= optRot | 'translation' ts= optTrans | 'scale' sc= optSc )
            {
            match(input,18,FOLLOW_18_in_optTransfo593); 
            match(input,17,FOLLOW_17_in_optTransfo595); 
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:97:15: ( 'rotation' r= optRot | 'translation' ts= optTrans | 'scale' sc= optSc )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:97:16: 'rotation' r= optRot
                    {
                    match(input,19,FOLLOW_19_in_optTransfo598); 
                    pushFollow(FOLLOW_optRot_in_optTransfo604);
                    r=optRot();

                    state._fsp--;

                    val = r;

                    }
                    break;
                case 2 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:98:5: 'translation' ts= optTrans
                    {
                    match(input,20,FOLLOW_20_in_optTransfo612); 
                    pushFollow(FOLLOW_optTrans_in_optTransfo618);
                    ts=optTrans();

                    state._fsp--;

                    val = ts;

                    }
                    break;
                case 3 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:99:5: 'scale' sc= optSc
                    {
                    match(input,21,FOLLOW_21_in_optTransfo625); 
                    pushFollow(FOLLOW_optSc_in_optTransfo631);
                    sc=optSc();

                    state._fsp--;

                    val = sc;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optTransfo"


    // $ANTLR start "optRot"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:101:1: optRot returns [Lib3d.GlSceneGraph.Rotation val] : 'angle' ':' a= constante ( 'axeX' ':' x= constante )? ( 'axeY' ':' y= constante )? ( 'axeZ' ':' z= constante )? ( 'anim' ':' anim= ID )? ;
    public final Lib3d.GlSceneGraph.Rotation optRot() throws RecognitionException {
        Lib3d.GlSceneGraph.Rotation val = null;

        Token anim=null;
        GraphSceneParser.constante_return a = null;

        GraphSceneParser.constante_return x = null;

        GraphSceneParser.constante_return y = null;

        GraphSceneParser.constante_return z = null;



        		float t_angle  = 20;
        		float t_x = 1.0f;
        		float t_y = 0.0f;  
        		float t_z = 0.0f; 
        		boolean x_def = false;
        		String animr = ""; 
        		
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:110:2: ( 'angle' ':' a= constante ( 'axeX' ':' x= constante )? ( 'axeY' ':' y= constante )? ( 'axeZ' ':' z= constante )? ( 'anim' ':' anim= ID )? )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:110:4: 'angle' ':' a= constante ( 'axeX' ':' x= constante )? ( 'axeY' ':' y= constante )? ( 'axeZ' ':' z= constante )? ( 'anim' ':' anim= ID )?
            {
            match(input,22,FOLLOW_22_in_optRot653); 
            match(input,17,FOLLOW_17_in_optRot655); 
            pushFollow(FOLLOW_constante_in_optRot661);
            a=constante();

            state._fsp--;

            t_angle = Float.valueOf((a!=null?input.toString(a.start,a.stop):null));
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:111:4: ( 'axeX' ':' x= constante )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:111:5: 'axeX' ':' x= constante
                    {
                    match(input,23,FOLLOW_23_in_optRot669); 
                    match(input,17,FOLLOW_17_in_optRot671); 
                    pushFollow(FOLLOW_constante_in_optRot678);
                    x=constante();

                    state._fsp--;

                    t_x = Float.valueOf((x!=null?input.toString(x.start,x.stop):null)); x_def = true;

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:112:4: ( 'axeY' ':' y= constante )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:112:5: 'axeY' ':' y= constante
                    {
                    match(input,24,FOLLOW_24_in_optRot688); 
                    match(input,17,FOLLOW_17_in_optRot690); 
                    pushFollow(FOLLOW_constante_in_optRot696);
                    y=constante();

                    state._fsp--;

                    t_y = Float.valueOf((y!=null?input.toString(y.start,y.stop):null));if(!x_def){t_x = 0.0f;}

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:113:4: ( 'axeZ' ':' z= constante )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:113:5: 'axeZ' ':' z= constante
                    {
                    match(input,25,FOLLOW_25_in_optRot706); 
                    match(input,17,FOLLOW_17_in_optRot708); 
                    pushFollow(FOLLOW_constante_in_optRot714);
                    z=constante();

                    state._fsp--;

                    t_z = Float.valueOf((z!=null?input.toString(z.start,z.stop):null));if(!x_def){t_x = 0.0f;}

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:114:4: ( 'anim' ':' anim= ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:114:5: 'anim' ':' anim= ID
                    {
                    match(input,26,FOLLOW_26_in_optRot723); 
                    match(input,17,FOLLOW_17_in_optRot725); 
                    anim=(Token)match(input,ID,FOLLOW_ID_in_optRot731); 
                    animr =  (anim!=null?anim.getText():null);

                    }
                    break;

            }

            	
            		Vector3d t_axis = new Vector3d(t_x,t_y,t_z);	
            		val = new Lib3d.GlSceneGraph.Rotation(t_axis, t_angle);
            		if(!animr.isEmpty()){
            			if(m_animRot.containsKey(animr)){
            				Pair<Float, Pair<Float, Float>> pR =m_animRot.get(animr);
                       			val.setAnim(pR.getKey() ,pR.getValue().getKey() ,pR.getValue().getValue());
                    		} 
                    		else { 
                    	        	String str = "l'identifiant "+ animr+" n'est pas défini dans cette partie du code";
                        			System.out.println(str); 
                    		}  
                    	}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optRot"


    // $ANTLR start "optTrans"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:130:1: optTrans returns [Lib3d.GlSceneGraph.Translation val] : ( 'x' ':' x= constante )? ( 'y' ':' y= constante )? ( 'z' ':' z= constante )? ( 'anim' ':' anim= ID )? ;
    public final Lib3d.GlSceneGraph.Translation optTrans() throws RecognitionException {
        Lib3d.GlSceneGraph.Translation val = null;

        Token anim=null;
        GraphSceneParser.constante_return x = null;

        GraphSceneParser.constante_return y = null;

        GraphSceneParser.constante_return z = null;



        		float t_x = 0.0f;
        		float t_y = 0.0f;  
        		float t_z = 0.0f;
        		String animt = ""; 
        		
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:137:2: ( ( 'x' ':' x= constante )? ( 'y' ':' y= constante )? ( 'z' ':' z= constante )? ( 'anim' ':' anim= ID )? )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:137:4: ( 'x' ':' x= constante )? ( 'y' ':' y= constante )? ( 'z' ':' z= constante )? ( 'anim' ':' anim= ID )?
            {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:137:4: ( 'x' ':' x= constante )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:137:5: 'x' ':' x= constante
                    {
                    match(input,27,FOLLOW_27_in_optTrans757); 
                    match(input,17,FOLLOW_17_in_optTrans759); 
                    pushFollow(FOLLOW_constante_in_optTrans765);
                    x=constante();

                    state._fsp--;

                    t_x = Float.valueOf((x!=null?input.toString(x.start,x.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:138:4: ( 'y' ':' y= constante )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:138:5: 'y' ':' y= constante
                    {
                    match(input,28,FOLLOW_28_in_optTrans775); 
                    match(input,17,FOLLOW_17_in_optTrans777); 
                    pushFollow(FOLLOW_constante_in_optTrans783);
                    y=constante();

                    state._fsp--;

                    t_y = Float.valueOf((y!=null?input.toString(y.start,y.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:139:4: ( 'z' ':' z= constante )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:139:5: 'z' ':' z= constante
                    {
                    match(input,29,FOLLOW_29_in_optTrans793); 
                    match(input,17,FOLLOW_17_in_optTrans795); 
                    pushFollow(FOLLOW_constante_in_optTrans801);
                    z=constante();

                    state._fsp--;

                    t_z = Float.valueOf((z!=null?input.toString(z.start,z.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:140:4: ( 'anim' ':' anim= ID )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:140:5: 'anim' ':' anim= ID
                    {
                    match(input,26,FOLLOW_26_in_optTrans810); 
                    match(input,17,FOLLOW_17_in_optTrans812); 
                    anim=(Token)match(input,ID,FOLLOW_ID_in_optTrans818); 
                    animt = (anim!=null?anim.getText():null); 

                    }
                    break;

            }

            	
            		Vector3d t_axis = new Vector3d(t_x,t_y,t_z);	
            		val = new Lib3d.GlSceneGraph.Translation(t_axis);
            		if(!animt.isEmpty()){
            			if(m_animTr.containsKey(animt)) { 
            				Pair<Vector3d, Pair<Float, Float>> pT = m_animTr.get(animt);
                       			val.setAnim(pT.getKey() , pT.getValue().getKey() ,pT.getValue().getValue());
                    		} 
                    		else { 
                    			String str = "l'identifiant "+ animt +" n'est pas défini dans cette partie du code";
                        			System.out.println(str); 
                    		} 
                    	}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optTrans"


    // $ANTLR start "optSc"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:157:1: optSc returns [Lib3d.GlSceneGraph.Scale val] : ( 'ratio' ':' c= constante | 'ratioXYZ' ':' '(' x= constante ',' y= constante ',' z= constante ')' )? ( 'anim' ':' anim= ID )? ;
    public final Lib3d.GlSceneGraph.Scale optSc() throws RecognitionException {
        Lib3d.GlSceneGraph.Scale val = null;

        Token anim=null;
        GraphSceneParser.constante_return c = null;

        GraphSceneParser.constante_return x = null;

        GraphSceneParser.constante_return y = null;

        GraphSceneParser.constante_return z = null;



        		float t_x = 0.0f;
        		float t_y = 0.0f;  
        		float t_z = 0.0f; 
        		String anims = "";
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:164:2: ( ( 'ratio' ':' c= constante | 'ratioXYZ' ':' '(' x= constante ',' y= constante ',' z= constante ')' )? ( 'anim' ':' anim= ID )? )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:164:4: ( 'ratio' ':' c= constante | 'ratioXYZ' ':' '(' x= constante ',' y= constante ',' z= constante ')' )? ( 'anim' ':' anim= ID )?
            {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:164:4: ( 'ratio' ':' c= constante | 'ratioXYZ' ':' '(' x= constante ',' y= constante ',' z= constante ')' )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==31) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:164:5: 'ratio' ':' c= constante
                    {
                    match(input,30,FOLLOW_30_in_optSc848); 
                    match(input,17,FOLLOW_17_in_optSc850); 
                    pushFollow(FOLLOW_constante_in_optSc856);
                    c=constante();

                    state._fsp--;

                    	t_x = Float.valueOf((c!=null?input.toString(c.start,c.stop):null));
                    					t_y = Float.valueOf((c!=null?input.toString(c.start,c.stop):null));
                    					t_z = Float.valueOf((c!=null?input.toString(c.start,c.stop):null));

                    }
                    break;
                case 2 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:167:3: 'ratioXYZ' ':' '(' x= constante ',' y= constante ',' z= constante ')'
                    {
                    match(input,31,FOLLOW_31_in_optSc862); 
                    match(input,17,FOLLOW_17_in_optSc864); 
                    match(input,32,FOLLOW_32_in_optSc867); 
                    pushFollow(FOLLOW_constante_in_optSc873);
                    x=constante();

                    state._fsp--;

                    t_x = Float.valueOf((x!=null?input.toString(x.start,x.stop):null));
                    match(input,33,FOLLOW_33_in_optSc876); 
                    pushFollow(FOLLOW_constante_in_optSc890);
                    y=constante();

                    state._fsp--;

                    t_y = Float.valueOf((y!=null?input.toString(y.start,y.stop):null));
                    match(input,33,FOLLOW_33_in_optSc893); 
                    pushFollow(FOLLOW_constante_in_optSc908);
                    z=constante();

                    state._fsp--;

                    t_z = Float.valueOf((z!=null?input.toString(z.start,z.stop):null));
                    match(input,34,FOLLOW_34_in_optSc911); 

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:171:4: ( 'anim' ':' anim= ID )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:171:5: 'anim' ':' anim= ID
                    {
                    match(input,26,FOLLOW_26_in_optSc920); 
                    match(input,17,FOLLOW_17_in_optSc922); 
                    anim=(Token)match(input,ID,FOLLOW_ID_in_optSc928); 
                     anims = (anim!=null?anim.getText():null); 

                    }
                    break;

            }

            	
            		Vector3d t_axis = new Vector3d(t_x,t_y,t_z);	
            		val = new Lib3d.GlSceneGraph.Scale(t_axis);
            		if(!anims.isEmpty()){
            			if(m_animSc.containsKey(anims)) { 
            				Pair<Float, Pair<Float, Float>> pS = m_animSc.get(anims);
                       			val.setAnim(pS.getKey() , pS.getValue().getKey() ,pS.getValue().getValue());
                    		} 
                    		else { 
                    			String str = "l'identifiant "+ anims +" n'est pas défini dans cette partie du code";
                        			System.out.println(str); 
                    		}  
                    	}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optSc"


    // $ANTLR start "optType"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:190:1: optType returns [Group val] : 'type' ':' ( 'Transform' t= optTransfo | 'Group' ) ;
    public final Group optType() throws RecognitionException {
        Group val = null;

        Group t = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:190:28: ( 'type' ':' ( 'Transform' t= optTransfo | 'Group' ) )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:190:30: 'type' ':' ( 'Transform' t= optTransfo | 'Group' )
            {
            match(input,18,FOLLOW_18_in_optType953); 
            match(input,17,FOLLOW_17_in_optType955); 
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:190:41: ( 'Transform' t= optTransfo | 'Group' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            else if ( (LA13_0==36) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:190:42: 'Transform' t= optTransfo
                    {
                    match(input,35,FOLLOW_35_in_optType958); 
                    pushFollow(FOLLOW_optTransfo_in_optType964);
                    t=optTransfo();

                    state._fsp--;

                    val = t;

                    }
                    break;
                case 2 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:190:87: 'Group'
                    {
                    match(input,36,FOLLOW_36_in_optType969); 
                    val = new Lib3d.GlSceneGraph.Group();

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optType"


    // $ANTLR start "listShape"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:193:1: listShape returns [Geometry val] : ( 'Cone' co= optCone | 'Cube' cb= optCube | 'Cylinder' cyl= optCyl | 'Sphere' sph= optSph | 'Teapot' tpt= optTpt | 'Tetrahedron' | 'Torus' tr= optTrs | 'Defined' def= optDef );
    public final Geometry listShape() throws RecognitionException {
        Geometry val = null;

        Lib3d.GlSceneGraph.Cone co = null;

        Lib3d.GlSceneGraph.Cube cb = null;

        Lib3d.GlSceneGraph.Cylinder cyl = null;

        Lib3d.GlSceneGraph.Sphere sph = null;

        Lib3d.GlSceneGraph.Teapot tpt = null;

        Lib3d.GlSceneGraph.Torus tr = null;

        Lib3d.GlSceneGraph.Geometry def = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:194:2: ( 'Cone' co= optCone | 'Cube' cb= optCube | 'Cylinder' cyl= optCyl | 'Sphere' sph= optSph | 'Teapot' tpt= optTpt | 'Tetrahedron' | 'Torus' tr= optTrs | 'Defined' def= optDef )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt14=1;
                }
                break;
            case 38:
                {
                alt14=2;
                }
                break;
            case 39:
                {
                alt14=3;
                }
                break;
            case 40:
                {
                alt14=4;
                }
                break;
            case 41:
                {
                alt14=5;
                }
                break;
            case 42:
                {
                alt14=6;
                }
                break;
            case 43:
                {
                alt14=7;
                }
                break;
            case 44:
                {
                alt14=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:194:5: 'Cone' co= optCone
                    {
                    match(input,37,FOLLOW_37_in_listShape989); 
                    pushFollow(FOLLOW_optCone_in_listShape993);
                    co=optCone();

                    state._fsp--;

                    val = co; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:195:4: 'Cube' cb= optCube
                    {
                    match(input,38,FOLLOW_38_in_listShape999); 
                    pushFollow(FOLLOW_optCube_in_listShape1003);
                    cb=optCube();

                    state._fsp--;

                    val = cb;

                    }
                    break;
                case 3 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:196:4: 'Cylinder' cyl= optCyl
                    {
                    match(input,39,FOLLOW_39_in_listShape1009); 
                    pushFollow(FOLLOW_optCyl_in_listShape1015);
                    cyl=optCyl();

                    state._fsp--;

                    val = cyl;

                    }
                    break;
                case 4 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:197:4: 'Sphere' sph= optSph
                    {
                    match(input,40,FOLLOW_40_in_listShape1021); 
                    pushFollow(FOLLOW_optSph_in_listShape1025);
                    sph=optSph();

                    state._fsp--;

                    val = sph;

                    }
                    break;
                case 5 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:198:4: 'Teapot' tpt= optTpt
                    {
                    match(input,41,FOLLOW_41_in_listShape1031); 
                    pushFollow(FOLLOW_optTpt_in_listShape1035);
                    tpt=optTpt();

                    state._fsp--;

                    val = tpt;

                    }
                    break;
                case 6 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:199:4: 'Tetrahedron'
                    {
                    match(input,42,FOLLOW_42_in_listShape1041); 
                    val = new Lib3d.GlSceneGraph.Tetrahedron();

                    }
                    break;
                case 7 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:200:4: 'Torus' tr= optTrs
                    {
                    match(input,43,FOLLOW_43_in_listShape1047); 
                    pushFollow(FOLLOW_optTrs_in_listShape1052);
                    tr=optTrs();

                    state._fsp--;

                    val = tr;

                    }
                    break;
                case 8 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:201:4: 'Defined' def= optDef
                    {
                    match(input,44,FOLLOW_44_in_listShape1058); 
                    pushFollow(FOLLOW_optDef_in_listShape1064);
                    def=optDef();

                    state._fsp--;

                    val = def;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "listShape"


    // $ANTLR start "optDef"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:203:1: optDef returns [Lib3d.GlSceneGraph.Geometry val] : 'name' ':' id= ID ;
    public final Lib3d.GlSceneGraph.Geometry optDef() throws RecognitionException {
        Lib3d.GlSceneGraph.Geometry val = null;

        Token id=null;

        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:203:50: ( 'name' ':' id= ID )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:203:52: 'name' ':' id= ID
            {
            match(input,16,FOLLOW_16_in_optDef1081); 
            match(input,17,FOLLOW_17_in_optDef1083); 
            id=(Token)match(input,ID,FOLLOW_ID_in_optDef1089); 

            			if(m_shapes.containsKey((id!=null?id.getText():null))){ 
            				Object3d o = m_shapes.get((id!=null?id.getText():null));
                       			val = new Lib3d.GlSceneGraph.Geometry(o,materialLib);
                    		} 
                    		else { 
                    			String str = "l'identifiant "+ id +" n'est pas défini dans cette partie du code";
                        			System.out.println(str); 
                    		} 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optDef"


    // $ANTLR start "optCone"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:213:1: optCone returns [Lib3d.GlSceneGraph.Cone val] : ( 'base' ':' b= constante )? ( 'height' ':' h= constante )? ( 'slices' ':' sl= INT )? ( 'stack' ':' stck= INT )? ;
    public final Lib3d.GlSceneGraph.Cone optCone() throws RecognitionException {
        Lib3d.GlSceneGraph.Cone val = null;

        Token sl=null;
        Token stck=null;
        GraphSceneParser.constante_return b = null;

        GraphSceneParser.constante_return h = null;



        		float t_base  = 25.0f;
        		float t_hght = 25.0f;
        		int t_slice = 100;  
        		int t_stack = 20;
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:220:2: ( ( 'base' ':' b= constante )? ( 'height' ':' h= constante )? ( 'slices' ':' sl= INT )? ( 'stack' ':' stck= INT )? )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:220:4: ( 'base' ':' b= constante )? ( 'height' ':' h= constante )? ( 'slices' ':' sl= INT )? ( 'stack' ':' stck= INT )?
            {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:220:4: ( 'base' ':' b= constante )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:220:5: 'base' ':' b= constante
                    {
                    match(input,45,FOLLOW_45_in_optCone1111); 
                    match(input,17,FOLLOW_17_in_optCone1113); 
                    pushFollow(FOLLOW_constante_in_optCone1117);
                    b=constante();

                    state._fsp--;

                    t_base = Float.valueOf((b!=null?input.toString(b.start,b.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:221:4: ( 'height' ':' h= constante )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:221:5: 'height' ':' h= constante
                    {
                    match(input,46,FOLLOW_46_in_optCone1127); 
                    match(input,17,FOLLOW_17_in_optCone1128); 
                    pushFollow(FOLLOW_constante_in_optCone1132);
                    h=constante();

                    state._fsp--;

                    t_hght = Float.valueOf((h!=null?input.toString(h.start,h.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:222:4: ( 'slices' ':' sl= INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:222:5: 'slices' ':' sl= INT
                    {
                    match(input,47,FOLLOW_47_in_optCone1142); 
                    match(input,17,FOLLOW_17_in_optCone1143); 
                    sl=(Token)match(input,INT,FOLLOW_INT_in_optCone1147); 
                    t_slice = Integer.valueOf((sl!=null?sl.getText():null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:223:4: ( 'stack' ':' stck= INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:223:5: 'stack' ':' stck= INT
                    {
                    match(input,48,FOLLOW_48_in_optCone1157); 
                    match(input,17,FOLLOW_17_in_optCone1158); 
                    stck=(Token)match(input,INT,FOLLOW_INT_in_optCone1162); 
                    t_stack = Integer.valueOf((stck!=null?stck.getText():null));

                    }
                    break;

            }

            	 
            		val = new Lib3d.GlSceneGraph.Cone(t_base, t_hght, t_slice, t_stack);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optCone"


    // $ANTLR start "optCube"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:228:1: optCube returns [Lib3d.GlSceneGraph.Cube val] : ( 'size' ':' s= constante )? ;
    public final Lib3d.GlSceneGraph.Cube optCube() throws RecognitionException {
        Lib3d.GlSceneGraph.Cube val = null;

        GraphSceneParser.constante_return s = null;



        		float t_size = 50.0f;
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:232:2: ( ( 'size' ':' s= constante )? )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:232:4: ( 'size' ':' s= constante )?
            {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:232:4: ( 'size' ':' s= constante )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==49) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:232:5: 'size' ':' s= constante
                    {
                    match(input,49,FOLLOW_49_in_optCube1187); 
                    match(input,17,FOLLOW_17_in_optCube1189); 
                    pushFollow(FOLLOW_constante_in_optCube1195);
                    s=constante();

                    state._fsp--;

                    t_size = Float.valueOf((s!=null?input.toString(s.start,s.stop):null));

                    }
                    break;

            }

            	
            		val = new Lib3d.GlSceneGraph.Cube(t_size);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optCube"


    // $ANTLR start "optCyl"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:238:1: optCyl returns [Lib3d.GlSceneGraph.Cylinder val] : ( 'base' ':' b= constante )? ( 'top' ':' t= constante )? ( 'height' ':' h= constante )? ( 'slices' ':' sl= INT )? ( 'stack' ':' stck= INT )? ;
    public final Lib3d.GlSceneGraph.Cylinder optCyl() throws RecognitionException {
        Lib3d.GlSceneGraph.Cylinder val = null;

        Token sl=null;
        Token stck=null;
        GraphSceneParser.constante_return b = null;

        GraphSceneParser.constante_return t = null;

        GraphSceneParser.constante_return h = null;



        		float t_base  = 50.0f;
        		float t_hght = 50.0f;
        		float t_top = 50.0f;
        		int t_slice = 100;  
        		int t_stack = 20;
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:246:2: ( ( 'base' ':' b= constante )? ( 'top' ':' t= constante )? ( 'height' ':' h= constante )? ( 'slices' ':' sl= INT )? ( 'stack' ':' stck= INT )? )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:246:4: ( 'base' ':' b= constante )? ( 'top' ':' t= constante )? ( 'height' ':' h= constante )? ( 'slices' ':' sl= INT )? ( 'stack' ':' stck= INT )?
            {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:246:4: ( 'base' ':' b= constante )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:246:5: 'base' ':' b= constante
                    {
                    match(input,45,FOLLOW_45_in_optCyl1223); 
                    match(input,17,FOLLOW_17_in_optCyl1225); 
                    pushFollow(FOLLOW_constante_in_optCyl1231);
                    b=constante();

                    state._fsp--;

                    t_base = Float.valueOf((b!=null?input.toString(b.start,b.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:247:4: ( 'top' ':' t= constante )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:247:5: 'top' ':' t= constante
                    {
                    match(input,50,FOLLOW_50_in_optCyl1241); 
                    match(input,17,FOLLOW_17_in_optCyl1243); 
                    pushFollow(FOLLOW_constante_in_optCyl1249);
                    t=constante();

                    state._fsp--;

                    t_top = Float.valueOf((t!=null?input.toString(t.start,t.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:248:4: ( 'height' ':' h= constante )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:248:5: 'height' ':' h= constante
                    {
                    match(input,46,FOLLOW_46_in_optCyl1259); 
                    match(input,17,FOLLOW_17_in_optCyl1260); 
                    pushFollow(FOLLOW_constante_in_optCyl1266);
                    h=constante();

                    state._fsp--;

                    t_hght = Float.valueOf((h!=null?input.toString(h.start,h.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:249:4: ( 'slices' ':' sl= INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:249:5: 'slices' ':' sl= INT
                    {
                    match(input,47,FOLLOW_47_in_optCyl1275); 
                    match(input,17,FOLLOW_17_in_optCyl1276); 
                    sl=(Token)match(input,INT,FOLLOW_INT_in_optCyl1282); 
                    t_slice = Integer.valueOf((sl!=null?sl.getText():null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:250:4: ( 'stack' ':' stck= INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:250:5: 'stack' ':' stck= INT
                    {
                    match(input,48,FOLLOW_48_in_optCyl1292); 
                    match(input,17,FOLLOW_17_in_optCyl1293); 
                    stck=(Token)match(input,INT,FOLLOW_INT_in_optCyl1299); 
                    t_stack = Integer.valueOf((stck!=null?stck.getText():null));

                    }
                    break;

            }

            	
            		val = new Lib3d.GlSceneGraph.Cylinder(t_base, t_top, t_hght, t_slice, t_stack);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optCyl"


    // $ANTLR start "optSph"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:256:1: optSph returns [Lib3d.GlSceneGraph.Sphere val] : ( 'rad' ':' r= constante )? ( 'slices' ':' sl= INT )? ( 'stack' ':' stck= INT )? ;
    public final Lib3d.GlSceneGraph.Sphere optSph() throws RecognitionException {
        Lib3d.GlSceneGraph.Sphere val = null;

        Token sl=null;
        Token stck=null;
        GraphSceneParser.constante_return r = null;



        		float t_rad  = 50.0f;
        		int t_slice = 100;					  
        		int t_stack = 100; 
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:262:2: ( ( 'rad' ':' r= constante )? ( 'slices' ':' sl= INT )? ( 'stack' ':' stck= INT )? )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:262:4: ( 'rad' ':' r= constante )? ( 'slices' ':' sl= INT )? ( 'stack' ':' stck= INT )?
            {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:262:4: ( 'rad' ':' r= constante )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:262:5: 'rad' ':' r= constante
                    {
                    match(input,51,FOLLOW_51_in_optSph1326); 
                    match(input,17,FOLLOW_17_in_optSph1328); 
                    pushFollow(FOLLOW_constante_in_optSph1333);
                    r=constante();

                    state._fsp--;

                    t_rad = Float.valueOf((r!=null?input.toString(r.start,r.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:263:4: ( 'slices' ':' sl= INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:263:5: 'slices' ':' sl= INT
                    {
                    match(input,47,FOLLOW_47_in_optSph1343); 
                    match(input,17,FOLLOW_17_in_optSph1344); 
                    sl=(Token)match(input,INT,FOLLOW_INT_in_optSph1350); 
                    t_slice = Integer.valueOf((sl!=null?sl.getText():null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:264:4: ( 'stack' ':' stck= INT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:264:5: 'stack' ':' stck= INT
                    {
                    match(input,48,FOLLOW_48_in_optSph1360); 
                    match(input,17,FOLLOW_17_in_optSph1361); 
                    stck=(Token)match(input,INT,FOLLOW_INT_in_optSph1367); 
                    t_stack = Integer.valueOf((stck!=null?stck.getText():null));

                    }
                    break;

            }

            	
            		val = new Lib3d.GlSceneGraph.Sphere(t_rad, t_slice, t_stack);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optSph"


    // $ANTLR start "optTpt"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:269:1: optTpt returns [Lib3d.GlSceneGraph.Teapot val] : ( 'size' ':' s= constante )? ;
    public final Lib3d.GlSceneGraph.Teapot optTpt() throws RecognitionException {
        Lib3d.GlSceneGraph.Teapot val = null;

        GraphSceneParser.constante_return s = null;



        		float t_size = 50.0f;
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:273:2: ( ( 'size' ':' s= constante )? )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:273:4: ( 'size' ':' s= constante )?
            {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:273:4: ( 'size' ':' s= constante )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:273:5: 'size' ':' s= constante
                    {
                    match(input,49,FOLLOW_49_in_optTpt1394); 
                    match(input,17,FOLLOW_17_in_optTpt1396); 
                    pushFollow(FOLLOW_constante_in_optTpt1401);
                    s=constante();

                    state._fsp--;

                    t_size = Float.valueOf((s!=null?input.toString(s.start,s.stop):null));

                    }
                    break;

            }

            	
            		val = new Lib3d.GlSceneGraph.Teapot(t_size);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optTpt"


    // $ANTLR start "optTrs"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:279:1: optTrs returns [Lib3d.GlSceneGraph.Torus val] : ( 'inRad' ':' ir= constante )? ( 'outRad' ':' or= constante )? ( 'sides' ':' s= INT )? ( 'rings' ':' r= INT )? ;
    public final Lib3d.GlSceneGraph.Torus optTrs() throws RecognitionException {
        Lib3d.GlSceneGraph.Torus val = null;

        Token s=null;
        Token r=null;
        GraphSceneParser.constante_return ir = null;

        GraphSceneParser.constante_return or = null;



        		float t_inrad  = 10.0f;
        		float t_outrad = 25.0f;
        		int t_sides = 100;					  
        		int t_rings = 15;
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:286:2: ( ( 'inRad' ':' ir= constante )? ( 'outRad' ':' or= constante )? ( 'sides' ':' s= INT )? ( 'rings' ':' r= INT )? )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:286:4: ( 'inRad' ':' ir= constante )? ( 'outRad' ':' or= constante )? ( 'sides' ':' s= INT )? ( 'rings' ':' r= INT )?
            {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:286:4: ( 'inRad' ':' ir= constante )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:286:5: 'inRad' ':' ir= constante
                    {
                    match(input,52,FOLLOW_52_in_optTrs1428); 
                    match(input,17,FOLLOW_17_in_optTrs1430); 
                    pushFollow(FOLLOW_constante_in_optTrs1436);
                    ir=constante();

                    state._fsp--;

                    t_inrad = Float.valueOf((ir!=null?input.toString(ir.start,ir.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:287:4: ( 'outRad' ':' or= constante )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:287:5: 'outRad' ':' or= constante
                    {
                    match(input,53,FOLLOW_53_in_optTrs1446); 
                    match(input,17,FOLLOW_17_in_optTrs1448); 
                    pushFollow(FOLLOW_constante_in_optTrs1454);
                    or=constante();

                    state._fsp--;

                    t_outrad = Float.valueOf((or!=null?input.toString(or.start,or.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:288:4: ( 'sides' ':' s= INT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:288:5: 'sides' ':' s= INT
                    {
                    match(input,54,FOLLOW_54_in_optTrs1464); 
                    match(input,17,FOLLOW_17_in_optTrs1466); 
                    s=(Token)match(input,INT,FOLLOW_INT_in_optTrs1471); 
                    t_sides = Integer.valueOf((s!=null?s.getText():null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:289:4: ( 'rings' ':' r= INT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:289:5: 'rings' ':' r= INT
                    {
                    match(input,55,FOLLOW_55_in_optTrs1481); 
                    match(input,17,FOLLOW_17_in_optTrs1483); 
                    r=(Token)match(input,INT,FOLLOW_INT_in_optTrs1489); 
                    t_rings = Integer.valueOf((r!=null?r.getText():null));

                    }
                    break;

            }

            	
            		val = new Lib3d.GlSceneGraph.Torus(t_inrad, t_outrad, t_sides, t_rings);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optTrs"


    // $ANTLR start "optShape"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:295:1: optShape returns [Geometry val] : 'shape' ':' s= listShape ( 'mat' ':' m= ID )? ;
    public final Geometry optShape() throws RecognitionException {
        Geometry val = null;

        Token m=null;
        Geometry s = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:296:2: ( 'shape' ':' s= listShape ( 'mat' ':' m= ID )? )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:296:4: 'shape' ':' s= listShape ( 'mat' ':' m= ID )?
            {
            match(input,56,FOLLOW_56_in_optShape1510); 
            match(input,17,FOLLOW_17_in_optShape1512); 
            pushFollow(FOLLOW_listShape_in_optShape1518);
            s=listShape();

            state._fsp--;

            val = s;
            			  	    val.setMaterial(white);
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:298:6: ( 'mat' ':' m= ID )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==57) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:298:7: 'mat' ':' m= ID
                    {
                    match(input,57,FOLLOW_57_in_optShape1527); 
                    match(input,17,FOLLOW_17_in_optShape1529); 
                    m=(Token)match(input,ID,FOLLOW_ID_in_optShape1535); 
                    if(m_materials.containsKey((m!=null?m.getText():null))) { 
                               					 val.setMaterial(m_materials.get((m!=null?m.getText():null)));
                            					} 
                           					else{
                                   					String str = "l'identifiant "+ (m!=null?m.getText():null)+" n'est pas défini dans cette partie du code";
                                					System.out.println(str); 
                            					}  ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "optShape"


    // $ANTLR start "defineOpt"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:307:1: defineOpt : '<define' ( 'mat' ':' getMaterial | 'anim' ':' getAnim | 'shape' getShape ) '/>' ;
    public final void defineOpt() throws RecognitionException {
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:308:2: ( '<define' ( 'mat' ':' getMaterial | 'anim' ':' getAnim | 'shape' getShape ) '/>' )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:308:4: '<define' ( 'mat' ':' getMaterial | 'anim' ':' getAnim | 'shape' getShape ) '/>'
            {
            match(input,58,FOLLOW_58_in_defineOpt1549); 
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:308:14: ( 'mat' ':' getMaterial | 'anim' ':' getAnim | 'shape' getShape )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt34=1;
                }
                break;
            case 26:
                {
                alt34=2;
                }
                break;
            case 56:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:308:15: 'mat' ':' getMaterial
                    {
                    match(input,57,FOLLOW_57_in_defineOpt1552); 
                    match(input,17,FOLLOW_17_in_defineOpt1554); 
                    pushFollow(FOLLOW_getMaterial_in_defineOpt1556);
                    getMaterial();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:308:39: 'anim' ':' getAnim
                    {
                    match(input,26,FOLLOW_26_in_defineOpt1560); 
                    match(input,17,FOLLOW_17_in_defineOpt1562); 
                    pushFollow(FOLLOW_getAnim_in_defineOpt1564);
                    getAnim();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:308:60: 'shape' getShape
                    {
                    match(input,56,FOLLOW_56_in_defineOpt1568); 
                    pushFollow(FOLLOW_getShape_in_defineOpt1570);
                    getShape();

                    state._fsp--;


                    }
                    break;

            }

            match(input,59,FOLLOW_59_in_defineOpt1574); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "defineOpt"


    // $ANTLR start "getShape"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:311:1: getShape : ( 'objectFile' ':' f= STRING | ':' id= ID (v= createVertex )+ (n= createNormal )* (t= createTextCoord )* (face= createFace )* ) ;
    public final void getShape() throws RecognitionException {
        Token f=null;
        Token id=null;
        Vector3d v = null;

        Vector3d n = null;

        Vector2d t = null;

        Vector<ArrayList<Integer>> face = null;



        		String ofile = null;
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:315:2: ( ( 'objectFile' ':' f= STRING | ':' id= ID (v= createVertex )+ (n= createNormal )* (t= createTextCoord )* (face= createFace )* ) )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:316:2: ( 'objectFile' ':' f= STRING | ':' id= ID (v= createVertex )+ (n= createNormal )* (t= createTextCoord )* (face= createFace )* )
            {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:316:2: ( 'objectFile' ':' f= STRING | ':' id= ID (v= createVertex )+ (n= createNormal )* (t= createTextCoord )* (face= createFace )* )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==60) ) {
                alt39=1;
            }
            else if ( (LA39_0==17) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:316:3: 'objectFile' ':' f= STRING
                    {
                    match(input,60,FOLLOW_60_in_getShape1593); 
                    match(input,17,FOLLOW_17_in_getShape1595); 
                    f=(Token)match(input,STRING,FOLLOW_STRING_in_getShape1600); 

                    					ofile = (f!=null?f.getText():null); 
                    					ofile = ofile.replace("\"", "");
                    					Vector<Object3d> objects = new Vector<Object3d>();
                    					String name = "";
                    					try
                    	   				{
                    						ObjLoader.load(ofile, objects) ;
                    						for(int cpt=0 ; cpt<objects.size() ; ++cpt)
                           						{
                           							name =  objects.get(cpt).getName();
                           							if(!m_shapes.containsKey(name)){
                           								m_shapes.put(name ,objects.get(cpt));
                           							}
                           							else{
                           								String str = "L'objet "+ name +" existe deja ";
                    								System.out.println(str); 
                           							}
                        	   						
                           						}
                           					}
                           					catch(IOException e)
                    	   				{
                    		   				System.out.print("Load error! File "+ ofile + " hasn't been found ! ") ;
                    		   				System.exit(-1) ;
                    	   				}
                    					
                    				

                    }
                    break;
                case 2 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:345:2: ':' id= ID (v= createVertex )+ (n= createNormal )* (t= createTextCoord )* (face= createFace )*
                    {
                    match(input,17,FOLLOW_17_in_getShape1609); 
                    id=(Token)match(input,ID,FOLLOW_ID_in_getShape1615); 

                    		Object3d oCreer = new Object3d();
                    		oCreer.setName((id!=null?id.getText():null));
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:348:2: (v= createVertex )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==61) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:348:3: v= createVertex
                    	    {
                    	    pushFollow(FOLLOW_createVertex_in_getShape1625);
                    	    v=createVertex();

                    	    state._fsp--;

                    	    oCreer.addVertex(v);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);

                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:349:2: (n= createNormal )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==62) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:349:3: n= createNormal
                    	    {
                    	    pushFollow(FOLLOW_createNormal_in_getShape1637);
                    	    n=createNormal();

                    	    state._fsp--;

                    	    oCreer.addNormal(n);

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:350:2: (t= createTextCoord )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==63) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:350:3: t= createTextCoord
                    	    {
                    	    pushFollow(FOLLOW_createTextCoord_in_getShape1649);
                    	    t=createTextCoord();

                    	    state._fsp--;

                    	    oCreer.addTextureCoordinate(t);

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:351:2: (face= createFace )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==64) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:351:3: face= createFace
                    	    {
                    	    pushFollow(FOLLOW_createFace_in_getShape1661);
                    	    face=createFace();

                    	    state._fsp--;


                    	    		int taille = 3; 
                    	    	        int[] vertices = new int[taille];
                    	    		int[] normals = new int[taille];
                    	    		int[] textures = new int[taille];
                    	    		for(int i = 0; i<taille; i++){
                    	    			vertices[i] = face.get(0).get(i);	
                    	    			normals[i] = face.get(1).get(i);	
                    	    			textures[i] = face.get(2).get(i);	
                    	    		}
                    	    		
                    	     		oCreer.addTriangleWithNormalsAndTextureCoordinates(vertices,normals,textures); 

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                     if(!m_shapes.containsKey((id!=null?id.getText():null))){
                           		m_shapes.put((id!=null?id.getText():null) ,oCreer);
                           	  }
                           	  else{
                           		String str = "L'objet "+ (id!=null?id.getText():null) +" existe deja ";
                    		System.out.println(str); 
                           	  }
                        	   						
                    	

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "getShape"


    // $ANTLR start "createVertex"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:376:1: createVertex returns [Vector3d val] : '<vertex' '(' x= constante ',' y= constante ',' z= constante ')' '/>' ;
    public final Vector3d createVertex() throws RecognitionException {
        Vector3d val = null;

        GraphSceneParser.constante_return x = null;

        GraphSceneParser.constante_return y = null;

        GraphSceneParser.constante_return z = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:377:2: ( '<vertex' '(' x= constante ',' y= constante ',' z= constante ')' '/>' )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:377:4: '<vertex' '(' x= constante ',' y= constante ',' z= constante ')' '/>'
            {
            match(input,61,FOLLOW_61_in_createVertex1688); 
            match(input,32,FOLLOW_32_in_createVertex1690); 
            pushFollow(FOLLOW_constante_in_createVertex1695);
            x=constante();

            state._fsp--;

            match(input,33,FOLLOW_33_in_createVertex1697); 
            pushFollow(FOLLOW_constante_in_createVertex1703);
            y=constante();

            state._fsp--;

            match(input,33,FOLLOW_33_in_createVertex1705); 
            pushFollow(FOLLOW_constante_in_createVertex1711);
            z=constante();

            state._fsp--;

            match(input,34,FOLLOW_34_in_createVertex1712); 
            match(input,59,FOLLOW_59_in_createVertex1714); 
             val = new Vector3d(Float.valueOf((x!=null?input.toString(x.start,x.stop):null)),Float.valueOf((y!=null?input.toString(y.start,y.stop):null)),Float.valueOf((z!=null?input.toString(z.start,z.stop):null))); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "createVertex"


    // $ANTLR start "createNormal"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:380:1: createNormal returns [Vector3d val] : '<normal' '(' x= constante ',' y= constante ',' z= constante ')' '/>' ;
    public final Vector3d createNormal() throws RecognitionException {
        Vector3d val = null;

        GraphSceneParser.constante_return x = null;

        GraphSceneParser.constante_return y = null;

        GraphSceneParser.constante_return z = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:381:2: ( '<normal' '(' x= constante ',' y= constante ',' z= constante ')' '/>' )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:381:4: '<normal' '(' x= constante ',' y= constante ',' z= constante ')' '/>'
            {
            match(input,62,FOLLOW_62_in_createNormal1732); 
            match(input,32,FOLLOW_32_in_createNormal1734); 
            pushFollow(FOLLOW_constante_in_createNormal1740);
            x=constante();

            state._fsp--;

            match(input,33,FOLLOW_33_in_createNormal1742); 
            pushFollow(FOLLOW_constante_in_createNormal1748);
            y=constante();

            state._fsp--;

            match(input,33,FOLLOW_33_in_createNormal1750); 
            pushFollow(FOLLOW_constante_in_createNormal1756);
            z=constante();

            state._fsp--;

            match(input,34,FOLLOW_34_in_createNormal1757); 
            match(input,59,FOLLOW_59_in_createNormal1759); 
             val =  new Vector3d(Float.valueOf((x!=null?input.toString(x.start,x.stop):null)),Float.valueOf((y!=null?input.toString(y.start,y.stop):null)),Float.valueOf((z!=null?input.toString(z.start,z.stop):null)));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "createNormal"


    // $ANTLR start "createTextCoord"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:384:1: createTextCoord returns [Vector2d val] : '<txtCoord' '(' x= constante ',' y= constante ')' '/>' ;
    public final Vector2d createTextCoord() throws RecognitionException {
        Vector2d val = null;

        GraphSceneParser.constante_return x = null;

        GraphSceneParser.constante_return y = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:385:2: ( '<txtCoord' '(' x= constante ',' y= constante ')' '/>' )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:385:4: '<txtCoord' '(' x= constante ',' y= constante ')' '/>'
            {
            match(input,63,FOLLOW_63_in_createTextCoord1775); 
            match(input,32,FOLLOW_32_in_createTextCoord1777); 
            pushFollow(FOLLOW_constante_in_createTextCoord1783);
            x=constante();

            state._fsp--;

            match(input,33,FOLLOW_33_in_createTextCoord1785); 
            pushFollow(FOLLOW_constante_in_createTextCoord1791);
            y=constante();

            state._fsp--;

            match(input,34,FOLLOW_34_in_createTextCoord1793); 
            match(input,59,FOLLOW_59_in_createTextCoord1795); 
             val = new Vector2d(Float.valueOf((x!=null?input.toString(x.start,x.stop):null)),Float.valueOf((y!=null?input.toString(y.start,y.stop):null)));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "createTextCoord"


    // $ANTLR start "createFace"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:389:1: createFace returns [Vector<ArrayList<Integer>> val] : '<face' 's1' ':' p1= constante '/' n1= constante '/' t1= constante 's2' ':' p2= constante '/' n2= constante '/' t2= constante 's3' ':' p3= constante '/' n3= constante '/' t3= constante '/>' ;
    public final Vector<ArrayList<Integer>> createFace() throws RecognitionException {
        Vector<ArrayList<Integer>> val = null;

        GraphSceneParser.constante_return p1 = null;

        GraphSceneParser.constante_return n1 = null;

        GraphSceneParser.constante_return t1 = null;

        GraphSceneParser.constante_return p2 = null;

        GraphSceneParser.constante_return n2 = null;

        GraphSceneParser.constante_return t2 = null;

        GraphSceneParser.constante_return p3 = null;

        GraphSceneParser.constante_return n3 = null;

        GraphSceneParser.constante_return t3 = null;



        		val = new Vector<ArrayList<Integer>>();
        		ArrayList<Integer> pos = new ArrayList<Integer>();
        		ArrayList<Integer> norms = new ArrayList<Integer>();
        		ArrayList<Integer> txts = new ArrayList<Integer>();
        	
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:397:2: ( '<face' 's1' ':' p1= constante '/' n1= constante '/' t1= constante 's2' ':' p2= constante '/' n2= constante '/' t2= constante 's3' ':' p3= constante '/' n3= constante '/' t3= constante '/>' )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:397:4: '<face' 's1' ':' p1= constante '/' n1= constante '/' t1= constante 's2' ':' p2= constante '/' n2= constante '/' t2= constante 's3' ':' p3= constante '/' n3= constante '/' t3= constante '/>'
            {
            match(input,64,FOLLOW_64_in_createFace1820); 
            match(input,65,FOLLOW_65_in_createFace1823); 
            match(input,17,FOLLOW_17_in_createFace1825); 
            pushFollow(FOLLOW_constante_in_createFace1831);
            p1=constante();

            state._fsp--;

            match(input,66,FOLLOW_66_in_createFace1834); 
            pushFollow(FOLLOW_constante_in_createFace1840);
            n1=constante();

            state._fsp--;

            match(input,66,FOLLOW_66_in_createFace1842); 
            pushFollow(FOLLOW_constante_in_createFace1847);
            t1=constante();

            state._fsp--;

            match(input,67,FOLLOW_67_in_createFace1854); 
            match(input,17,FOLLOW_17_in_createFace1856); 
            pushFollow(FOLLOW_constante_in_createFace1862);
            p2=constante();

            state._fsp--;

            match(input,66,FOLLOW_66_in_createFace1865); 
            pushFollow(FOLLOW_constante_in_createFace1871);
            n2=constante();

            state._fsp--;

            match(input,66,FOLLOW_66_in_createFace1873); 
            pushFollow(FOLLOW_constante_in_createFace1878);
            t2=constante();

            state._fsp--;

            match(input,68,FOLLOW_68_in_createFace1886); 
            match(input,17,FOLLOW_17_in_createFace1888); 
            pushFollow(FOLLOW_constante_in_createFace1894);
            p3=constante();

            state._fsp--;

            match(input,66,FOLLOW_66_in_createFace1897); 
            pushFollow(FOLLOW_constante_in_createFace1903);
            n3=constante();

            state._fsp--;

            match(input,66,FOLLOW_66_in_createFace1905); 
            pushFollow(FOLLOW_constante_in_createFace1910);
            t3=constante();

            state._fsp--;

            match(input,59,FOLLOW_59_in_createFace1912); 
            pos.add(0,Integer.valueOf((p1!=null?input.toString(p1.start,p1.stop):null))); pos.add(1,Integer.valueOf((p2!=null?input.toString(p2.start,p2.stop):null))); pos.add(2,Integer.valueOf((p3!=null?input.toString(p3.start,p3.stop):null))); 
            		    norms.add(0,Integer.valueOf((n1!=null?input.toString(n1.start,n1.stop):null))); norms.add(1,Integer.valueOf((n1!=null?input.toString(n1.start,n1.stop):null))); norms.add(2,Integer.valueOf((n3!=null?input.toString(n3.start,n3.stop):null))); 
            		    txts.add(0,Integer.valueOf((t1!=null?input.toString(t1.start,t1.stop):null))); txts.add(1,Integer.valueOf((t2!=null?input.toString(t2.start,t2.stop):null))); txts.add(2,Integer.valueOf((t3!=null?input.toString(t3.start,t3.stop):null))); 
            		    val.add(0, pos);
            		    val.add(1,norms);
            		    val.add(2,txts);
            		   

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "createFace"


    // $ANTLR start "getMaterial"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:409:1: getMaterial : id= ID ( 'colorTypeINT' )? ( 'Ka' ':' '(' cr= constante ',' cg= constante ',' cb= constante ')' )? ( 'Kd' ':' '(' crd= constante ',' cgd= constante ',' cbd= constante ')' )? ( 'Ks' ':' '(' crs= constante ',' cgs= constante ',' cbs= constante ')' )? ( 'shine' ':' s= constante )? ( 'textFile' ':' f= STRING ( 'textX' ':' tx= constante )? ( 'textY' ':' ty= constante )? )? ;
    public final void getMaterial() throws RecognitionException {
        Token id=null;
        Token f=null;
        GraphSceneParser.constante_return cr = null;

        GraphSceneParser.constante_return cg = null;

        GraphSceneParser.constante_return cb = null;

        GraphSceneParser.constante_return crd = null;

        GraphSceneParser.constante_return cgd = null;

        GraphSceneParser.constante_return cbd = null;

        GraphSceneParser.constante_return crs = null;

        GraphSceneParser.constante_return cgs = null;

        GraphSceneParser.constante_return cbs = null;

        GraphSceneParser.constante_return s = null;

        GraphSceneParser.constante_return tx = null;

        GraphSceneParser.constante_return ty = null;



        		float r  = 1f;
        		float g = 1f;
        		float b = 1f;		
        		
        		float rd  = 1f;
        		float gd = 1f;
        		float bd = 1f;
        			
        		float rs  = 1f;
        		float gs = 1f;
        		float bs = 1f;	
        					  
        		float sh = 1.0f;
        		String file = null;
        		float txtX = 1.0f;
        		float txtY = 1.0f;
        		
        		boolean sameD = true;
        		boolean sameSpec = true;
        		
        		boolean colorFloat = true;
        		
        		Color c = new Color(r,g,b);
        		Color cd = new Color(rd,gd,bd);
        		Color cs = new Color(rs,gs,bs);
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:437:2: (id= ID ( 'colorTypeINT' )? ( 'Ka' ':' '(' cr= constante ',' cg= constante ',' cb= constante ')' )? ( 'Kd' ':' '(' crd= constante ',' cgd= constante ',' cbd= constante ')' )? ( 'Ks' ':' '(' crs= constante ',' cgs= constante ',' cbs= constante ')' )? ( 'shine' ':' s= constante )? ( 'textFile' ':' f= STRING ( 'textX' ':' tx= constante )? ( 'textY' ':' ty= constante )? )? )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:437:4: id= ID ( 'colorTypeINT' )? ( 'Ka' ':' '(' cr= constante ',' cg= constante ',' cb= constante ')' )? ( 'Kd' ':' '(' crd= constante ',' cgd= constante ',' cbd= constante ')' )? ( 'Ks' ':' '(' crs= constante ',' cgs= constante ',' cbs= constante ')' )? ( 'shine' ':' s= constante )? ( 'textFile' ':' f= STRING ( 'textX' ':' tx= constante )? ( 'textY' ':' ty= constante )? )?
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_getMaterial1940); 
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:438:2: ( 'colorTypeINT' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==69) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:438:3: 'colorTypeINT'
                    {
                    match(input,69,FOLLOW_69_in_getMaterial1944); 
                    colorFloat=false;

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:439:2: ( 'Ka' ':' '(' cr= constante ',' cg= constante ',' cb= constante ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==70) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:439:3: 'Ka' ':' '(' cr= constante ',' cg= constante ',' cb= constante ')'
                    {
                    match(input,70,FOLLOW_70_in_getMaterial1951); 
                    match(input,17,FOLLOW_17_in_getMaterial1953); 
                    match(input,32,FOLLOW_32_in_getMaterial1955); 
                    pushFollow(FOLLOW_constante_in_getMaterial1961);
                    cr=constante();

                    state._fsp--;

                    r = Float.valueOf((cr!=null?input.toString(cr.start,cr.stop):null));
                    match(input,33,FOLLOW_33_in_getMaterial1964); 
                    pushFollow(FOLLOW_constante_in_getMaterial1969);
                    cg=constante();

                    state._fsp--;

                    g = Float.valueOf((cg!=null?input.toString(cg.start,cg.stop):null));
                    match(input,33,FOLLOW_33_in_getMaterial1972); 
                    pushFollow(FOLLOW_constante_in_getMaterial1979);
                    cb=constante();

                    state._fsp--;

                    b = Float.valueOf((cb!=null?input.toString(cb.start,cb.stop):null));
                    match(input,34,FOLLOW_34_in_getMaterial1981); 

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:440:2: ( 'Kd' ':' '(' crd= constante ',' cgd= constante ',' cbd= constante ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==71) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:440:3: 'Kd' ':' '(' crd= constante ',' cgd= constante ',' cbd= constante ')'
                    {
                    match(input,71,FOLLOW_71_in_getMaterial1987); 
                    match(input,17,FOLLOW_17_in_getMaterial1989); 
                    match(input,32,FOLLOW_32_in_getMaterial1991); 
                    pushFollow(FOLLOW_constante_in_getMaterial1997);
                    crd=constante();

                    state._fsp--;

                    rd = Float.valueOf((crd!=null?input.toString(crd.start,crd.stop):null));
                    match(input,33,FOLLOW_33_in_getMaterial1999); 
                    pushFollow(FOLLOW_constante_in_getMaterial2004);
                    cgd=constante();

                    state._fsp--;

                    gd = Float.valueOf((cgd!=null?input.toString(cgd.start,cgd.stop):null));
                    match(input,33,FOLLOW_33_in_getMaterial2006); 
                    pushFollow(FOLLOW_constante_in_getMaterial2012);
                    cbd=constante();

                    state._fsp--;

                    bd = Float.valueOf((cbd!=null?input.toString(cbd.start,cbd.stop):null)); sameD = false;
                    match(input,34,FOLLOW_34_in_getMaterial2014); 

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:441:2: ( 'Ks' ':' '(' crs= constante ',' cgs= constante ',' cbs= constante ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==72) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:441:3: 'Ks' ':' '(' crs= constante ',' cgs= constante ',' cbs= constante ')'
                    {
                    match(input,72,FOLLOW_72_in_getMaterial2021); 
                    match(input,17,FOLLOW_17_in_getMaterial2023); 
                    match(input,32,FOLLOW_32_in_getMaterial2025); 
                    pushFollow(FOLLOW_constante_in_getMaterial2031);
                    crs=constante();

                    state._fsp--;

                    rs = Float.valueOf((crs!=null?input.toString(crs.start,crs.stop):null));
                    match(input,33,FOLLOW_33_in_getMaterial2034); 
                    pushFollow(FOLLOW_constante_in_getMaterial2039);
                    cgs=constante();

                    state._fsp--;

                    gs = Float.valueOf((cgs!=null?input.toString(cgs.start,cgs.stop):null));
                    match(input,33,FOLLOW_33_in_getMaterial2042); 
                    pushFollow(FOLLOW_constante_in_getMaterial2048);
                    cbs=constante();

                    state._fsp--;

                    bs = Float.valueOf((cbs!=null?input.toString(cbs.start,cbs.stop):null)); sameSpec = false;
                    match(input,34,FOLLOW_34_in_getMaterial2050); 

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:442:2: ( 'shine' ':' s= constante )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==73) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:442:3: 'shine' ':' s= constante
                    {
                    match(input,73,FOLLOW_73_in_getMaterial2058); 
                    match(input,17,FOLLOW_17_in_getMaterial2060); 
                    pushFollow(FOLLOW_constante_in_getMaterial2066);
                    s=constante();

                    state._fsp--;

                    sh = Float.valueOf((s!=null?input.toString(s.start,s.stop):null));

                    }
                    break;

            }

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:443:2: ( 'textFile' ':' f= STRING ( 'textX' ':' tx= constante )? ( 'textY' ':' ty= constante )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==74) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:443:3: 'textFile' ':' f= STRING ( 'textX' ':' tx= constante )? ( 'textY' ':' ty= constante )?
                    {
                    match(input,74,FOLLOW_74_in_getMaterial2074); 
                    match(input,17,FOLLOW_17_in_getMaterial2076); 
                    f=(Token)match(input,STRING,FOLLOW_STRING_in_getMaterial2081); 
                    file = (f!=null?f.getText():null); file = file.replace("\"", ""); 
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:443:77: ( 'textX' ':' tx= constante )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==75) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:443:78: 'textX' ':' tx= constante
                            {
                            match(input,75,FOLLOW_75_in_getMaterial2085); 
                            match(input,17,FOLLOW_17_in_getMaterial2087); 
                            pushFollow(FOLLOW_constante_in_getMaterial2092);
                            tx=constante();

                            state._fsp--;

                            txtX = Float.valueOf((tx!=null?input.toString(tx.start,tx.stop):null));

                            }
                            break;

                    }

                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:443:139: ( 'textY' ':' ty= constante )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==76) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:443:140: 'textY' ':' ty= constante
                            {
                            match(input,76,FOLLOW_76_in_getMaterial2098); 
                            match(input,17,FOLLOW_17_in_getMaterial2100); 
                            pushFollow(FOLLOW_constante_in_getMaterial2106);
                            ty=constante();

                            state._fsp--;

                            txtY = Float.valueOf((ty!=null?input.toString(ty.start,ty.stop):null));

                            }
                            break;

                    }


                    }
                    break;

            }


            		Vector2d v = new Vector2d(txtX, txtY);
            		if(!colorFloat){
            			r = r/255;
            			g = g/255;
            			b = b/255;
            			
            			if(!sameD){
            				rd = rd/255;
            				gd = gd/255;
            				bd = bd/255;
            			}
            			
            			if(!sameSpec){
            				rs = rs/255;
            				gs = gs/255;
            				bs = bs/255;
            			}
            		
            		}
            		
            		
            		try{c = new Color(r,g,b);}
            		catch(AssertionError e){ 
            			if(colorFloat){System.out.println("Colors indicators must be beetween 0 and 1");}
            			else{System.out.println("Colors indicators must be beetween 0 and 255");}
            		}
            		if(sameD){
            			rd = r;
            			gd = g;
            			bd = b;
            		}
            		try{cd = new Color(rd,gd,bd);}
            		catch(AssertionError e){
            			if(colorFloat){System.out.println("Colors indicators must be beetween 0 and 1");}
            			else{System.out.println("Colors indicators must be beetween 0 and 255");}
            		}
            		if(sameSpec){
            			rs = r;
            			gs = g;
            			bs = b;
            		}

            		try{cs = new Color(rs,gs,bs);}
            		catch(AssertionError e){
            			if(colorFloat){System.out.println("Colors indicators must be beetween 0 and 1");}
            			else{System.out.println("Colors indicators must be beetween 0 and 255");} 
            		}
            		Material mat = new Material((id!=null?id.getText():null), c, cd, cs, 1.0f, sh, v, file);
            		if(file != null){
            			mat.setTextureId(m_materials.size());
            		}
            		materialLib.addMaterial(mat);
            		m_materials.put((id!=null?id.getText():null), mat);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "getMaterial"


    // $ANTLR start "getAnim"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:501:1: getAnim : id= ID 'type' ':' ( 'tr' t= animTraj | 'rot' r= animRot | 'sc' s= animSc ) ;
    public final void getAnim() throws RecognitionException {
        Token id=null;
        Pair<Vector3d, Pair<Float,Float>> t = null;

        Pair<Float, Pair<Float, Float>> r = null;

        Pair<Float, Pair<Float, Float>> s = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:501:9: (id= ID 'type' ':' ( 'tr' t= animTraj | 'rot' r= animRot | 'sc' s= animSc ) )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:501:11: id= ID 'type' ':' ( 'tr' t= animTraj | 'rot' r= animRot | 'sc' s= animSc )
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_getAnim2130); 
            match(input,18,FOLLOW_18_in_getAnim2132); 
            match(input,17,FOLLOW_17_in_getAnim2134); 
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:501:30: ( 'tr' t= animTraj | 'rot' r= animRot | 'sc' s= animSc )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt48=1;
                }
                break;
            case 78:
                {
                alt48=2;
                }
                break;
            case 79:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:501:31: 'tr' t= animTraj
                    {
                    match(input,77,FOLLOW_77_in_getAnim2137); 
                    pushFollow(FOLLOW_animTraj_in_getAnim2143);
                    t=animTraj();

                    state._fsp--;

                    if(!m_animTr.containsKey((id!=null?id.getText():null))){m_animTr.put((id!=null?id.getText():null), t);}
                    						 else {	String str = "L'animation "+ (id!=null?id.getText():null)+" existe deja ";
                    							System.out.println(str); }

                    }
                    break;
                case 2 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:504:6: 'rot' r= animRot
                    {
                    match(input,78,FOLLOW_78_in_getAnim2154); 
                    pushFollow(FOLLOW_animRot_in_getAnim2160);
                    r=animRot();

                    state._fsp--;

                    if(!m_animRot.containsKey((id!=null?id.getText():null))){m_animRot.put((id!=null?id.getText():null), r);}
                    						 else {	String str = "L'animation "+ (id!=null?id.getText():null)+" existe deja ";
                    							System.out.println(str); }

                    }
                    break;
                case 3 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:507:6: 'sc' s= animSc
                    {
                    match(input,79,FOLLOW_79_in_getAnim2170); 
                    pushFollow(FOLLOW_animSc_in_getAnim2176);
                    s=animSc();

                    state._fsp--;

                    if(!m_animSc.containsKey((id!=null?id.getText():null))){m_animSc.put((id!=null?id.getText():null), s);}
                    						 else {	String str = "L'animation "+ (id!=null?id.getText():null)+" existe deja ";
                    							System.out.println(str); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "getAnim"


    // $ANTLR start "animTraj"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:512:1: animTraj returns [Pair<Vector3d, Pair<Float,Float>> val] : 'stop' ':' '(' x= constante ',' y= constante ',' z= constante ')' ( 'start' ':' s= constante )? 'time' ':' t= constante ;
    public final Pair<Vector3d, Pair<Float,Float>> animTraj() throws RecognitionException {
        Pair<Vector3d, Pair<Float,Float>> val = null;

        GraphSceneParser.constante_return x = null;

        GraphSceneParser.constante_return y = null;

        GraphSceneParser.constante_return z = null;

        GraphSceneParser.constante_return s = null;

        GraphSceneParser.constante_return t = null;



        		float start = 0;
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:516:2: ( 'stop' ':' '(' x= constante ',' y= constante ',' z= constante ')' ( 'start' ':' s= constante )? 'time' ':' t= constante )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:516:4: 'stop' ':' '(' x= constante ',' y= constante ',' z= constante ')' ( 'start' ':' s= constante )? 'time' ':' t= constante
            {
            match(input,80,FOLLOW_80_in_animTraj2201); 
            match(input,17,FOLLOW_17_in_animTraj2203); 
            match(input,32,FOLLOW_32_in_animTraj2205); 
            pushFollow(FOLLOW_constante_in_animTraj2211);
            x=constante();

            state._fsp--;

            match(input,33,FOLLOW_33_in_animTraj2213); 
            pushFollow(FOLLOW_constante_in_animTraj2219);
            y=constante();

            state._fsp--;

            match(input,33,FOLLOW_33_in_animTraj2221); 
            pushFollow(FOLLOW_constante_in_animTraj2227);
            z=constante();

            state._fsp--;

            match(input,34,FOLLOW_34_in_animTraj2229); 
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:516:73: ( 'start' ':' s= constante )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==81) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:516:74: 'start' ':' s= constante
                    {
                    match(input,81,FOLLOW_81_in_animTraj2232); 
                    match(input,17,FOLLOW_17_in_animTraj2234); 
                    pushFollow(FOLLOW_constante_in_animTraj2240);
                    s=constante();

                    state._fsp--;

                    start = Float.valueOf((s!=null?input.toString(s.start,s.stop):null)); 

                    }
                    break;

            }

            match(input,82,FOLLOW_82_in_animTraj2247); 
            match(input,17,FOLLOW_17_in_animTraj2249); 
            pushFollow(FOLLOW_constante_in_animTraj2255);
            t=constante();

            state._fsp--;

             Vector3d v = new Vector3d(Float.valueOf((x!=null?input.toString(x.start,x.stop):null)) , Float.valueOf((y!=null?input.toString(y.start,y.stop):null)) , Float.valueOf((z!=null?input.toString(z.start,z.stop):null)) );
            	  Pair<Float, Float> timeInter = new Pair<Float, Float>(start, Float.valueOf((t!=null?input.toString(t.start,t.stop):null)));
            	  val = new Pair<Vector3d, Pair<Float, Float>>(v , timeInter );
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "animTraj"


    // $ANTLR start "animRot"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:522:1: animRot returns [Pair<Float, Pair<Float, Float>> val] : 'ang' ':' a= constante ( 'start' ':' s= constante )? 'time' ':' t= constante ;
    public final Pair<Float, Pair<Float, Float>> animRot() throws RecognitionException {
        Pair<Float, Pair<Float, Float>> val = null;

        GraphSceneParser.constante_return a = null;

        GraphSceneParser.constante_return s = null;

        GraphSceneParser.constante_return t = null;



        		float start = 0;
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:526:2: ( 'ang' ':' a= constante ( 'start' ':' s= constante )? 'time' ':' t= constante )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:526:4: 'ang' ':' a= constante ( 'start' ':' s= constante )? 'time' ':' t= constante
            {
            match(input,83,FOLLOW_83_in_animRot2279); 
            match(input,17,FOLLOW_17_in_animRot2281); 
            pushFollow(FOLLOW_constante_in_animRot2287);
            a=constante();

            state._fsp--;

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:526:28: ( 'start' ':' s= constante )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==81) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:526:29: 'start' ':' s= constante
                    {
                    match(input,81,FOLLOW_81_in_animRot2290); 
                    match(input,17,FOLLOW_17_in_animRot2292); 
                    pushFollow(FOLLOW_constante_in_animRot2298);
                    s=constante();

                    state._fsp--;

                    start = Float.valueOf((s!=null?input.toString(s.start,s.stop):null)); 

                    }
                    break;

            }

            match(input,82,FOLLOW_82_in_animRot2304); 
            match(input,17,FOLLOW_17_in_animRot2306); 
            pushFollow(FOLLOW_constante_in_animRot2312);
            t=constante();

            state._fsp--;

             Pair<Float, Float> timeInter = new Pair<Float, Float>(start,  Float.valueOf((t!=null?input.toString(t.start,t.stop):null)));
            	val = new Pair<Float, Pair<Float, Float>>(Float.valueOf((a!=null?input.toString(a.start,a.stop):null)) , timeInter);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "animRot"


    // $ANTLR start "animSc"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:530:1: animSc returns [Pair<Float, Pair<Float, Float>> val] : 'size' ':' s= constante ( 'start' ':' st= constante )? 'time' ':' t= constante ;
    public final Pair<Float, Pair<Float, Float>> animSc() throws RecognitionException {
        Pair<Float, Pair<Float, Float>> val = null;

        GraphSceneParser.constante_return s = null;

        GraphSceneParser.constante_return st = null;

        GraphSceneParser.constante_return t = null;



        		float start = 0;
        	
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:534:2: ( 'size' ':' s= constante ( 'start' ':' st= constante )? 'time' ':' t= constante )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:534:5: 'size' ':' s= constante ( 'start' ':' st= constante )? 'time' ':' t= constante
            {
            match(input,49,FOLLOW_49_in_animSc2337); 
            match(input,17,FOLLOW_17_in_animSc2339); 
            pushFollow(FOLLOW_constante_in_animSc2345);
            s=constante();

            state._fsp--;

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:534:30: ( 'start' ':' st= constante )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==81) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:534:31: 'start' ':' st= constante
                    {
                    match(input,81,FOLLOW_81_in_animSc2348); 
                    match(input,17,FOLLOW_17_in_animSc2350); 
                    pushFollow(FOLLOW_constante_in_animSc2356);
                    st=constante();

                    state._fsp--;

                    start = Float.valueOf((st!=null?input.toString(st.start,st.stop):null)); 

                    }
                    break;

            }

            match(input,82,FOLLOW_82_in_animSc2361); 
            match(input,17,FOLLOW_17_in_animSc2363); 
            pushFollow(FOLLOW_constante_in_animSc2369);
            t=constante();

            state._fsp--;

             Pair<Float, Float> timeInter = new Pair<Float, Float>(start, Float.valueOf((t!=null?input.toString(t.start,t.stop):null)));
            	val = new Pair<Float, Pair<Float, Float>>(Float.valueOf((s!=null?input.toString(s.start,s.stop):null)), timeInter);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "animSc"


    // $ANTLR start "nodeScn"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:542:1: nodeScn returns [Group val] : '<node' n= optName nd= optType '>' (t= treeScn )+ '</node>' ;
    public final Group nodeScn() throws RecognitionException {
        Group val = null;

        GraphSceneParser.optName_return n = null;

        Group nd = null;

        Node t = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:542:29: ( '<node' n= optName nd= optType '>' (t= treeScn )+ '</node>' )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:542:31: '<node' n= optName nd= optType '>' (t= treeScn )+ '</node>'
            {
            match(input,84,FOLLOW_84_in_nodeScn2390); 
            pushFollow(FOLLOW_optName_in_nodeScn2396);
            n=optName();

            state._fsp--;

            pushFollow(FOLLOW_optType_in_nodeScn2400);
            nd=optType();

            state._fsp--;

            val =nd;
            match(input,85,FOLLOW_85_in_nodeScn2403); 
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:542:82: (t= treeScn )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==84||(LA52_0>=87 && LA52_0<=88)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:542:83: t= treeScn
            	    {
            	    pushFollow(FOLLOW_treeScn_in_nodeScn2409);
            	    t=treeScn();

            	    state._fsp--;

            	    nd.addChild(t);

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);

            match(input,86,FOLLOW_86_in_nodeScn2414); 
             if(!m_subTree.containsKey((n!=null?n.val:null))){m_subTree.put((n!=null?n.val:null), val);}
            				else{
            					String str = "Le sous-arbre "+ (n!=null?n.val:null)+" existe deja ";
            					System.out.println(str); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "nodeScn"


    // $ANTLR start "leafScn"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:549:1: leafScn returns [Geometry val] : '<object' n= optName g= optShape '/>' ;
    public final Geometry leafScn() throws RecognitionException {
        Geometry val = null;

        GraphSceneParser.optName_return n = null;

        Geometry g = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:549:31: ( '<object' n= optName g= optShape '/>' )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:549:33: '<object' n= optName g= optShape '/>'
            {
            match(input,87,FOLLOW_87_in_leafScn2439); 
            pushFollow(FOLLOW_optName_in_leafScn2445);
            n=optName();

            state._fsp--;

            pushFollow(FOLLOW_optShape_in_leafScn2449);
            g=optShape();

            state._fsp--;

            val = g;
            match(input,59,FOLLOW_59_in_leafScn2451); 
            if(!m_subTree.containsKey((n!=null?n.val:null))){m_subTree.put((n!=null?n.val:null), val);}
            				 else{
            				 	String str = "Le sous-arbre "+ (n!=null?n.val:null)+" existe deja ";
            					 System.out.println(str); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "leafScn"


    // $ANTLR start "subtreeScn"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:555:1: subtreeScn returns [Node val] : '<getSbtree' n= optName '/>' ;
    public final Node subtreeScn() throws RecognitionException {
        Node val = null;

        GraphSceneParser.optName_return n = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:555:30: ( '<getSbtree' n= optName '/>' )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:555:32: '<getSbtree' n= optName '/>'
            {
            match(input,88,FOLLOW_88_in_subtreeScn2469); 
            pushFollow(FOLLOW_optName_in_subtreeScn2475);
            n=optName();

            state._fsp--;

            if(m_subTree.containsKey((n!=null?n.val:null))){
                       					 		val = m_subTree.get((n!=null?n.val:null));
                    						} 
                    					     	else { 
                    							String str = "Le sous-arbre "+ (n!=null?n.val:null)+" n'est pas défini dans cette partie du code";
                        							System.out.println(str); 
                    						}  ; 
            match(input,59,FOLLOW_59_in_subtreeScn2478); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return val;
    }
    // $ANTLR end "subtreeScn"


    // $ANTLR start "treeScn"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:564:1: treeScn returns [Node nd] : (l= leafScn | n= nodeScn | sb= subtreeScn );
    public final Node treeScn() throws RecognitionException {
        Node nd = null;

        Geometry l = null;

        Group n = null;

        Node sb = null;


        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:564:26: (l= leafScn | n= nodeScn | sb= subtreeScn )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt53=1;
                }
                break;
            case 84:
                {
                alt53=2;
                }
                break;
            case 88:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:564:28: l= leafScn
                    {
                    pushFollow(FOLLOW_leafScn_in_treeScn2492);
                    l=leafScn();

                    state._fsp--;

                    nd = l;

                    }
                    break;
                case 2 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:564:55: n= nodeScn
                    {
                    pushFollow(FOLLOW_nodeScn_in_treeScn2499);
                    n=nodeScn();

                    state._fsp--;

                    nd = n;

                    }
                    break;
                case 3 :
                    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:564:82: sb= subtreeScn
                    {
                    pushFollow(FOLLOW_subtreeScn_in_treeScn2508);
                    sb=subtreeScn();

                    state._fsp--;

                    nd = sb;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return nd;
    }
    // $ANTLR end "treeScn"


    // $ANTLR start "graph"
    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:567:1: graph returns [Group res] : '<scene' n= optName '>' ( defineOpt )* (t= treeScn )* '</scene>' ;
    public final Group graph() throws RecognitionException {
        Group res = null;

        GraphSceneParser.optName_return n = null;

        Node t = null;



        		materialLib.addMaterial(white);
        		
        try {
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:571:2: ( '<scene' n= optName '>' ( defineOpt )* (t= treeScn )* '</scene>' )
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:571:3: '<scene' n= optName '>' ( defineOpt )* (t= treeScn )* '</scene>'
            {
            match(input,89,FOLLOW_89_in_graph2530); 
            pushFollow(FOLLOW_optName_in_graph2534);
            n=optName();

            state._fsp--;

            sc_name=(n!=null?input.toString(n.start,n.stop):null);
            match(input,85,FOLLOW_85_in_graph2536); 
            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:571:43: ( defineOpt )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==58) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:571:44: defineOpt
            	    {
            	    pushFollow(FOLLOW_defineOpt_in_graph2539);
            	    defineOpt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:571:56: (t= treeScn )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==84||(LA55_0>=87 && LA55_0<=88)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // C:\\Users\\timothee\\Desktop\\Cours\\Année 2019-2020\\Semestre 7\\CIN\\TP2_DURGEAUD_TIMOTHEE\\TP Projet\\language\\GraphScene.g:571:57: t= treeScn
            	    {
            	    pushFollow(FOLLOW_treeScn_in_graph2546);
            	    t=treeScn();

            	    state._fsp--;

            	    gS.addChild(t);

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            match(input,90,FOLLOW_90_in_graph2551); 
            res = gS; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "graph"

    // Delegated rules


 

    public static final BitSet FOLLOW_15_in_constante549 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_set_in_constante551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_optName568 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optName570 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_STRING_in_optName576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_optTransfo593 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optTransfo595 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_19_in_optTransfo598 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_optRot_in_optTransfo604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_optTransfo612 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_optTrans_in_optTransfo618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_optTransfo625 = new BitSet(new long[]{0x00000000C4000000L});
    public static final BitSet FOLLOW_optSc_in_optTransfo631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_optRot653 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optRot655 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optRot661 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_23_in_optRot669 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optRot671 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optRot678 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_24_in_optRot688 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optRot690 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optRot696 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_optRot706 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optRot708 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optRot714 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_optRot723 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optRot725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_optRot731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_optTrans757 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optTrans759 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optTrans765 = new BitSet(new long[]{0x0000000034000002L});
    public static final BitSet FOLLOW_28_in_optTrans775 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optTrans777 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optTrans783 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_29_in_optTrans793 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optTrans795 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optTrans801 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_optTrans810 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optTrans812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_optTrans818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_optSc848 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optSc850 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optSc856 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_31_in_optSc862 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optSc864 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_optSc867 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optSc873 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_optSc876 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optSc890 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_optSc893 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optSc908 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_optSc911 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_optSc920 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optSc922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_optSc928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_optType953 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optType955 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_optType958 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_optTransfo_in_optType964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_optType969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_listShape989 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_optCone_in_listShape993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_listShape999 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_optCube_in_listShape1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_listShape1009 = new BitSet(new long[]{0x0005E00000000000L});
    public static final BitSet FOLLOW_optCyl_in_listShape1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_listShape1021 = new BitSet(new long[]{0x0009800000000000L});
    public static final BitSet FOLLOW_optSph_in_listShape1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_listShape1031 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_optTpt_in_listShape1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_listShape1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_listShape1047 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_optTrs_in_listShape1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_listShape1058 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_optDef_in_listShape1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_optDef1081 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optDef1083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_optDef1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_optCone1111 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optCone1113 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optCone1117 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_46_in_optCone1127 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optCone1128 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optCone1132 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47_in_optCone1142 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optCone1143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_optCone1147 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_optCone1157 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optCone1158 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_optCone1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_optCube1187 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optCube1189 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optCube1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_optCyl1223 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optCyl1225 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optCyl1231 = new BitSet(new long[]{0x0005C00000000002L});
    public static final BitSet FOLLOW_50_in_optCyl1241 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optCyl1243 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optCyl1249 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_46_in_optCyl1259 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optCyl1260 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optCyl1266 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47_in_optCyl1275 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optCyl1276 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_optCyl1282 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_optCyl1292 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optCyl1293 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_optCyl1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_optSph1326 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optSph1328 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optSph1333 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47_in_optSph1343 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optSph1344 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_optSph1350 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_optSph1360 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optSph1361 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_optSph1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_optTpt1394 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optTpt1396 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optTpt1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_optTrs1428 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optTrs1430 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optTrs1436 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_53_in_optTrs1446 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optTrs1448 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_optTrs1454 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_54_in_optTrs1464 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optTrs1466 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_optTrs1471 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_optTrs1481 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optTrs1483 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_optTrs1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_optShape1510 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optShape1512 = new BitSet(new long[]{0x00001FE000000000L});
    public static final BitSet FOLLOW_listShape_in_optShape1518 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_optShape1527 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_optShape1529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_optShape1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_defineOpt1549 = new BitSet(new long[]{0x0300000004000000L});
    public static final BitSet FOLLOW_57_in_defineOpt1552 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_defineOpt1554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_getMaterial_in_defineOpt1556 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_26_in_defineOpt1560 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_defineOpt1562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_getAnim_in_defineOpt1564 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_56_in_defineOpt1568 = new BitSet(new long[]{0x1000000000020000L});
    public static final BitSet FOLLOW_getShape_in_defineOpt1570 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_defineOpt1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_getShape1593 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_getShape1595 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_STRING_in_getShape1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_getShape1609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_getShape1615 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_createVertex_in_getShape1625 = new BitSet(new long[]{0xE000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_createNormal_in_getShape1637 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_createTextCoord_in_getShape1649 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_createFace_in_getShape1661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_61_in_createVertex1688 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_createVertex1690 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createVertex1695 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_createVertex1697 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createVertex1703 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_createVertex1705 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createVertex1711 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_createVertex1712 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_createVertex1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_createNormal1732 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_createNormal1734 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createNormal1740 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_createNormal1742 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createNormal1748 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_createNormal1750 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createNormal1756 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_createNormal1757 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_createNormal1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_createTextCoord1775 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_createTextCoord1777 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createTextCoord1783 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_createTextCoord1785 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createTextCoord1791 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_createTextCoord1793 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_createTextCoord1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_createFace1820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_createFace1823 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_createFace1825 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createFace1831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_createFace1834 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createFace1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_createFace1842 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createFace1847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_createFace1854 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_createFace1856 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createFace1862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_createFace1865 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createFace1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_createFace1873 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createFace1878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_createFace1886 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_createFace1888 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createFace1894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_createFace1897 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createFace1903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_createFace1905 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_createFace1910 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_createFace1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getMaterial1940 = new BitSet(new long[]{0x0000000000000002L,0x00000000000007E0L});
    public static final BitSet FOLLOW_69_in_getMaterial1944 = new BitSet(new long[]{0x0000000000000002L,0x00000000000007C0L});
    public static final BitSet FOLLOW_70_in_getMaterial1951 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_getMaterial1953 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_getMaterial1955 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial1961 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_getMaterial1964 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial1969 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_getMaterial1972 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial1979 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_getMaterial1981 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000780L});
    public static final BitSet FOLLOW_71_in_getMaterial1987 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_getMaterial1989 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_getMaterial1991 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial1997 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_getMaterial1999 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial2004 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_getMaterial2006 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial2012 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_getMaterial2014 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_72_in_getMaterial2021 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_getMaterial2023 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_getMaterial2025 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial2031 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_getMaterial2034 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial2039 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_getMaterial2042 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial2048 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_getMaterial2050 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_getMaterial2058 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_getMaterial2060 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial2066 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_getMaterial2074 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_getMaterial2076 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_STRING_in_getMaterial2081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_getMaterial2085 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_getMaterial2087 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial2092 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_getMaterial2098 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_getMaterial2100 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_getMaterial2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getAnim2130 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_getAnim2132 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_getAnim2134 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_77_in_getAnim2137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_animTraj_in_getAnim2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_getAnim2154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_animRot_in_getAnim2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_getAnim2170 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_animSc_in_getAnim2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_animTraj2201 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_animTraj2203 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_animTraj2205 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_animTraj2211 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_animTraj2213 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_animTraj2219 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_animTraj2221 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_animTraj2227 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_animTraj2229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_animTraj2232 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_animTraj2234 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_animTraj2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_animTraj2247 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_animTraj2249 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_animTraj2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_animRot2279 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_animRot2281 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_animRot2287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_animRot2290 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_animRot2292 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_animRot2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_animRot2304 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_animRot2306 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_animRot2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_animSc2337 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_animSc2339 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_animSc2345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_81_in_animSc2348 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_animSc2350 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_animSc2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_animSc2361 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_animSc2363 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_constante_in_animSc2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_nodeScn2390 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_optName_in_nodeScn2396 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_optType_in_nodeScn2400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_nodeScn2403 = new BitSet(new long[]{0x0000000000000000L,0x0000000001900000L});
    public static final BitSet FOLLOW_treeScn_in_nodeScn2409 = new BitSet(new long[]{0x0000000000000000L,0x0000000001D00000L});
    public static final BitSet FOLLOW_86_in_nodeScn2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_leafScn2439 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_optName_in_leafScn2445 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_optShape_in_leafScn2449 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_leafScn2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_subtreeScn2469 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_optName_in_subtreeScn2475 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_subtreeScn2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leafScn_in_treeScn2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nodeScn_in_treeScn2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subtreeScn_in_treeScn2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_graph2530 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_optName_in_graph2534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_graph2536 = new BitSet(new long[]{0x0400000000000000L,0x0000000005900000L});
    public static final BitSet FOLLOW_defineOpt_in_graph2539 = new BitSet(new long[]{0x0400000000000000L,0x0000000005900000L});
    public static final BitSet FOLLOW_treeScn_in_graph2546 = new BitSet(new long[]{0x0000000000000000L,0x0000000005900000L});
    public static final BitSet FOLLOW_90_in_graph2551 = new BitSet(new long[]{0x0000000000000002L});

}