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
public class Fondo {
    private int numero;
    private float saldoMensual;

    public Fondo(int numero, float saldoMensual) {
        this.numero = numero;
        this.saldoMensual = saldoMensual;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldoMensual() {
        return saldoMensual;
    }

    public void setSaldoMensual(float saldoMensual) {
        this.saldoMensual = saldoMensual;
    }
    
    @Override
    public String toString(){
        return "Numero Fondo: "+this.numero+" "+
                "Saldo mensual: "+this.saldoMensual;
    }
}
