package ado2_algoritmos;

// Um vetor é palíndromo se ele não se altera quando as posições das componentes são invertidas. Por exemplo, o
// vetor v = {1, 3, 5, 2, 2, 5, 3, 1} é palíndromo. Desenvolver uma função que recebe por parâmetro um vetor de
// inteiros e retorna uma valor booleano indicando de o vetor é ou não palíndromo.

// ALUNO: Vinicius Starck Malghosian Cantafaro

public class Exercício_3 {
    public static void main(String args[]){
        System.out.println("=== EXERCÍCIO 3 ===");
        
        boolean vet;
        int [] num = {1,2,3,4,4,3,2,1};
        
        if(num[0] == num[7] && num[1] == num[6] && num[2] == num[5] && num[3] == num[4]){
            vet = true;
            if(vet = true){
                System.out.println("\nO vetor é palíndromo");
            }
        }else{
            System.out.println("\nO vetor não é palíndromo");
        }
    }
}