package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static ArrayList <String> zoo = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count;
        System.out.println("Welcome in Zoo\nEnter how many animals do you want to see");
        count = in.nextInt(); in.nextLine();
        System.out.println("Now enter name of all animals in your wish-list");
      //  ArrayList <String> zoo = new ArrayList<>();
        for (int i = 0; i < count; i++){
            System.out.println("Animal number " + (i + 1));
            zoo.add(i,in.nextLine());
        }
        System.out.println("You are going to withit next animals");
        for (int i =0; i < count; i++){
            System.out.println((i + 1 ) + " "+ zoo.get(i));
        }
        System.out.println("Unfortunately not all animal available now, so you can see next animals");
        if (zoo.size() >= 7) zoo.remove(6);
        if (zoo.size() >= 5) zoo.remove(4);
        if (zoo.size() >= 3) zoo.remove(2);


        for (int i =0; i < zoo.size(); i++){
            System.out.println((i + 1 ) + " "+ zoo.get(i));
        }
    }

}
