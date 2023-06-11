package programm;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class test{
    public static void main(String[] args) {


        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        System.out.println("Выберите количество элементов ");
        Scanner scanner = new Scanner(System.in);
        int elementOfArrayList = scanner.nextInt();
        for (int i = 0; i < elementOfArrayList ; i++) {
            int randomElement = (int) (Math.random() * elementOfArrayList) + 1;
            arrayListInteger.add(randomElement);
        }
        System.out.println("Создан " +elementOfArrayList+" элементов ");

//
//        ArrayList<Long> arrayList = new ArrayList<>();
//        for (int i = 0; i < countElement; i++) {
//            long randomElementArrayList = (long) (Math.random() * getCountElement()) + 1;
//            arrayList.add(randomElementArrayList);
//
//        }
//        LinkedList<Long> linkedList = new LinkedList<>();
//        for (int i = 0; i < countElement; i++) {
//            long randomElementLinkedList = (long) ((Math.random() * getCountElement()) + 1);
//            linkedList.add(randomElementLinkedList);
//        }
//        Vector<Long> vector = new Vector<>();
//        for (int i = 0; i < countElement; i++) {
//            long randomElementVector = (long) ((Math.random() * getCountElement()) + 1);
//            vector.add(randomElementVector);
//        }
//        HashSet<Long> hashSet = new HashSet<>();
//        for (int i = 0; i < countElement; i++) {
//            long randomElementHashSet = (long) ((Math.random() * getCountElement()) + 1);
//            hashSet.add(randomElementHashSet);
//        }
//        LinkedHashSet<Long> longLinkedHashSet = new LinkedHashSet<>();
//        for (int i = 0; i < countElement; i++) {
//            long randomElementLinkedHashSet = (long) ((Math.random() * getCountElement()) + 1);
//            longLinkedHashSet.add(randomElementLinkedHashSet);
//        }
//        TreeSet<Long> treeSet = new TreeSet<>();
//        for (int i = 0; i < countElement; i++) {
//            long randomElementTreeSet = (long) ((Math.random() * getCountElement()) + 1);
//            treeSet.add(randomElementTreeSet);
    }
}
