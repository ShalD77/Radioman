import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void radioTest1() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(1);

        int expected = 1;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestZero() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(0);

        int expected = 0;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestMinus() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(-1);

        int expected = 0;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTest9() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(9);

        int expected = 9;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestTen() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(10);

        int expected = 0;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTest8() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(8);

        int expected = 8;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestReturn() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(-1);

        radio.previous();

        int expected = 9;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestReturn1() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(1);

        radio.previous();

        int expected = 0;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestReturnZero() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(0);

        radio.previous();

        int expected = 9;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestNext0() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioTestNext9() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(8);

        radio.next();

        int expected = 9;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void radioTestNext() {
        Radio radio = new Radio();
        radio.setRadioSurveillanceNumber(10);

        radio.next();

        int expected = 1;
        int actual = radio.getRadioSurveillanceNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume1() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);


        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeZero() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);


        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMinus() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);


        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void volume99() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);


        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume100() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);


        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeNext() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeNext19() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumePrev() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.previousVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumePrevMinus() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);
        radio.previousVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumePrev1() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        radio.previousVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNewTest() {

        Radio radio = new Radio(10);
        radio.setRadioSurveillanceNumber(9);
        int expected = 9;
        int actual = radio.getRadioSurveillanceNumber();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void radioNewTest2() {

        Radio radio = new Radio(10);
        radio.setRadioSurveillanceNumber(10);

        int expected = 0;
        int actual = radio.getRadioSurveillanceNumber();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void radioNewTestNext() {

        Radio radio = new Radio(10);
        radio.setRadioSurveillanceNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getRadioSurveillanceNumber();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void radioNewTestNext2() {

        Radio radio = new Radio(10);
        radio.setRadioSurveillanceNumber(10);
        radio.next();

        int expected = 1;
        int actual = radio.getRadioSurveillanceNumber();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void radioNewTestPrev() {

        Radio radio = new Radio(10);
        radio.setRadioSurveillanceNumber(0);
        radio.previous();

        int expected = 9;
        int actual = radio.getRadioSurveillanceNumber();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void radioNewTestPrev2() {

        Radio radio = new Radio(10);
        radio.setRadioSurveillanceNumber(10);
        radio.previous();

        int expected = 9;
        int actual = radio.getRadioSurveillanceNumber();

        Assertions.assertEquals(actual, expected);
    }

}