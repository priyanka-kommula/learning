package org.practice;

public class House extends Building {
    private Type type;
    private int areaOfTheHouse;
    private int price;
    private BedRoom bedRoom;
    private Kitchen kitchen;
    private WashRoom washRoom;
    private LeavingRoom leavingRoom;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getAreaOfTheHouse() {
        return areaOfTheHouse;
    }

    public void setAreaOfTheHouse(int areaOfTheHouse) {
        this.areaOfTheHouse = areaOfTheHouse;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public void setBedRoom(BedRoom bedRoom) {
        this.bedRoom = bedRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public WashRoom getWashRoom() {
        return washRoom;
    }

    public void setWashRoom(WashRoom washRoom) {
        this.washRoom = washRoom;
    }

    public LeavingRoom getLeavingRoom() {
        return leavingRoom;
    }

    public void setLeavingRoom(LeavingRoom leavingRoom) {
        this.leavingRoom = leavingRoom;
    }

    @Override
    public String toString() {
        return "House{" +
                "type=" + type +
                ", areaOfTheHouse=" + areaOfTheHouse +
                ", price=" + price +
                ", bedRoom=" + bedRoom +
                ", kitchen=" + kitchen +
                ", washRoom=" + washRoom +
                ", leavingRoom=" + leavingRoom +
                '}';
    }
}
