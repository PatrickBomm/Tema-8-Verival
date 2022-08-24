package com.development;

import java.util.*;

public class App {
    static GerenciaLugares processamento = new GerenciaLugares();

    // main test 8
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
        Random rn = new Random();

        for (int i = 0; i < 20; i++) {
            int id = r.nextInt(500);
            int assento = r.nextInt(20);
            int fileira = rn.nextInt(60);

            processamento.addPessoa(id, assento, fileira);
        }
        for(int j = 0; j < 20; j++){
            int id = r.nextInt(500);
            int assento = r.nextInt(30);
            int fileira = rn.nextInt(100);

            processamento.addPessoa(id, assento, fileira);
        }

        System.out.println("\n\n\n\n\n\n\n\n");
        

        for(int k = 0; k < processamento.pessoas.size(); k++){
            System.out.println(processamento.pessoas.get(k));
        }

    }

    //main teste 9
    // public static void main(String[] args) {
    //     Ranking ranking = new Ranking();
    //     Random r = new Random();
    //     for(int i = 0; i < 20; i++){
    //         String nome = "A" + i;
    //         int score = r.nextInt(100);
            
    //         Record rec = new Record(nome, score);
    //         ranking.add(rec);
    //     }

    //     for(int i = 0; i < ranking.allRecords.size()-1; i++){
    //         System.out.println(ranking.allRecords.get(i));
    //     }

    // }
}
