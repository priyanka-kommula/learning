package org.practice;

public class Room {
    private int length;
    private int width;
    private int numOfWindows;
    private boolean heating;

    @Override
    public String toString() {
        return "Room{" +
                "length=" + length +
                ", width=" + width +
                ", numOfWindows=" + numOfWindows +
                ", heating=" + heating +
                ", noOfLights=" + noOfLights +
                '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public boolean isHeating() {
        return heating;
    }

    public void setHeating(boolean heating) {
        this.heating = heating;
    }

    public int getNoOfLights() {
        return noOfLights;
    }

    public void setNoOfLights(int noOfLights) {
        this.noOfLights = noOfLights;
    }

    private int noOfLights;

}
