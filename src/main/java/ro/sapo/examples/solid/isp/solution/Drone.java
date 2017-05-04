package ro.sapo.examples.solid.isp.solution;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class Drone extends Vehicle implements CameraSwitch {

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
}
