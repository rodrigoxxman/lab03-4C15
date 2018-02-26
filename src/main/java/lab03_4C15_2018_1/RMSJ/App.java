package lab03_4C15_2018_1.RMSJ;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
}
