package ado2_algoritmos;

// Desenvolver uma função que recebe uma matriz bidimensional por parâmetro e retorne a transposta desta matriz.

// ALUNO: Vinicius Starck Malghosian Cantafaro

import java.util.Random;

public class Exercício_5 {
    public static void main(String args[]){
        Random gerador = new Random();
        System.out.println("=== EXERCÍCIO 5 ===");
        
        int matriz [][] = new int[3][4]; // cria matriz
        
        for(int x=0; x<3; x++){
            for(int y=0; y<4; y++){
                matriz[x][y] = gerador.nextInt(100); // gera números
            }
        }
        
        System.out.print("\nMATRIZ:\n\n");
        
        for(int x=0; x<3; x++){
            for(int y=0; y<4; y++){
                System.out.print(matriz[x][y]+"\t");
            }
            System.out.print("\n");
        }
        
        int matriztransposta[][] = new int[matriz[0].length][matriz.length]; // cria transposta
        
        for(int x=0; x<matriztransposta.length; x++){
            for(int y=0; y<matriztransposta[0].length; y++){
                matriztransposta[x][y] = matriz[y][x];
            }
        }
        
        System.out.print("\nMATRIZ TRANSPOSTA:\n\n");
        
        for(int x=0; x<matriztransposta.length; x++){
            for(int y=0; y<matriztransposta[0].length; y++){
                System.out.print(matriztransposta[x][y]+"\t");
            }
            System.out.print("\n");
        }
    }
}