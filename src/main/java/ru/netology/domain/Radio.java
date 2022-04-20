package ru.netology.domain;

public class Radio {

    public int currentStation = 5;
    public int minStation = 0;
    public int numberStation = 10;
    public int maxStation = numberStation - 1;
    public int currentVolume = 60;
    public int minVolume = 0;
    public int maxVolume = 100;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public Radio() {
    }

    public Radio(int currentVolume, int minVolume, int maxVolume) {
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) {
        numberStation = newNumberStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= minStation) {
            this.currentStation = minStation;
            return;
        }
        if (newCurrentStation >= numberStation) {
            this.currentStation = numberStation - 1;
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        setCurrentStation(currentStation + 1);
    }

    public void prevStation() {
        setCurrentStation(currentStation - 1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume = currentVolume - 1;
    }

}
