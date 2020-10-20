package com.afs.tdd;

class receiver {

    private int xLocation;
    private int yLocation;
    private String direction;

    receiver(int xLocation, int yLocation, String direction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.direction = direction;
    }

    int getXLocation() {
        return xLocation;
    }

    int getYLocation() {
        return yLocation;
    }

    String getDirection() {
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
