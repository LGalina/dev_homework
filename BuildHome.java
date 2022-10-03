package com.oop.homework.task.home;

public class BuildHome {
   public static void main(String[] args) {
       Room room1 = new Room(true);
       Room room2 = new Room();
       room2.setCold(false);
       Apartment apartment = new Apartment(new Room[]{room1, room2}, 2);
       apartment.setRooms(room2);
       Apartment apartment1 = new Apartment();
       apartment1.setRooms(room2);
       Floor floor = new Floor(new Apartment[]{apartment}, 1);
       Home home = new Home(new Floor[]{floor, floor}, 2);
       home.setFloors(new Floor(new Apartment[]{apartment},1));
       home.print();

   }

}
