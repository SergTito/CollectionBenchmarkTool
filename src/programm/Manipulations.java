package programm;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Manipulations {
    int count = 10000;


    //add
    protected void addElementRandomArrayList(ArrayList<Long> arrayList) {
        Instant startTimeAdd = Instant.now();
        for (int i = 0; i < count; i++) {
            long element = (long) (Math.random() * (arrayList.size() + 1));
            arrayList.add(60+i,element);
        }
        Instant endTimeAdd = Instant.now();
        printDuration("Добавление нескольких(10.000) элементов в рандомное место в классе ArrayList",
                startTimeAdd, endTimeAdd);
    }
    protected void addElementRandomLinkedList(LinkedList<Long> linkedList) {
        Instant startTimeAdd = Instant.now();
        for (int i = 0; i < count; i++) {
            long element = (long) (Math.random() * (linkedList.size() + 1));
            linkedList.add(60+i,element); // Всегда добавляем в конец списка
        }
        Instant endTimeAdd = Instant.now();
        printDuration("Добавление нескольких(10.000) элементов в конец класса LinkedList",
                startTimeAdd, endTimeAdd);
    }

    protected void addElementRandomVector(Vector<Long> vector){
        Instant startTimeAdd = Instant.now();
        for (int i = 0; i < count; i++) {
            long element = (long) (Math.random() * (vector.size() + 1));
            vector.add(60+ i, element);
        }
        Instant endTimeAdd = Instant.now();
        printDuration("Добавление нескольких(10.000) элементов в рандомное место в классе Vector",
                startTimeAdd, endTimeAdd);
    }

    protected void addElementOfArrayDeque(ArrayDeque<Long> deque){
        System.out.println("ArrayDeque: не предоставляет метода для добавления элемента в определенное место." +
                "Он предназначен для эффективного добавления и удаления элементов с обоих концов очереди ");
    }
    protected void addElementPriorityQueue(PriorityQueue<Long> priorityQueue){
        System.out.println("PriorityQueue: не предоставляет метода для добавления элемента в определенное место." +
                "Представляет приоритетную очередь, где элементы добавляются на основе их приоритета" +
                " и извлекаются в порядке возрастания приоритета. ");
    }

    protected void addElementHashSet(HashSet<Long> hashSet){
        System.out.println("HashSet: не предоставляет метода для добавления элемента в определенное место," +
                "так как она является набором уникальных элементов без определенного порядка ");
    }

    protected void addElementLinkedHashSet(LinkedHashSet<Long> linkedHashSet){
        System.out.println("LinkedHashSet: не поддерживает добавление элементов по определенному индексу," +
                " так как это противоречит его основной структуре данных " +
                "- множеству с уникальными значениями и отсутствием порядка.");
        }
        protected void addElementTreeSet(TreeSet<Long> treeSet){
            System.out.println("TreeSet: не поддерживает добавление элементов по определенному индексу," +
                    "представляет собой структуру данных, основанную на дереве, " +
                    "и автоматически сортирует элементы в естественном порядке или с использованием компаратора.");
            }


    //remove

    protected void clearElementArrayList(ArrayList<Long> arrayList ){
        Instant startTimeAdd = Instant.now();
            arrayList.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("Удаление всех элементов в классе ArrayList",startTimeAdd, endTimeAdd);

    }
    protected void clearElementLinkedList(LinkedList<Long> linkedList ){
        Instant startTimeAdd = Instant.now();
            linkedList.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("Удаление всех элементов в классе LinkedList", startTimeAdd, endTimeAdd);

    }

    protected void clearElementVector(Vector<Long> vector ){
        Instant startTimeAdd = Instant.now();
        vector.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("Удаление всех элементов в классе Vector", startTimeAdd, endTimeAdd);

    }
    protected void clearElementArrayDeque(ArrayDeque<Long> arrayDeque ){
        Instant startTimeAdd = Instant.now();
        arrayDeque.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("Удаление всех элементов в классе Vector", startTimeAdd, endTimeAdd);

    }
    protected void clearElementPriorityQueue(PriorityQueue<Long> priorityQueue ){
        Instant startTimeAdd = Instant.now();
        priorityQueue.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("Удаление всех элементов в классе PriorityQueue", startTimeAdd, endTimeAdd);

    }
    protected void clearElementHashSet(HashSet<Long> hashSet ){
        Instant startTimeAdd = Instant.now();
        hashSet.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("Удаление всех элементов в классе HashSet", startTimeAdd, endTimeAdd);

    }
    protected void clearElementHasLinkedHashSet(LinkedHashSet<Long> linkedHashSet ){
        Instant startTimeAdd = Instant.now();
        linkedHashSet.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("Удаление всех элементов в классе LinkedHashSet", startTimeAdd, endTimeAdd);

    }
    protected void clearElementTreeSet(TreeSet<Long> treeSet ){
        Instant startTimeAdd = Instant.now();
        treeSet.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("Удаление всех элементов в классе TreeSet", startTimeAdd, endTimeAdd);

    }

    protected void printDuration(String collectionName, Instant startTime, Instant endTime) {
        Duration duration = Duration.between(startTime, endTime);
        long minutes = duration.toMinutes();
        long seconds = duration.getSeconds() % 60;
        long milliseconds = duration.toMillis() % 1000;
        System.out.println("Время : " + collectionName + ": " + minutes + " минут " + seconds + " секунд "
                + milliseconds + " миллисекунд");
    }
    public void printDelimiter(){
        System.out.println("----------------------------------------------------------------");
    }
}
