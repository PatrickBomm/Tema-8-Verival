package com.development;

public class Record {

    private String name;
    private int score;

    public Record(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return "Record{" + "name=" + name + ", score=" + score + '}';
    }
}
