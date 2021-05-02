/*
 * Exercício Objetos (1): Calculadora
 * Exercício de Programação com Objetos em Java
 * Calculadora Simples com JOptionPane
 * https://sites.google.com/site/profnewtonjava/exerciciocalculadora
 */
package com.calculator.project;

import javax.swing.JOptionPane;

/**
 *
 * @author Is@@c Belo
 */
/*4 - Criar a Classe do Programa Principal, com o nome: “ProgramaCalculadora”, contendo no método main uma instanciação 
 de um objeto do tipo da própria Classe do programa, em seguida enviando a mensagem “menuPrincipal()” para este objeto.*/
public class CalculatorApp {
    
   private static double valor1;
   private static double valor2;
   private static double resultado;
 
   static void menuPrincipal()
   {
         Calculator calc = new Calculator();
        
         int opcao;
         String menu = "Programa Calculadora\n\n"+
                                "1-Somar\n"+
                                "2-Subtrair\n"+
                                "3-Multiplicar\n"+
                                "4-Dividir\n"+
                                "5-Potência\n"+
                                "6-Raiz Quadrada\n"+
                                "7-Finalizar\n\n";
        
        
         opcao=1;
         while (opcao != 7)
         {
               opcao = Integer.parseInt(
                          JOptionPane.showInputDialog(null,
                          menu,"Programa Calculadora - 2021",
                          JOptionPane.QUESTION_MESSAGE));
              
               switch (opcao)
               {
                     case 1:  //somar
                          setValor1(lerValor("Digite o primeiro número:"));
                          setValor2(lerValor("Digite o segundo número:"));
                          setResultado(calc.somar(getValor1(), getValor2()));
                          mostrarResultado("Somar");
 
                     case 2:  //subtrair
                          setValor1(lerValor("Digite o primeiro número:"));
                          setValor2(lerValor("Digite o segundo número:"));
                          setResultado(calc.subtrair(getValor1(), getValor2()));
                          mostrarResultado("Subtrair");
                    
                     case 3:  //multiplicar
                          setValor1(lerValor("Digite o primeiro número:"));
                          setValor2(lerValor("Digite o segundo número:"));
                          setResultado(calc.multiplicar(getValor1(), getValor2()));
                          mostrarResultado("Multiplicar");
 
                     case 4:  //dividir
                          setValor1(lerValor("Digite o primeiro número:"));
                          setValor2(lerValor("Digite o segundo número:"));
                          setResultado(calc.dividir(getValor1(), getValor2()));
                          mostrarResultado("Dividir");
 
                     case 5:  //potência
                          setValor1(lerValor("Digite o primeiro número:"));
                          setValor2(lerValor("Digite o segundo número:"));
                          setResultado(calc.elevarPotencia(getValor1(), getValor2()));
                          mostrarResultado("Potência");
 
                     case 6:  //raiz quadrada
                          //Implementar aqui...
 
               }
         }
                    
   }
  
   static double lerValor(String mensagem)
   {
         double valor;
         String strValor;
         strValor = JOptionPane.showInputDialog(null,
                     mensagem,"Entrada de Dados...",
                     JOptionPane.QUESTION_MESSAGE);
         valor = Double.parseDouble(strValor);
         return valor;
   }
  
   static void mostrarResultado(String operacao)
   {
         JOptionPane.showMessageDialog(null,
                     String.format("Resultado da Operação de %s:\n"+
                                "%.2f e %.2f resulta em %.2f",
                                operacao, getValor1(), getValor2(), getResultado()),
                                "Resultado",JOptionPane.PLAIN_MESSAGE);

   }
    
    
    
    

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        menuPrincipal();

    }

    /**
     * @return the valor1
     */
    public static double getValor1() {
        return valor1;
    }

    /**
     * @param aValor1 the valor1 to set
     */
    public static void setValor1(double aValor1) {
        valor1 = aValor1;
    }

    /**
     * @return the valor2
     */
    public static double getValor2() {
        return valor2;
    }

    /**
     * @param aValor2 the valor2 to set
     */
    public static void setValor2(double aValor2) {
        valor2 = aValor2;
    }

    /**
     * @return the resultado
     */
    public static double getResultado() {
        return resultado;
    }

    /**
     * @param aResultado the resultado to set
     */
    public static void setResultado(double aResultado) {
        resultado = aResultado;
    }
    

}
