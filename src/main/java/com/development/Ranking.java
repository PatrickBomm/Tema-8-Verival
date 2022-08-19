package com.development;

import java.util.*;

public class Ranking {
    ArrayList<Record> records = new ArrayList<Record>(10);
    public ArrayList<Record> allRecords = new ArrayList<Record>();

    public Ranking() {
    }

    // Insere novo registro na lista mantendo a ordenação // Retorna true se a
    // inserção foi possível
    public boolean add(Record record) {
        if (records.size() < 10) {
            records.add(record);
            allRecords.add(record);
            ordenacao(records);
            ordenacao(allRecords);
            return true;
        }
        for (Record r : records) {
            if (r.getScore() < record.getScore()) {
                records.add(records.indexOf(r), record);
                allRecords.add(record);
                ordenacao(records);
                ordenacao(allRecords);
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    // Retorna à quantidade de registros armazenados
    public int numRecords() {
        return allRecords.size();
    }

    // Retorna o i-ésimo registro armazenado ou null se o valor de i for inválido
    public Record getScore(int i) {
        if (i < 0 || i >= allRecords.size()) {
            return null;
        }
        return allRecords.get(i);
    }

    // Retorna o pior score armazenado Retorna null se a lista estiver vazia
    public Record worstScore() {
        Record rec = null;
        for (Record r : allRecords) {
            if (rec == null) {
                rec = r;
            } else {
                if (rec.getScore() > r.getScore()) {
                    rec = r;
                }
            }
        }
        return rec;
    }

    // Retorna o melhor score armazenado Retorna null se a lista estiver vazia
    public Record bestScore() {
        Record rec = null;
        for (Record r : allRecords) {
            if (rec == null) {
                rec = r;
            } else {
                if (rec.getScore() < r.getScore()) {
                    rec = r;
                }
            }
        }
        return rec;
    }

    // Método para ordenar os ArrayList
    public void ordenacao(ArrayList array) {

        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size(); j++) {
                if (((Record) array.get(i)).getScore() > ((Record) array.get(j)).getScore()) {
                    Record aux = (Record) array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, aux);
                }
            }
        }
    }
}
