package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.development.Ranking;
import com.development.Record;

public class TesteRanking {
    com.development.Ranking ranking = new Ranking();

    // antes de todos testes
    @Before
    public void setUp() {
        for (int i = 0; i < 20; i++) {
            int score = i + 10;
            String nome = "A" + i;

            com.development.Record rec = new Record(nome, score);
            ranking.add(rec);
        }
    }

    // teste tarefa numero 9

    @Test
    public void testAddWithAHighScore() {
        com.development.Record rec = new Record("A", 50);

        assertEquals(true, ranking.add(rec));
    }

    @Test
    public void testAddWithALowScore() {
        com.development.Record rec = new Record("A", 10);
        ranking.add(rec);
        assertEquals(false, ranking.add(rec));
    }

    @Test
    public void testNumRecords() {
        assertEquals(20, ranking.numRecords());
    }

    @Test
    public void testGetScore(){
        Record teste = ranking.allRecords.get(1);
        assertEquals(teste, ranking.getScore(1));
    }

    @Test
    public void testWorstScore(){
        Record teste = ranking.allRecords.get(ranking.allRecords.size() - 1);
        assertEquals(teste, ranking.worstScore());
    }

    @Test
    public void testBestScore(){
        Record teste = ranking.allRecords.get(0);
        assertEquals(teste, ranking.bestScore());
    }

}
