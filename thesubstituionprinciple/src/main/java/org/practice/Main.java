package org.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void build(Building building1){
        System.out.println("printing building "+ building1.toString() );
    }
    public static void build(List<? extends Building> building){
        for (Building b : building){
            System.out.println(b);
        }

    }

    public static House buildHouse(int area, int numberOfRooms,int price){

        House house = new House();
       switch (numberOfRooms) {
           case 1:
               house.setType(Type.ONE_ZIMMER);
               break;
           case 2:
               house.setType(Type.TWO_ZIMMER);
               break;
           case 4:
               house.setType(Type.FOUR_ZIMMER);
               break;
           default:
               break;
        }

        house.setAreaOfTheHouse(area);
        house.setPrice(price);
        BedRoom bedRoom = new BedRoom();
        bedRoom.setBed(true);
        bedRoom.setCurtains(true);
        bedRoom.setFan(false);
        bedRoom.setWardrobe(true);
        bedRoom.setMirror(false);

        house.setBedRoom(bedRoom);

        Kitchen kitchen = new Kitchen();
        kitchen.setStove(true);
        kitchen.setSink(true);
        kitchen.setFridge(false);
        kitchen.setMicroOven(false);

        house.setKitchen(kitchen);

        WashRoom washRoom = new WashRoom();
        washRoom.setNoOfLights(4);
        washRoom.setToilet(true);
        washRoom.setBathTub(true);
        washRoom.setSink(true);

        house.setWashRoom(washRoom);

        LeavingRoom leavingRoom = new LeavingRoom();
        leavingRoom.setSofa(false);
        leavingRoom.setTv(false);
        leavingRoom.setLight(false);
        leavingRoom.setNoOfWindows(2);

        house.setLeavingRoom(leavingRoom);


        return house;

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Building building = new Building();
        Office office = new Office();
        House house = buildHouse(85, 2,2000000);
        House house2 = buildHouse(90, 4,4000000);
        House house1 = buildHouse(87, 1 , 100000);
        build(building);
        build(office);
        List<Building> buildings = new ArrayList<>();
        buildings.add(building);
        buildings.add(office);
        buildings.add(house);
        build(buildings);
        List<Office> offices = new ArrayList<>();
      //offices.add(building);
       offices.add(office);
        build(offices);
        List<House> houses = new ArrayList<>();
        houses.add(house);
        houses.add(house1);
        houses.add(house2);
        houses.stream().forEach(h -> h.setPrice(h.getPrice() + 10000));
        build(houses);

    }
}