package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void getCurrentChanel(){
        Radio radio = new Radio(7, 50, 10);

        radio.setChanel(7);

        int expected = 7;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChanel(){
        Radio radio = new Radio(0, 50, 10);

        radio.setChanel(10);

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChanel2(){
        Radio radio = new Radio(9, 50, 10);

        radio.setChanel(9);

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentChanel3(){
        Radio radio = new Radio(9, 50, 10);

        radio.setChanel(-1);

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void next(){
        Radio radio = new Radio(6, 50, 10);
        radio.setChanel(6);
        radio.next2();

        int expected = 7;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void next2(){
        Radio radio = new Radio(9, 50, 10);
        radio.setChanel(9);
        radio.next2();

        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }


    @Test
    public void prev(){
        Radio radio = new Radio(3, 50, 10);
        radio.setChanel(3);
        radio.prev2();

        int expected = 2;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    public void prev2(){
        Radio radio = new Radio(0, 50, 10);
        radio.setChanel(0);
        radio.prev2();

        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }


    @Test
    public void getCurrentVolume(){
        Radio radio = new Radio(6, 6, 10);

        radio.setVolume(6);

        int expected = 6;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume(){
        Radio radio = new Radio(4, 10, 10);

        radio.setVolume(10);

        int expected = 10;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume2(){
        Radio radio = new Radio(4, 11, 10);

        radio.setVolume(11);

        int expected = 11;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void up(){
        Radio radio = new Radio(4, 28, 10);

        radio.setVolume(28);
        radio.up2();

        int expected = 29;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void up2(){
        Radio radio = new Radio(4, 2, 10);

        radio.setVolume(2);
        radio.up2();

        int expected = 3;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void up3(){
        Radio radio = new Radio(4, 150, 10);

        radio.setVolume(150);
        radio.up2();

        int expected = 100;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void down(){
        Radio radio = new Radio(4, 2, 10);

        radio.setVolume(2);
        radio.down2();

        int expected = 1;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void down2(){
        Radio radio = new Radio(4, 0, 10);

        radio.setVolume(0);
        radio.down2();

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void down3(){
        Radio radio = new Radio(4, -150, 10);

        radio.setVolume(-150);
        radio.down2();

        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void setCurrentVolume3(){
        Radio radio = new Radio(4, 1000, 10);
        radio.setVolume(1000);
        int expected = 100;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume4(){
        Radio radio = new Radio(4, 100, 10);

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

}
