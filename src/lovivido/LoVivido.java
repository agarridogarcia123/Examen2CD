/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

public static void main(String[] args) {
String nombre;//cambio nombres de las variables para que se pueda entender mejor
String edad;
nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
edad = JOptionPane.showInputDialog ("Escriba su edad: ");
 
Edad calc1=new Edad();//llamamos al método calcular meses
calc1.calcularMeses();

//int meses;
//int dias;
int horas;
int a;

//nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
//edad = JOptionPane.showInputDialog ("Escriba su edad: ");
 
a= Integer.parseInt (edad);
 
//meses = (a*12);
//dias = (a*365);
//horas = (dias*24);
 
 //JOptionPane.showMessageDialog(null,  "Meses: "  +meses,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);


 //JOptionPane.showMessageDialog(null, "Días: " +dias,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);


 //JOptionPane.showMessageDialog(null, "Horas: " +horas,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);

}
   

}
