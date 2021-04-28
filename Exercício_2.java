package ado2_algoritmos;

// Desenvolver um programa que leia um vetor de 16 posições de valores inteiros e troque os 8 primeiros valores
// pelos 8 últimos valores e vice-versa. Ao final apresentar na tela os dados do vetor obtido.

// ALUNO: Vinicius Starck Malghosian Cantafaro

import java.util.Scanner;

public class Exercício_2 {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 2 ===");
        
        int [] num = new int[16];
        int [] ghost = new int[16];
        
        for(int x=0; x<16; x++){
            System.out.println("Digite o "+(x+1)+"º valor:");
            num[x] = leitor.nextInt();
            ghost[x] = num[x];
        }
        
        for(int x=0; x<16; x++){
            num[x] = ghost[15-x];
        }
        
        for(int x=0; x<16; x++){
            System.out.println("Vetor final na posição "+x+" = "+num[x]);
        }
    }
}