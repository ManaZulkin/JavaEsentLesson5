package Task5;

import java.util.*;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Do you have friends? How many?");
        int numFriends = in.nextInt();
        in.nextLine();
        System.out.println("OK, now write theirs names!");
        while (numFriends != 0) {
            friends.add(in.nextLine());
            numFriends--;
        }
        System.out.println("So your friends list is:");
        ListIterator iterator = friends.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("But i think it should look like this:");
       // Comparator <String> comparator = Comparator.comparing(friends: : );
        Collections.sort(friends);
        System.out.println(friends);
        System.out.println("Or if you whant ot see it nice...");
        iterator = friends.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
