/*
 * Exercício Objetos (1): Calculadora
 * Exercício de Programação com Objetos em Java
 * Calculadora Simples com JOptionPane
 * https://sites.google.com/site/profnewtonjava/exerciciocalculadora
 */
package com.calculator.project;

/**
 *
 * @author Is@@c Belo
 */
//1- Criar um Projeto na IDE Eclipse com o nome: “ExercicioCalculadora” no seu workspace adequado.
//2- Criar o pacote para armazenar as classes do projeto chamado: “br.estacio.programacao.calculadora”
//3- Criar a Classe “Calculadora” para a realização das operações básicas da Calculadora, com o seguinte modelo de código:
public class Calculator {
     

//Método somar
    public double somar(double a, double b) {//------Início somar
       
        return a + b;
    }//-------------------------------------------------Fim somar
    //Método subtrair

    public double subtrair(double a, double b) {//Início subtrair
        return a - b;
    }//----------------------------------------------Fim subtrair
    //Método multiplicar

    public double multiplicar(double a, double b) {//Início Multiplicar
        return a * b;
    }//-------------------------------------------------Fim Multiplicar
    //Método dividir

    public double dividir(double a, double b) {//--------Início Dividir
        return a / b;
    }//-----------------------------------------------------Fim Dividir
    //Método elevar A potencia
    public double elevarPotencia(double a, double b) {//--------Início Dividir
        return Math.pow(a, b);
    }//-----------------------------------------------------Fim Dividir


    /*//Método Mostrar Menu
     public String mostraMenu(){//-------------início mostrarMenu
     String menu = "Programa Calculadora\n\n"+
     "1-Somar\n"+
     "2-Subtrair\n"+
     "3-Multiplicar\n"+
     "4-Dividir\n"+
     "5-Potência\n"+
     "6-Raiz Quadrada\n"+
     "7-Finalizar\n\n";
     return menu;
        
     }//-------------------------------------------Fim mostrarMenu
     */
}
