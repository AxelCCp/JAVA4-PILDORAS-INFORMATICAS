package Excepciones_1;

import javax.swing.JOptionPane;

public class A0_142_Fallos {
	public static void main(String[]args) {
		
		int miMatriz[]=new int[5];
		miMatriz[0]=5;
		miMatriz[1]=38;
		miMatriz[2]=15;
		miMatriz[3]=92;
		miMatriz[4]=71;
	

		for(int i=0; i<5; i++) {
			System.out.println("Posición " + i + " = " + miMatriz[i]);
		}
	
		//PETICIÓN DE DATOS
		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
		System.out.println("Hola " + nombre + " Tienes " + edad + " años. " + "El programa terminó su ejecución");
	}
}
