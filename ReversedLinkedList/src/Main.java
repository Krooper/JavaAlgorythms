import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;


/**
 * Необходимо реализовать метод разворота связного списка.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] ints = new Integer[10];

        Random rand = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = rand.nextInt(100);
        }
        LinkedList<Integer> initList = new LinkedList<>(Arrays.asList(ints));

        System.out.println("Initial List:");
        System.out.println(initList);

        System.out.println("Reversed List:");
        System.out.println(reverser(initList));
    }

    public static LinkedList<Integer> reverser (LinkedList<Integer> initList) {
        LinkedList<Integer> reversedLinkedList = new LinkedList<Integer>();

        for (int i = initList.size(); i > 0; i--){
            int temp = initList.getLast();
            reversedLinkedList.addLast(temp);
            initList.removeLast();
        }

        return reversedLinkedList;
    }
}