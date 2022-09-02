package ru.SmartHouse;

public class Radio {

    public int currentVolume;

    public int currentStation;


    // STATION *****************************************************************

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNext(int newCurrentStation) {
        if (newCurrentStation < 9) {
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
            if (newCurrentStation <= 9) {
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
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        } else {
            currentVolume = 10;
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
