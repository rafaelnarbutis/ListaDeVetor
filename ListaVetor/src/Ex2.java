/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafael.fnarbutis
 */
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double[] numero = new double[5];
        double soma = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um numero");
            numero[i] = scn.nextDouble();
            soma += numero[i];
        }
        double media = soma / numero.length;
        System.out.println("A media é " + media);
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > media) {
                System.out.println(numero[i] + " é acima da media");
            }
        }
    }

}
