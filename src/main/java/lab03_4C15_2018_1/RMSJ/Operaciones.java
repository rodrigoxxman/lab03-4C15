package lab03_4C15_2018_1.RMSJ;

import javax.swing.JOptionPane;

public class Operaciones {
	public static void Multiplicación() {
    	Integer a;
    	Integer b;
    	Integer c;
    	String valor1, valor2;
    	valor1=JOptionPane.showInputDialog("Ingrese el valor de a");
    	a=Integer.parseInt(valor1);
    	valor2=JOptionPane.showInputDialog("Ingrese el valor de b");  
    	b=Integer.parseInt(valor2);
    	c=a*b;
    	JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: "+c);
    }
	public static void División() {
    	Integer a;
    	Integer b;
    	Integer c;
    	String valor1, valor2;
    	valor1=JOptionPane.showInputDialog("Ingrese el valor de a");
    	a=Integer.parseInt(valor1);
    	valor2=JOptionPane.showInputDialog("Ingrese el valor de b");  
    	b=Integer.parseInt(valor2);
    	c=a/b;
    	JOptionPane.showMessageDialog(null, "El resultado de la división es: "+c);
    }
}
