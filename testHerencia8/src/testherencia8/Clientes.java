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
public class Clientes {
    private int NIF;
    private int numeroCuenta;
    private float saldo;

    public Clientes(int NIF, int numeroCuenta, float saldo) {
        this.NIF = NIF;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
     public String Mostrar(){
        return "NIF: "+this.NIF+" "+
               "Numero de la cuenta:  "+this.numeroCuenta+" "+
               "Saldo: "+this.saldo;
     }
}
