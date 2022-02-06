package ru.netology.radio;

public class Radio {
    private int currentChanel;
    private int currentVolume;
    private int Chanel = 10;

    public Radio(int currentChanel, int currentVolume, int chanel) {
        this.currentChanel = currentChanel;
        this.currentVolume = currentVolume;
        Chanel = chanel;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }


    public void setChanel(int Chanel) {

        if (currentChanel < 0) {
            currentChanel = 9;
        }
        if (currentChanel > 9) {
            currentChanel = 0;
        }
        this.currentChanel = currentChanel;
    }

    public void next2() {
        setChanel(currentChanel = currentChanel + 1);
    }

    public void prev2() {
        setChanel(currentChanel = currentChanel - 1);
    }


    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int Volume) {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void up2() {
        setVolume(currentVolume = currentVolume + 1);
    }

    public void down2() {
        setVolume(currentVolume = currentVolume - 1);
    }


}