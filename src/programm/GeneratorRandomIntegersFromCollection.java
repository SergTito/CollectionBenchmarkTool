package programm;

import java.time.Instant;
import java.util.*;

public class GeneratorRandomIntegersFromCollection extends Manipulations {
    private long countElement;

    public void countElementsCollections() {
        System.out.print("Введите количество элементов: ");
        Scanner scanner = new Scanner(System.in);
        countElement = scanner.nextLong();

        //List
        Instant startTime = Instant.now();
        ArrayList<Long> arrayList = createArrayList();
        Instant endTime = Instant.now();
        printDuration("ArrayList", startTime, endTime);

        startTime = Instant.now();
        LinkedList<Long> linkedList = createLinkedList();
        endTime = Instant.now();
        printDuration("LinkedList", startTime, endTime);

        startTime = Instant.now();
        Vector<Long> vector = createVector();
        endTime = Instant.now();
        printDuration("Vector", startTime, endTime);

        //Queue
        startTime = Instant.now();
        ArrayDeque<Long> deque = createArrayDeque();
        endTime = Instant.now();
        printDuration("ArrayDeque", startTime, endTime);

        startTime = Instant.now();
        PriorityQueue<Long> priorityQueue = createPriorityQueue();
        endTime = Instant.now();
        printDuration("PriorityQueue", startTime, endTime);

        //Set
        startTime = Instant.now();
        HashSet<Long> hashSet = createHashSet();
        endTime = Instant.now();
        printDuration("HashSet", startTime, endTime);

        startTime = Instant.now();
        LinkedHashSet<Long> linkedHashSet = createLinkedHashSet();
        endTime = Instant.now();
        printDuration("LinkedHashSet", startTime, endTime);

        startTime = Instant.now();
        TreeSet<Long> treeSet = createTreeSet();
        endTime = Instant.now();
        printDuration("TreeSet", startTime, endTime);


        printDelimiter();
        //добавления элемента в определенное место
        addElementRandomArrayList(arrayList);
        addElementRandomLinkedList(linkedList);
        addElementRandomVector(vector);
        addElementOfArrayDeque(deque);
        addElementPriorityQueue(priorityQueue);
        addElementHashSet(hashSet);
        addElementLinkedHashSet(linkedHashSet);
        addElementTreeSet(treeSet);

        printDelimiter();
        //clear
        clearElementArrayList(arrayList);
        clearElementLinkedList(linkedList);
        clearElementVector(vector);
        clearElementArrayDeque(deque);
        clearElementPriorityQueue(priorityQueue);
        clearElementHashSet(hashSet);
        clearElementHasLinkedHashSet(linkedHashSet);
        clearElementTreeSet(treeSet);




    }

    //List
    private ArrayList<Long> createArrayList() {
        ArrayList<Long> integerArrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < countElement; i++) {
            long randomElement = random.nextLong();
            integerArrayList.add(randomElement);
        }
        return integerArrayList;
    }

    private LinkedList<Long> createLinkedList() {
        LinkedList<Long> integerLinkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < countElement; i++) {
            long randomElement = random.nextLong();
            integerLinkedList.add(randomElement);
        }
        return integerLinkedList;
    }

    private Vector<Long> createVector() {
        Vector<Long> vector = new Vector<>();
        Random random = new Random();
        for (int i = 0; i < countElement; i++) {
            long randomElement = random.nextLong();
            vector.add(randomElement);
        }
        return vector;
    }

    //Queue

    private ArrayDeque<Long> createArrayDeque() {
        ArrayDeque<Long> arrayDeque = new ArrayDeque<>();
        Random random = new Random();
        for (int i = 0; i < countElement; i++) {
            long randomElement = random.nextLong();
            arrayDeque.add(randomElement);
        }
        return arrayDeque;
    }

    private PriorityQueue<Long> createPriorityQueue() {
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < countElement; i++) {
            long randomElement = random.nextLong();
            priorityQueue.add(randomElement);
        }
        return priorityQueue;
    }

    //Set
    private HashSet<Long> createHashSet() {
        HashSet<Long> hashSet = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < countElement; i++) {
            long randomElement = random.nextLong();
            hashSet.add(randomElement);
        }
        return hashSet;
    }

    private LinkedHashSet<Long> createLinkedHashSet() {
        LinkedHashSet<Long> longLinkedHashSet = new LinkedHashSet<>();
        Random random = new Random();
        for (int i = 0; i < countElement; i++) {
            long randomElement = random.nextLong();
            longLinkedHashSet.add(randomElement);
        }
        return longLinkedHashSet;
    }

    private TreeSet<Long> createTreeSet() {
        TreeSet<Long> treeSet = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < countElement; i++) {
            long randomElement = random.nextLong();
            treeSet.add(randomElement);
        }
        return treeSet;
    }

    public long getCountElement() {
        return countElement;
    }

    public void setCountElement(long countElement) {
        this.countElement = countElement;
    }



}
