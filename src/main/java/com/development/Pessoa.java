package com.development;

public class Pessoa {
    private int id;
    private int assento;
    private int fileira;
    
    public Pessoa(int id, int assento, int fileira) {
        this.id = id;
        this.assento = assento;
        this.fileira = fileira;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id Pessoa=" + id + ", Ticket= F" + fileira + "A" + fileira + '}';
    }

}
