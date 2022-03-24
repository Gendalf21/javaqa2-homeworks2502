package ru.netology.domain;

public class Radio {

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation >= 0 && currentStation < 9) {
            setCurrentStation(currentStation + 1);
        }
        if (currentStation == 9) {
            setCurrentStation(0);
        }
    }

    public void prevStation() {
        if (currentStation > 0 && currentStation <= 9) {
            setCurrentStation(currentStation - 1);
        }
        if (currentStation == 0) {
            setCurrentStation(9);
        }
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= 0 && currentVolume < 10) {
            setCurrentVolume(currentVolume + 1);
        }
        if (currentVolume == 10) {
            setCurrentVolume(10);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0 && currentVolume <= 9) {
            setCurrentVolume(currentVolume - 1);
        }
        if (currentVolume == 0) {
            setCurrentVolume(0);
        }
    }

}
