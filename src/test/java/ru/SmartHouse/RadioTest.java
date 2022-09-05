package ru.SmartHouse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

// STATION TESTS ********************************************

    @Test
    public void shouldTestNextStation() {
        ru.SmartHouse.Radio station = new ru.SmartHouse.Radio();

        station.next();

        int expected = 1;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNextStationMax() {
        ru.SmartHouse.Radio station = new ru.SmartHouse.Radio();

        station.setCurrentStation(9);

        station.next();

        int expected = 0;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTestPrevStation() {
        ru.SmartHouse.Radio station = new ru.SmartHouse.Radio();

        station.setCurrentStation(9);

        station.prev();

        int expected = 8;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestPrevStationMin() {
        ru.SmartHouse.Radio station = new ru.SmartHouse.Radio();

        station.prev();

        int expected = 9;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTestEnterStation() {
        ru.SmartHouse.Radio station = new ru.SmartHouse.Radio();

        station.setEnter(5);

        int expected = 5;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEnterMinStation() {
        ru.SmartHouse.Radio station = new ru.SmartHouse.Radio();

        station.setEnter(0);

        int expected = 0;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEnterMaxStation() {
        ru.SmartHouse.Radio station = new ru.SmartHouse.Radio();

        station.setEnter(9);

        int expected = 9;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestEnterUnderMinStation() {
        ru.SmartHouse.Radio station = new ru.SmartHouse.Radio();

        station.setEnter(-1);

        int expected = 0;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTestEnterOverMaxStation() {
        ru.SmartHouse.Radio station = new ru.SmartHouse.Radio();

        station.setEnter(10);

        int expected = 0;

        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

// VOLUME TESTS ***********************************************

    @Test
    public void increaseVolumeZero() {
        ru.SmartHouse.Radio volume = new ru.SmartHouse.Radio();

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {
        ru.SmartHouse.Radio volume = new ru.SmartHouse.Radio();

        volume.setCurrentVolume(9);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        ru.SmartHouse.Radio volume = new ru.SmartHouse.Radio();

        volume.setCurrentVolume(10);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTen() {
        ru.SmartHouse.Radio volume = new ru.SmartHouse.Radio();

        volume.setCurrentVolume(10);

        volume.decreaseVolume();

        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        ru.SmartHouse.Radio volume = new ru.SmartHouse.Radio();

        volume.setCurrentVolume(1);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMin() {
        ru.SmartHouse.Radio volume = new ru.SmartHouse.Radio();

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}