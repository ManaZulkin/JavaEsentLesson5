package Task6;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String teacher;
        int numb;
        ArrayList <String> scoolTeachers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("How many teachers you can remember from school?");
        numb = in.nextInt(); in.nextLine();
        System.out.println("Write names!");
        for (int i = 0; i < numb; i++){
            scoolTeachers.add(in.nextLine());
        }
        System.out.println("Ok, so here they are:");
        ListIterator iterator = scoolTeachers.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.nextIndex() + 1 + " " + iterator.next());
        }
        System.out.println("Who of them was the best for you?");
        teacher = in.nextLine();
        iterator = scoolTeachers.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(teacher)) System.out.println(scoolTeachers.get(iterator.nextIndex() - 1) + " has number " +
                    (iterator.nextIndex()) + " in your list");
        }
        System.out.println("Who of them was the worst for you?");
        teacher = in.nextLine();
        iterator = scoolTeachers.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(teacher)) System.out.println(scoolTeachers.get(iterator.nextIndex() -1) + " has number " +
                    (iterator.nextIndex()) + " in your list");
        }

    }
}
