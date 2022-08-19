package com.development;

import java.util.*;

public class App {
    static Processamento processamento = new Processamento();

    public static void main(String[] args) {
        view();

    }

    public static void view() {

        // System.out.println("Digite o id do passageiro: ");
        // Scanner sc = new Scanner(System.in);
        // int id = sc.nextInt();
        // System.out.println("Digite o assento: ");
        // int assento = sc.nextInt();
        // if(assento > 20){
        // System.out.println("\nAssento invalido");
        // view();
        // sc.close();
        // return;
        // }
        // System.out.println("Digite a fileira: ");
        // int fileira = sc.nextInt();
        // if(fileira > 60){
        // System.out.println("\nFileira invalida");
        // view();
        // sc.close();
        // return;
        // }

        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int id = r.nextInt(500);
            int assento = r.nextInt(20);
            int fileira = r.nextInt(60);

            processamento.addPessoa(id, assento, fileira);
        }
        for(int j = 0; j < 10; j++){
            int id = r.nextInt(500);
            int assento = r.nextInt(30);
            int fileira = r.nextInt(100);

            processamento.addPessoa(id, assento, fileira);
        }

        System.out.println("\n\n\n\n\n\n\n\n");
        

        for(int k = 0; k < processamento.pessoas.size(); k++){
            System.out.println(processamento.pessoas.get(k));
        }

    }
}
