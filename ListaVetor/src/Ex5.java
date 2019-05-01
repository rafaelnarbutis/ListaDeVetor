/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ubkit
 */
public class Ex5 {

    public static void main(String[] args) {
        long[] array = new long[100];
        double soma = 0;
        for (int cont = 0; cont < array.length; cont++) {
            double sorteio = Math.random() * 100 + 1;
            array[cont] = Math.round(sorteio);
            if(array[cont] % 10 ==  0){
                System.out.println(array[cont]);
            }else{
                System.out.print(array[cont]+" ");
            }
        }
        for (int cont = 89; cont < array.length; cont++) {
            soma += array[cont];
        }
        double media = soma / 10;
        double somaN = 0;
        for (int cont = 0; cont < array.length; cont++) {
            if (array[cont] < media) {
                somaN += array[cont];                
            }

        }
        System.out.println("");
        System.out.println("A media dos 10 ultimos " + media);
        System.out.println("A soma dos numeros abaixo da media é " + somaN);
    }

}
