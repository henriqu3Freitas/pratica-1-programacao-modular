/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica1;

import java.util.Scanner;

/**
 *
 * @author 1640295
 */
public class Pratica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Pessoa p = new Pessoa("", "", 0, 0, 0, 0);
        System.out.printf("Digite o seu nome: ");
        p.setNome(e.nextLine());
        System.out.printf("Digite o seu sobrenome: ");
        p.setSobrenome(e.nextLine());
        System.out.print("Digite a sua idade: ");
        p.setIdade(e.nextInt());
        System.out.printf("Digite a sua altura: ");
        p.setAltura(e.nextDouble());
        System.out.printf("Digite o seu peso: ");
        p.setPeso(e.nextDouble());
        p.calculaImc();

        System.out.println(p.getNome() + " " + p.getSobrenome() + " " + p.getIdade() + " " + p.getAltura() + " " + p.getPeso() + " " + p.getImc());
        
        System.out.println(p.InformaObesidade());
        
    }
}

