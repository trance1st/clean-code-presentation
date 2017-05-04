package ro.sapo.examples.solid.isp.solution;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class Car extends Vehicle implements RadioSwitch {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

    public void turnRadioOn() {
        radioOn = true;
    }

    public void turnRadioOff() {
        radioOn = false;
    }

}