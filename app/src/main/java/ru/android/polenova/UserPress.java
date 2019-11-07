package ru.android.polenova;

public class UserPress {
    private int highPress;
    private int lowPress;
    private int pulse;
    private String date;
    private boolean t;

    UserPress(int highPress, int lowPress, int pulse, String date, boolean t) {
        this.highPress = highPress;
        this.lowPress = lowPress;
        this.pulse = pulse;
        this.date = date;
        this.t = t;
    }


    public int getHighPress() {
        return highPress;
    }

    public void setHighPress(int highPress) {
        this.highPress = highPress;
    }

    public int getLowPress() {
        return lowPress;
    }

    public void setLowPress(int lowPress) {
        this.lowPress = lowPress;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isT() {
        return t;
    }

    public void setT(boolean t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return  "верхнее давление " + highPress +
                ", нижние давление " + lowPress +
                ", пульс " + pulse +
                ", дата измерений " + date +
                ", тахикордия " + t;
    }
}
