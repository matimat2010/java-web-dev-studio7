package org.launchcode.studio7;

public abstract class BaseDisc {

   private String name;
   private Double capacity;
   private String contents;
   private String type;
   private Double speed;
   private Boolean rewritable;


    public BaseDisc(String name, Double capacity, String contents, String type, Double speed, Boolean rewritable) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.type = type;
        this.speed = speed;
        this.rewritable = rewritable;

    }


    public void storeData(){
        System.out.println("Data uploaded");
    };

    public Boolean writeData(){
        return rewritable;
    };

    String  readData(){
        return contents;
    };

    String  reportInfo(){
        return "Name = " + name + "\n" + type;
    };

    String  eject(){
        return "ejected";
    };




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Boolean getRewritable() {
        return rewritable;
    }

    public void setRewritable(Boolean rewritable) {
        this.rewritable = rewritable;
    }
}
