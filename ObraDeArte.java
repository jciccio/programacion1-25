import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JFrame;

public class ObraDeArte {
  
  private static final int ANCHO = 600;
  private static final int ALTO = 600;
  private static final int MIN = 0;
  private static final int MAX = 6;
  private static final int SUBMATRIZ = 20;
  
  private int[][] dibujo = null;
  
  JFrame f = null;
  
  private BufferedImage imagen = null;
  
  public ObraDeArte(){
    
    imagen = new BufferedImage(ANCHO,ALTO,BufferedImage.TYPE_INT_RGB);
    dibujo = new int[ANCHO][ALTO];
    //getDibujo();
    dibujarLineasHorizontales(200,10,1);
    dibujarLineasHorizontales(400,10,1);
    dibujarLineasVerticales(200,10,1);
    dibujarLineasVerticales(400,10,1);

    for(int i=0;i<ANCHO;i++){
      for(int j=0;j<ALTO;j++){
        
        switch (dibujo[i][j]) {
          case 0:
            imagen.setRGB(i, j, Color.WHITE.getRGB());
            break;
          case 1:
            imagen.setRGB(i, j, Color.BLACK.getRGB());
            break;
          case 2:
            imagen.setRGB(i, j, Color.RED.getRGB());
            break;
          case 3:
            imagen.setRGB(i, j, Color.BLUE.getRGB());
            break;
          case 4:
            imagen.setRGB(i, j, Color.YELLOW.getRGB());
            break;
          default:
            imagen.setRGB(i, j, Color.GREEN.getRGB());
        } //switch
      } //for
    } //for
    
    f = new JFrame("Mi obra de arte"){
      public void paint(java.awt.Graphics g){
        g.drawImage(imagen,0,0,null);
      } //paint
    }; //jframe
      
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(ANCHO,ALTO);
    f.repaint();
    f.setVisible(true);
  }// constructor

  public void dibujarLineasHorizontales(int desdeFila, int grosor, int color){
    for(int i = 0 ; i < ANCHO ; i++){
      for(int j = 0; j < grosor ; j++){
        dibujo[i][desdeFila + j ] = color;
      }
    }
  }

  public void dibujarLineasVerticales(int desdeColumna, int grosor, int color){
    for(int i = 0 ; i < grosor ; i++){
      for(int j = 0; j < ALTO ; j++){
        dibujo[i+desdeColumna][j] = color;
      }
    }
  }
  
  public void getDibujo(){
    dibujo = new int[ANCHO][ALTO];
    int aleatorio = 0;
    for(int i=0 ; i<ANCHO; i+=SUBMATRIZ){
      //for(int j=0 ; j<ALTO; j+=SUBMATRIZ){
        aleatorio = MIN + (int)(Math.random() * (MAX - MIN));
        for (int k = 0; k < SUBMATRIZ; k++) {
          for (int m = 0; m < ALTO; m++) {
            dibujo[k+i][m] = aleatorio; 
          }
        }
      //} //for 
    }
  } //getdibujo
  
  public static void main(String[] args){
    ObraDeArte o = new ObraDeArte();
  }
}

