package com.afs.tdd;

public class receiver {

    int xLocation;
    int yLocation;
    String direction;

    public receiver(String direction) {
        this.direction = direction;
    }

    public receiver(int xLocation, int yLocation, String direction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.direction = direction;
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int moveNorth(){
        return yLocation++;
    }

    public int moveSouth(){
        return yLocation--;
    }

    public int moveEast(){
        return xLocation++;
    }

    public int moveWest(){
        return xLocation--;
    }

    public void turnWest(){
        direction = "W";
    }

    public void turnEast(){
        direction = "E";
    }

    public void turnSouth(){
        direction = "S";
    }

    public void turnNorth(){
        direction = "N";
    }


}
