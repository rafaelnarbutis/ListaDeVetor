/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ubkit
 */
public class Ex3 {

    public static void main(String[] args) {
        long[] array = new long[100];
        double soma = 0;
        for (int cont = 0; cont < array.length; cont++) {
            double sorteio = Math.random() * 100 + 1;
            array[cont] = Math.round(sorteio);
            soma += array[cont];
        }
        double media = soma / array.length;
        System.out.println("A media dos 100 numeros seria " + media);
    }

}
