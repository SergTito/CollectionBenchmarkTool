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
        printDuration("���������� ����������(10.000) ��������� � ��������� ����� � ������ ArrayList",
                startTimeAdd, endTimeAdd);
    }
    protected void addElementRandomLinkedList(LinkedList<Long> linkedList) {
        Instant startTimeAdd = Instant.now();
        for (int i = 0; i < count; i++) {
            long element = (long) (Math.random() * (linkedList.size() + 1));
            linkedList.add(60+i,element); // ������ ��������� � ����� ������
        }
        Instant endTimeAdd = Instant.now();
        printDuration("���������� ����������(10.000) ��������� � ����� ������ LinkedList",
                startTimeAdd, endTimeAdd);
    }

    protected void addElementRandomVector(Vector<Long> vector){
        Instant startTimeAdd = Instant.now();
        for (int i = 0; i < count; i++) {
            long element = (long) (Math.random() * (vector.size() + 1));
            vector.add(60+ i, element);
        }
        Instant endTimeAdd = Instant.now();
        printDuration("���������� ����������(10.000) ��������� � ��������� ����� � ������ Vector",
                startTimeAdd, endTimeAdd);
    }

    protected void addElementOfArrayDeque(ArrayDeque<Long> deque){
        System.out.println("ArrayDeque: �� ������������� ������ ��� ���������� �������� � ������������ �����." +
                "�� ������������ ��� ������������ ���������� � �������� ��������� � ����� ������ ������� ");
    }
    protected void addElementPriorityQueue(PriorityQueue<Long> priorityQueue){
        System.out.println("PriorityQueue: �� ������������� ������ ��� ���������� �������� � ������������ �����." +
                "������������ ������������ �������, ��� �������� ����������� �� ������ �� ����������" +
                " � ����������� � ������� ����������� ����������. ");
    }

    protected void addElementHashSet(HashSet<Long> hashSet){
        System.out.println("HashSet: �� ������������� ������ ��� ���������� �������� � ������������ �����," +
                "��� ��� ��� �������� ������� ���������� ��������� ��� ������������� ������� ");
    }

    protected void addElementLinkedHashSet(LinkedHashSet<Long> linkedHashSet){
        System.out.println("LinkedHashSet: �� ������������ ���������� ��������� �� ������������� �������," +
                " ��� ��� ��� ������������ ��� �������� ��������� ������ " +
                "- ��������� � ����������� ���������� � ����������� �������.");
        }
        protected void addElementTreeSet(TreeSet<Long> treeSet){
            System.out.println("TreeSet: �� ������������ ���������� ��������� �� ������������� �������," +
                    "������������ ����� ��������� ������, ���������� �� ������, " +
                    "� ������������� ��������� �������� � ������������ ������� ��� � �������������� �����������.");
            }


    //remove

    protected void clearElementArrayList(ArrayList<Long> arrayList ){
        Instant startTimeAdd = Instant.now();
            arrayList.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("�������� ���� ��������� � ������ ArrayList",startTimeAdd, endTimeAdd);

    }
    protected void clearElementLinkedList(LinkedList<Long> linkedList ){
        Instant startTimeAdd = Instant.now();
            linkedList.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("�������� ���� ��������� � ������ LinkedList", startTimeAdd, endTimeAdd);

    }

    protected void clearElementVector(Vector<Long> vector ){
        Instant startTimeAdd = Instant.now();
        vector.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("�������� ���� ��������� � ������ Vector", startTimeAdd, endTimeAdd);

    }
    protected void clearElementArrayDeque(ArrayDeque<Long> arrayDeque ){
        Instant startTimeAdd = Instant.now();
        arrayDeque.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("�������� ���� ��������� � ������ Vector", startTimeAdd, endTimeAdd);

    }
    protected void clearElementPriorityQueue(PriorityQueue<Long> priorityQueue ){
        Instant startTimeAdd = Instant.now();
        priorityQueue.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("�������� ���� ��������� � ������ PriorityQueue", startTimeAdd, endTimeAdd);

    }
    protected void clearElementHashSet(HashSet<Long> hashSet ){
        Instant startTimeAdd = Instant.now();
        hashSet.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("�������� ���� ��������� � ������ HashSet", startTimeAdd, endTimeAdd);

    }
    protected void clearElementHasLinkedHashSet(LinkedHashSet<Long> linkedHashSet ){
        Instant startTimeAdd = Instant.now();
        linkedHashSet.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("�������� ���� ��������� � ������ LinkedHashSet", startTimeAdd, endTimeAdd);

    }
    protected void clearElementTreeSet(TreeSet<Long> treeSet ){
        Instant startTimeAdd = Instant.now();
        treeSet.clear();
        Instant endTimeAdd = Instant.now();
        printDuration("�������� ���� ��������� � ������ TreeSet", startTimeAdd, endTimeAdd);

    }

    protected void printDuration(String collectionName, Instant startTime, Instant endTime) {
        Duration duration = Duration.between(startTime, endTime);
        long minutes = duration.toMinutes();
        long seconds = duration.getSeconds() % 60;
        long milliseconds = duration.toMillis() % 1000;
        System.out.println("����� : " + collectionName + ": " + minutes + " ����� " + seconds + " ������ "
                + milliseconds + " �����������");
    }
    public void printDelimiter(){
        System.out.println("----------------------------------------------------------------");
    }
}
