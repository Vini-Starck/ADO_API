package ado2_algoritmos;

// Desenvolver um programa que leia uma matriz 2 x 2 de valores inteiros e apresente o seu determinante

// ALUNO: Vinicius Starck Malghosian Cantafaro

import java.util.Scanner;

public class Exercício_4 {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 4 ===");
        int m [][] = new int[2][2];
        
        for(int x=0; x<2; x++){
            for(int y=0; y<2; y++){
                System.out.println("Digite o valor pertencente a "+(x+1)+"º linha e "+(y+1)+"º coluna:");
                m[x][y] = leitor.nextInt();
            }
        }
        
        int det = (m[0][0]*m[1][1])-(m[0][1]*m[1][0]);
        System.out.println("\nDeterminante: "+det);
    }
}