package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldUseConstuctorCurrentStation1() {
        Radio rd = new Radio(23, 0, 22, 21, 50, 0, 100);
        assertEquals(23, rd.getCurrentStation());
    }

    @Test
    public void shouldUseConstuctorCurrentStation2() {
        Radio rd1 = new Radio();
        rd1.setCurrentStation(15);
        assertEquals(9, rd1.getCurrentStation());
    }

    @Test
    public void shouldUseConstuctorCurrentStation3() {
        Radio rd1 = new Radio();
        rd1.setCurrentStation(0);
        assertEquals(0, rd1.getCurrentStation());
    }

    @Test
    public void shouldUseConstuctorCurrentVolume1() {
        Radio rd = new Radio(10, 0, 15, 14, 102, 0, 100);
        assertEquals(102, rd.getCurrentVolume());
    }

    @Test
    public void shouldUseConstuctorCurrentVolume2() {
        Radio rd = new Radio(10, 0, 15, 14, 0, 0, 100);
        assertEquals(0, rd.getCurrentVolume());
    }

    @Test
    public void shouldUseConstuctorNextStation() {
        Radio rd = new Radio(5, 0, 21, 20, 15, 0, 100);
        rd.nextStation();

        assertEquals(6, rd.getCurrentStation());
    }

    @Test
    public void shouldUseConstuctorPrevtStation() {
        Radio rd1 = new Radio();
        rd1.prevStation();

        assertEquals(4, rd1.getCurrentStation());
    }

    @Test
    public void increaseVolumeIn() {
        Radio rd = new Radio(10, 0, 20, 19, 10, 0, 100);
        rd.increaseVolume();

        assertEquals(11, rd.getCurrentVolume());
    }

    @Test
    public void increaseVolumeUp() {
        Radio rd = new Radio(10, 0, 20, 19, 100, 0, 100);
        rd.increaseVolume();

        assertEquals(100, rd.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeIn() {
        Radio rd = new Radio(10, 0, 20, 19, 50, 0, 100);
        rd.decreaseVolume();

        assertEquals(49, rd.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeLow() {
        Radio rd = new Radio(10, 0, 20, 19, 0, 0, 100);
        rd.decreaseVolume();

        assertEquals(0, rd.getCurrentVolume());
    }
}