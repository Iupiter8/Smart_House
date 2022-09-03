package ru.SmartHouse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

// STATION TESTS ********************************************

    @Test
    public void shouldBigMaxStation() {
        Radio station = new Radio(102);

        station.setNext(100);

        Assertions.assertEquals(101, station.getCurrentStation());


    }


    @Test
    public void shouldTestNextStation() {
        Radio station = new Radio();

        station.setNext(0);

        int expected = 1;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNextStationMax() {
        Radio station = new Radio(15);

        station.setNext(14);

        int expected = 0;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTestPrevStation() {
        Radio station = new Radio();

        station.setPrev(9);

        int expected = 8;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPrevStationMin() {
        Radio station = new Radio();

        station.setPrev(0);

        int expected = 9;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTestEnterStation() {
        Radio station = new Radio();

        station.setEnter(5);

        int expected = 5;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEnterMinStation() {
        Radio station = new Radio();

        station.setEnter(0);

        int expected = 0;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEnterMaxStation() {
        Radio station = new Radio();

        station.setEnter(9);

        int expected = 9;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEnterUnderMinStation() {
        Radio station = new Radio();
// Радио на котором можно ввести отрицательный номер станции :)
        station.setEnter(-1);

        int expected = 0;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTestEnterOverMaxStation() {
        Radio station = new Radio(11);

        station.setEnter(11);

        int expected = 0;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

// VOLUME TESTS ***********************************************

    @Test
    public void increaseVolumeZero() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(0);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(99);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTen() {
        Radio volume = new Radio();

        volume.setDecreaseVolume(100);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio volume = new Radio();

        volume.setDecreaseVolume(1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMin() {
        Radio volume = new Radio();

        volume.setDecreaseVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
