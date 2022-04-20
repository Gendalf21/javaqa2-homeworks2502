package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldUseConstructorNumberStation1() {
        Radio rd = new Radio(10);

        assertEquals(10, rd.getNumberStation());
    }
    @Test
    public void shouldUseConstructorNumberStation2() {
        Radio rd1 = new Radio();
        rd1.setNumberStation(10);

        assertEquals(10, rd1.getNumberStation());
    }


    @Test
    public void shouldUseConstuctorCurrentStation1() {
        Radio rd1 = new Radio();

        assertEquals(5, rd1.getCurrentStation());
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
    public void shouldUseConstuctorNextStation() {
        Radio rd1 = new Radio();
        rd1.nextStation();

        assertEquals(6, rd1.getCurrentStation());
    }

    @Test
    public void shouldUseConstuctorPrevtStation() {
        Radio rd1 = new Radio();
        rd1.prevStation();

        assertEquals(4, rd1.getCurrentStation());
    }

    @Test
    public void shouldUseConstuctorCurrentVolume1() {
        Radio rd1 = new Radio();

        assertEquals(60, rd1.getCurrentVolume());
    }

    @Test
    public void increaseVolumeIn() {
        Radio rd1 = new Radio();
        rd1.increaseVolume();

        assertEquals(61, rd1.getCurrentVolume());
    }

    @Test
    public void increaseVolumeUp() {
        Radio rd3 = new Radio (50, 0, 50);
        rd3.increaseVolume();

        assertEquals(50, rd3.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeIn() {
        Radio rd1 = new Radio();
        rd1.decreaseVolume();

        assertEquals(59, rd1.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeLow() {
        Radio rd3 = new Radio(0, 0, 100 );
        rd3.decreaseVolume();

        assertEquals(0, rd3.getCurrentVolume());
    }
}