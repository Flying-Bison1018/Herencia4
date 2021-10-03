/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia8;

/**
 *
 * @author PC
 */
public class TestHerencia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientePreferente p = new ClientePreferente(213,4660,300000);
        p.Llenar(new Fondo(123,2000));
        p.Llenar(new Fondo(345,45000));
        ClientePreferente p1 = new ClientePreferente(211,4860,340000);
        p1.Llenar(new Fondo(124,2060));      
       
        System.out.println(p.Mostrar());
        System.out.println(p1.Mostrar());
        p.Consultar();
    }
    
}
