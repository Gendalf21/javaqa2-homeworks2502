package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test // current station1
    public void shouldUseConstuctorCurrentStation1 () {
        Radio rd = new Radio(10,0,20,21,50,0,100);
        assertEquals( 10, rd.getCurrentStation());
    }

    @Test // current station2
    public void shouldUseConstuctorCurrentStation2 () {
        Radio rd1 = new Radio();
        assertEquals( 5, rd1.getCurrentStation());
    }

    @Test // current volume1
    public void shouldUseConstuctorCurrentVolume1 () {
        Radio rd = new Radio (10,0,15,14,20,0,100);
        assertEquals( 20, rd.getCurrentVolume());
    }

    @Test // current volume2
    public void shouldUseConstuctorCurrentVolume2 () {
        Radio rd1 = new Radio();
        assertEquals( 60, rd1.getCurrentVolume());
    }

    @Test // next station1
    public void shouldUseConstuctorNextStation1 () {
        Radio rd = new Radio (5,0,21,20,15,0,100);
        rd.nextStation();

        assertEquals (6, rd.getCurrentStation());
    }

    @Test // next station2
    public void shouldUseConstuctorNextStation2 () {
        Radio rd1 = new Radio();
        rd1.nextStation();

        assertEquals (6, rd1.getCurrentStation());
    }

}