package ru.netology.domain;

public class Radio {

    public int currentStation = 5;
    public int minStation = 0;
    public int numberStation = 10;
    public int maxStation = numberStation - 1;
    public int currentVolume = 60;
    public int minVolume = 0;
    public int maxVolume = 100;

    public Radio(int currentStation, int minStation, int numberStation, int maxStation, int currentVolume, int minVolume, int maxVolume) {
        this.currentStation = currentStation;
        this.minStation = minStation;
        this.numberStation = numberStation;
        this.maxStation = maxStation;
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public Radio() {
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
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

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        setCurrentVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        setCurrentVolume(currentVolume - 1);
    }

}
