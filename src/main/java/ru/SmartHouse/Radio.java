package ru.SmartHouse;

public class Radio {

    private int currentVolume;

    private int currentStation;
    private int maxCountStation = 0;



    // STATION *****************************************************************


    public Radio(int band) {
        maxCountStation = maxCountStation + band - 1;
    }

    public Radio() {
        maxCountStation = 9;
    }



    public int getCurrentStation() {
        return currentStation;
    }

    public void setNext(int newCurrentStation) {
        if (newCurrentStation < maxCountStation) {
            currentStation = newCurrentStation + 1;
            //return; 'return' не нужен, так как последняя инструкция в методе void
        } else {
            currentStation = 0;

        }


    }

    public void setPrev(int newCurrentStation) {
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation - 1;
            //return; 'return' не нужен, так как последняя инструкция в методе void
        } else {
            currentStation = 9;

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

    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            currentVolume = newCurrentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void setDecreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


}