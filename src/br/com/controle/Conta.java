/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

public class Conta {

    private int numero = 0;
    private double saldo = 0.00;

    private int corrente = 1;
    private int polpanca = 2;

    public Conta() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }   

    public int getCorrente() {
        return corrente;
    }

    public int getPolpanca() {
        return polpanca;
    }

    public double sacar(double valor) {
       
        this.validarValor(valor);

        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar esta operação!");
        }

        this.saldo -= valor;

        return this.saldo();
    }

    public double depositar(double valor) {

        this.validarValor(valor);

        saldo += valor;

        return saldo;

    }

    public void validarValor(Double valor) {
        if (valor == null || valor <= 0d) {
             throw new IllegalArgumentException("Informe um valor positivo para esta operação");
        }
    }

    public double saldo() {

        return this.saldo;
    }
}
