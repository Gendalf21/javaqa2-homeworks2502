package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void currentStation() {
        Radio rd = new Radio();
        rd.currentStation = 8;

        int expected = 8;
        int actual = rd.getCurrentStation();

        assertEquals(actual, expected);
    }

    @Test
    public void setCurrentStationLow() {
        Radio rd = new Radio();
        rd.setCurrentStation(-1);

        int expected = 0;
        int actual = rd.getCurrentStation();

        assertEquals(actual, expected);
    }

    @Test
    public void setCurrentStationIn() {
        Radio rd = new Radio();
        rd.setCurrentStation(5);

        int expected = 5;
        int actual = rd.getCurrentStation();

        assertEquals(actual, expected);
    }

    @Test
    public void setCurrentStationUp() {
        Radio rd = new Radio();
        rd.setCurrentStation(11);

        int expected = 0;
        int actual = rd.getCurrentStation();

        assertEquals(actual, expected);
    }

    @Test
    public void nextStationUp() {
        Radio rd = new Radio();
        rd.setCurrentStation(9);
        rd.nextStation();

        int expected = 0;
        int actual = rd.getCurrentStation() - 9;

        assertEquals(actual, expected);
    }

    @Test
    public void nextStationIn() {
        Radio rd = new Radio();
        rd.setCurrentStation(1);
        rd.nextStation();

        int expected = 2;
        int actual = rd.getCurrentStation();

        assertEquals(actual, expected);
    }

    @Test
    public void prevStationIn() {
        Radio rd = new Radio();
        rd.setCurrentStation(8);
        rd.prevStation();

        int expected = 7;
        int actual = rd.getCurrentStation();

        assertEquals(actual, expected);
    }

    @Test
    public void prevStationLow() {
        Radio rd = new Radio();
        rd.setCurrentStation(0);
        rd.prevStation();

        int expected = 9;
        int actual = rd.getCurrentStation() + 9;

        assertEquals(actual, expected);
    }

    @Test
    public void currentVolume() {
        Radio rd = new Radio();
        rd.currentVolume = 8;

        int expected = 8;
        int actual = rd.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    public void setCurrentVolumeLow() {
        Radio rd = new Radio();
        rd.setCurrentVolume(-5);

        int expected = 0;
        int actual = rd.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    public void setCurrentVolumeIn() {
        Radio rd = new Radio();
        rd.setCurrentVolume(7);

        int expected = 7;
        int actual = rd.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    public void setCurrentVolumeUp() {
        Radio rd = new Radio();
        rd.setCurrentVolume(11);

        int expected = 0;
        int actual = rd.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    public void increaseVolumeUp() {
        Radio rd = new Radio();
        rd.setCurrentVolume(10);
        rd.increaseVolume();

        int expected = 10;
        int actual = rd.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    public void increaseVolumeIn() {
        Radio rd = new Radio();
        rd.setCurrentVolume(5);
        rd.increaseVolume();

        int expected = 6;
        int actual = rd.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    public void decreaseVolumeIn() {
        Radio rd = new Radio();
        rd.setCurrentVolume(9);
        rd.decreaseVolume();

        int expected = 8;
        int actual = rd.getCurrentVolume();

        assertEquals(actual, expected);
    }
    @Test
    public void decreaseVolumeLow() {
        Radio rd = new Radio();
        rd.setCurrentVolume(0);
        rd.decreaseVolume();

        int expected = 0;
        int actual = rd.getCurrentVolume();

        assertEquals(actual, expected);
    }

}