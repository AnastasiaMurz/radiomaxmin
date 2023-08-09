import java.lang.annotation.Target;

public class Radio {
    private int currentVolume; // громкость
    private int currentRadioStation; // радиостанция

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void upVolum() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolum() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }
}

