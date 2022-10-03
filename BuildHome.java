package com.oop.homework.task.home;
/**
*Задание 1
*Представить в виде классов и их композиции следующую модель.
*- Каждый дом содержит свой номер (int), и множество этажей (массив).
*- Каждый этаж содержит номер этажа (int), и множество квартир (массив).
*- Каждая квартира содержит свой номер (int), и множество комнат (массив).
*- Каждая комната содержит поле проходная она или нет (boolean).
*В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
*Например, метод print класса этаж должен выводить на консоль:
*“Этаж 2, количество квартир 18”
*
*Создание всех объектов вынести в отдельный класс с методом main.
*Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, 
*вызывая методы print.
*/
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
