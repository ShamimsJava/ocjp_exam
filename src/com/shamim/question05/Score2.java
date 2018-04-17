package com.shamim.question05;

public class Score2 implements Comparable<Score2> {

    private int wins, losses;

    public Score2(int wins, int losses) {
        this.wins = wins;
        this.losses = losses;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    @Override
    public String toString() {
        return "Score2 [wins=" + wins + ", losses=" + losses + "]";
    }

    @Override
    public int compareTo(Score2 other) {

        return 0;
    }

    public static void main(String[] args) {

        Score2 score2 = new Score2(25, 20);
        System.out.println(score2);
    }

}
