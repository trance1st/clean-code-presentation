package ro.sapo.examples.solid.isp.violation;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class Drone extends Vehicle {

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }

    public void turnCameraOn() {
        cameraOn = true;
    }

    public void turnCameraOff() {
        cameraOn = false;
    }

    public void turnRadioOn() {
        // nothing to do here
    }

    public void turnRadioOff() {
        // nothing to do here
    }
}