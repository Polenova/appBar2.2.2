package ru.android.polenova;

public class UserHealth {
    private double weight;
    private int steps;

    UserHealth(double weight, int steps) {
        this.weight = weight;
        this.steps = steps;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "вес " + weight +
                ", количество шагов " + steps;
    }
}

