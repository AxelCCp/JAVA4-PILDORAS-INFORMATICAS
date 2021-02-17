package Excepciones_1;
import javax.swing.JOptionPane;

public class A5_147_ExcepcionesPropias {
	
	public static void main(String[]args) {
		
		String email = JOptionPane.showInputDialog("Ingresa un email");
		try {
			examinaEmail(email);
		} catch (LongitudEmailErronea e) {
			System.out.println("La dirección de correo no es correcta");
			e.printStackTrace();
		}
	}

	
	static void examinaEmail(String correo) throws LongitudEmailErronea {
	
		int arroba = 0;
		boolean punto = false;
	
		if(correo.length()<=3) {		
			throw new LongitudEmailErronea("El mail es demasiado corto"); 
		}else {
			for(int i=0; i<correo.length();i++) {
		
				if(correo.charAt(i)=='@') {
					arroba++;
				}
		
				if(correo.charAt(i)=='.') {
					punto=true;
				}
			}
	
			if(arroba==1 && punto==true) {
				System.out.println("Es correcto");
			}else {
				System.out.println("No es correcto");
			}	
		}
	}
}


class LongitudEmailErronea extends Exception{
	//CONSTRUCTOR 1
	public LongitudEmailErronea() {}
	//CONSTRUCTOR 2
	public LongitudEmailErronea(String  msjError) {
		super(msjError);														//llamamos al constructor de Exception
	}
}
