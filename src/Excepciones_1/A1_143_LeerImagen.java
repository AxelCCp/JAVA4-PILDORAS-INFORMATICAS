package Excepciones_1;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A1_143_LeerImagen {
	public static void main(String[]args) {
		
		MarcoImagen mimarco=new MarcoImagen();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class MarcoImagen extends JFrame{
	public MarcoImagen(){
		setTitle("Marco Con Imagen");
		setBounds(750,300,300,200);
		LaminaConImagen milamina=new LaminaConImagen();	
		add(milamina);
	}	
}


class LaminaConImagen extends JPanel{
	
	public LaminaConImagen(){	
		try{
			imagen=ImageIO.read(new File("C:/Users/Fantasma/Downloads/150-iconos-gif/box.gif"));
		}catch(IOException e){
			System.out.println("La imagen no se encuentra");
		}
	}
	
public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		if(imagen==null){
			g.drawString("no podemos cargar la imagen", 10, 10);
		}else{
		
			int anchuraImagen=imagen.getWidth(this);
			int alturaImagen=imagen.getHeight(this);
			g.drawImage(imagen, 0, 0, null);
		
			for(int i=0;i<300;i++){
			
				for(int j=0;j<200;j++){
					if(i+j>0){
						g.copyArea(0, 0, anchuraImagen, alturaImagen,anchuraImagen*i, alturaImagen*j);	
					}
				}
			}
		}				
	}
	private Image imagen;
}




