public class Radio {
    private int radioSurveillanceNumber;
    private int soundVolume;
    private int maxStation;

    public Radio() {
maxStation = 9;

    }

    public Radio(int stationsCount){
maxStation = stationsCount -1;

    }


    public void nextVolume(){
        if (soundVolume <100){
            soundVolume++;
        }
        else {
            soundVolume = 100;
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
        if (radioSurveillanceNumber < maxStation) {
            radioSurveillanceNumber++;
        } else {
            radioSurveillanceNumber = 0;
        }
    }

    public void previous() {
        if (radioSurveillanceNumber > 0) {
            radioSurveillanceNumber--;
        } else {
            radioSurveillanceNumber = maxStation;
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


        this.soundVolume = soundVolume;

    }
}