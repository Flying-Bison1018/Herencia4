/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia8;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ClientePreferente extends Clientes {
   
    private ArrayList<Fondo> fondos;
            
    public ClientePreferente(int NIF, int numeroCuenta, float saldo){
        super(NIF,numeroCuenta,saldo);
        fondos = new ArrayList<>();
        
    }

    public ArrayList<Fondo> getFondos() {
        return fondos;
    }

    public void setFondos(ArrayList<Fondo> fondos) {
        this.fondos = fondos;
    }
    
    public void Llenar(Fondo n){
        this.fondos.add(n);
    }
    public void Consultar(){
        System.out.println("Fondos");
            System.out.println(this.fondos.toString());
    }
   
    @Override
    public String Mostrar(){
        return super.Mostrar()+
        " "+this.fondos.toString();
        
    }
}
