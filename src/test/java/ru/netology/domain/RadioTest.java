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
    public void setCurrentStation() {
        Radio rd = new Radio();
        rd.setCurrentStation(-11);

        int expected = 0;
        int actual = rd.getCurrentStation();

        assertEquals(actual, expected);
    }

    @Test
    public void nextStation() {
        Radio rd = new Radio();
        rd.setCurrentStation(9);
        rd.nextStation();

        int expected = 0;
        int actual = rd.getCurrentStation();

        assertEquals(actual, expected);
    }

    @Test
    public void prevStation() {
        Radio rd = new Radio();
        rd.setCurrentStation(0);
        rd.prevStation();

        int expected = 9;
        int actual = rd.getCurrentStation();

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
    public void setCurrentVolume() {
        Radio rd = new Radio();
        rd.setCurrentVolume(7);

        int expected = 7;
        int actual = rd.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    public void increaseVolume() {
        Radio rd = new Radio();
        rd.setCurrentVolume(10);
        rd.increaseVolume();

        int expected = 10;
        int actual = rd.getCurrentVolume();

        assertEquals(actual, expected);
    }

    @Test
    public void decreaseVolume() {
        Radio rd = new Radio();
        rd.setCurrentVolume(0);
        rd.decreaseVolume();

        int expected = 0;
        int actual = rd.getCurrentVolume();

        assertEquals(actual, expected);
    }

}