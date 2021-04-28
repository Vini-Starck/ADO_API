package ado2_algoritmos;

//Desenvolver uma função que recebe, por parâmetro, dois valores X e Z e calcula e retorna X elevado a Z

// ALUNO: Vinicius Starck Malghosian Cantafaro


public class Exercício_1 {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 1 ===");
        int X = 2;
        int Z = 5;
        
        int soma = 1;
        for(int c=0; c<Z; c++){
            soma = soma * X;
        }
        
        System.out.println("\n"+X+" elevado a "+Z+" é: "+soma);
    }
}