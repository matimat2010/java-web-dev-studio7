package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, Double capacity, String contents, String type, Double speed, Boolean rewritable) {
        super(name, capacity, contents, type, speed, rewritable);
    }

    @Override
    public String spin(){
        return "The DVD Speed Is  " + getSpeed();
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
