package Excepciones_1;

import javax.swing.JOptionPane;

public class A4_146_CompruebaEmail {
	public static void main(String[]args) {
		String email = JOptionPane.showInputDialog("Ingresa un email");
		examinaEmail(email);
	}
	
	static void examinaEmail(String correo) throws ArrayIndexOutOfBoundsException {
		int arroba = 0;
		boolean punto = false;
		
		if(correo.length()<=3) {
			//LANZAMOS MANUALMENTE UN ERROR
			//ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			throw new ArrayIndexOutOfBoundsException();
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
