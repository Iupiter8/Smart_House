package ru.SmartHouse;

public class Radio {

    private int maxCountStation = 0; //поле приватное
    public Radio(int newMaxCountStation) {   //конструктор к нему
        maxCountStation = maxCountStation + newMaxCountStation -1;
    }

    public Radio() {              // еще один конструктор к тому же полю
        maxCountStation = 9;
    }

    private int currentVolume;
    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    private int currentStation;
    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }


    // STATION *****************************************************************

    public int getCurrentStation() {
        return currentStation;
    }

    public void next() {
        if (currentStation < maxCountStation) {
            currentStation += 1;
            //return; 'return' не нужен, так как последняя инструкция в методе void
        } else {
            currentStation = 0;

        }


    }

    public void prev() {
        if (currentStation > 0) {
            currentStation -= 1;
            //return; 'return' не нужен, так как последняя инструкция в методе void
        } else {
            currentStation = maxCountStation;

        }


    }


    public void setEnter(int newCurrentStation) {
        if (newCurrentStation >= 0) {
            if (newCurrentStation <= maxCountStation) {
                currentStation = newCurrentStation;
            }
            //return; 'return' не нужен, так как последняя инструкция в методе void
        }
    }


    // VOLUME *****************************************************************


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        } else {
            currentVolume = 0;
        }
    }


}

