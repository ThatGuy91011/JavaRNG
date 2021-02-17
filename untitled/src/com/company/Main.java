package com.company;


public class Main {

    public static void main(String[] args) {
        int rooms[] = {427, 618, 222, 517, 820, 673, 991, 628, 777, 942};
        int roomsCont[] = {427, 618, 222, 517, 820, 673, 991, 628, 777, 942};
        String names[] = {"John", "Jim", "Jerry", "Joel", "Jade", "Jordan", "Jill", "Jack", "Jorge", "Jody",};
        String namesCont[] = {"John", "Jim", "Jerry", "Joel", "Jade", "Jordan", "Jill", "Jack", "Jorge", "Jody",};


        print("\t\t***Hello! And welcome to the Mars Randomized Expedition!***\n\t\t***Here, you will see ten random crew members be assigned to ten different rooms!***\n\t\t***You may run this program as many times as you like!***");
        RNG(rooms, names);

    }


    static void RNG(int rooms[], String names[]) {
        for (int i = 0; i < rooms.length; i++) {
            int randName = (int) (Math.random() * rooms.length) + 1;
            int randRoom = (int) (Math.random() * names.length) + 1;
            if (names[randName] != null && rooms[randRoom] != 0) {
                print(names[randName] + "'s room number is " + rooms[randRoom] + ".");
                names[randName] = null;
                rooms[randRoom] = 0;
            }
            else
                RNG(rooms, names);
        }
    }
    static void print(String val)
    {
        System.out.println(val);
    }

}
