package com.afs.tdd;

public class receiver {

    private int xLocation;
    private int yLocation;
    private String direction;

    receiver(String direction) {
        this.direction = direction;
    }

    receiver(int xLocation, int yLocation, String direction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.direction = direction;
    }

    int getxLocation() {
        return xLocation;
    }

    int getyLocation() {
        return yLocation;
    }

    public String getDirection() {
        return direction;
    }

    void moveNorth(){
        yLocation++;
    }

    void moveSouth(){
        yLocation--;
    }

    void moveEast(){
        xLocation++;
    }

    void moveWest(){
        xLocation--;
    }

    void turnWest(){
        direction = "W";
    }

    void turnEast(){
        direction = "E";
    }

    void turnSouth(){
        direction = "S";
    }

    void turnNorth(){
        direction = "N";
    }


}
