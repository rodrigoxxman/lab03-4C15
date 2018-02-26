package lab03_4C15_2018_1.RMSJ;

import javax.swing.JOptionPane;

public class Operaciones {
	public void Suma() {
		int a; 
    	int b;
    	int c;
    	String valor1, valor2;
    	valor1=JOptionPane.showInputDialog("Ingrese un valor");
    	a=Integer.parseInt(valor1);
    	valor2=JOptionPane.showInputDialog("Ingrese un valor");
    	b=Integer.parseInt(valor2);
    	c=a+b;
    	JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+ c);
	}
	public void Resta() {
		int a; 
    	int b;
    	int c;
    	String valor1, valor2;
    	valor1=JOptionPane.showInputDialog("Ingrese un valor");
    	a=Integer.parseInt(valor1);
    	valor2=JOptionPane.showInputDialog("Ingrese un valor");
    	b=Integer.parseInt(valor2);
    	c=a-b;
    	JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+ c);
	}
}
