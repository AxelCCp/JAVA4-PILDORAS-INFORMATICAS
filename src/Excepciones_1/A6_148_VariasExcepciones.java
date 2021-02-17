package Excepciones_1;

import javax.swing.JOptionPane;

public class A6_148_VariasExcepciones {
	public static void main(String []args) {
		
		try {
			division();
		}catch(ArithmeticException e){
			System.out.println("Estás dividiendo por cero");
		}catch(NumberFormatException e) {
			System.out.println("No has ingresado un n° entero");
			System.out.println(e.getMessage()); //no devuelve lo q hemos ingresado. 
			System.out.println("Se ha generado un error de este tipo: " + e.getClass().getName());  //nos da la clase que ha generado el error. 
		}
	}
	
	static void division() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el dividendo: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el divisor: "));
		System.out.println(num1/num2);
	}
}




