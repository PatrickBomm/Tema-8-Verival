package com.development;

import java.util.*;

public class GerenciaLugares {

    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public int verificaLugar(int id, int assento, int fileira) {

        if (assento > 20 || fileira > 60) {
            return 0;
        }

        if (id <= 100 && id > 0 && fileira > 20 || fileira < 0) {
            return 2;
        }
        if (id >= 101 && id <= 200 && fileira < 40 || fileira > 60) {
            return 2;
        } 
        
        for (Pessoa p : pessoas) {
            if (p.getFileira() == fileira && p.getAssento() == assento) {
                return 1;
            }

        }
        return 3;

    }

    public boolean addPessoa(int id, int assento, int fileira) {
        switch(verificaLugar(id, assento, fileira)){
            case 0:
                System.out.println("Assento ou fileira invalido");
                return false;
            case 1:
                System.out.println("Assento ocupado");
                return false;
            case 2:
                System.out.println("Assento bloqueado devido a distribuição de peso");
                return false;
            case 3:
                System.out.println("Ok, assento atribuído ao passageiro.");
                Pessoa p = new Pessoa(id, assento, fileira);
                pessoas.add(p);
                return true;
            
        }
        return false;

    }

}
