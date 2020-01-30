package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, Double capacity, String contents, String type, Double speed, Boolean rewritable) {
        super(name, capacity, contents, type, speed, rewritable);
    }

    @Override
    public String spin(){
        return "The CD Speed Is  " + getSpeed();
    }

//    @Override
//    public String spin(){
//        return Double.toString(getSpeed());
//    }



    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
