package com.collection.homework.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ChatRunner {

    public static void main(String[] args) {

        List<Chat> chatList = new ArrayList<>();

        chatList.add(new Chat("qwr", 3160));
        chatList.add(new Chat("def", 860));
        chatList.add(new Chat("def", 4860));
        chatList.add(new Chat("qwr", 1160));
        chatList.add(new Chat("abc", 2500));
        chatList.add(new Chat("abc", 1160));
        System.out.println("Initial chat: \n" + chatList);

        int value = 1000;
        Iterator<Chat> chatIterator = chatList.iterator();
        while (chatIterator.hasNext()){
            Chat current = chatIterator.next();
            if (current.getNumberOfUsers() < value){
                System.out.println("Remooving chat: " + current);
                chatIterator.remove();
            }
        }
        System.out.println(chatList);
        System.out.println("Sorted chat: ");

        Collections.sort(chatList);
        System.out.println(chatList);

        chatList.sort(new ChatComparatorByNumbers().thenComparing(new ChatComparatorByTitle()));
        System.out.println(chatList);




    }



}
