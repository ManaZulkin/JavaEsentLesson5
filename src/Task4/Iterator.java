package Task4;

import java.util.*;

public class Iterator {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want to create");
        int count = in.nextInt();
        ArrayList <Integer> numbers = new ArrayList<>();
        System.out.println("Generated list");
        for (int i = 0; i < count ; i++){
            numbers.add(i, random.nextInt(10) );
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println("\nList after iterator");
        ListIterator<Integer> iterator = numbers.listIterator();
        int i = 0;
        while (iterator.hasNext()){
            Integer num = iterator.next();
            System.out.print(num + 1 + " " );
        }
    }
}
