package ro.sapo.examples.solid.isp.violation;

/**
 * Created by bsferreira on 10-04-2016.
 */
public abstract class Vehicle implements Switches {

    private boolean engineRunning;

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void startEngine() {
        engineRunning = true;
    }

    public void shutDownEngine() {
        engineRunning = false;
    }
}