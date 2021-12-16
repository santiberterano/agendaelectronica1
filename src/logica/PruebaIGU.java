/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import igu.Pantalla;
/**
 *
 * @author santi
 */
public class PruebaIGU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pantalla pantalla = new Pantalla ();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        int dni [] = new int [10];
        String nombre [] = new String [10];
        String apellido [] = new String [10];
        String direccion [] = new String [10];
        int telefono [] = new int [10];
        String nacimiento [] = new String [10];
        int contador = 0;
    }
    
}
