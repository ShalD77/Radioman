public class Radio {
    public int radioSurveillanceNumber;
    public int soundVolume;

    public void nextVolume(){
        if (soundVolume <10){
            soundVolume++;
        }
        else {
            soundVolume = 10;
        }
    }
    public void previousVolume(){
        if (soundVolume >0){
            soundVolume--;
        }else {
            soundVolume = 0;
        }

    }

    public void next() {
        if (radioSurveillanceNumber < 9) {
            radioSurveillanceNumber++;
        } else {
            radioSurveillanceNumber = 0;
        }
    }

    public void previous() {
        if (radioSurveillanceNumber > 0) {
            radioSurveillanceNumber--;
        } else {
            radioSurveillanceNumber = 9;
        }
    }


    public int getRadioSurveillanceNumber() {
        return radioSurveillanceNumber;
    }

    public void setRadioSurveillanceNumber(int radioSurveillanceNumber) {
        if (radioSurveillanceNumber < 0) {
            return;
        }
        if (radioSurveillanceNumber > 9) {
            return;
        }
        this.radioSurveillanceNumber = radioSurveillanceNumber;

    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 10) {
            return;
        }
        this.soundVolume = soundVolume;

    }
}
