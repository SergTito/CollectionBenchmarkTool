package programm;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Manipulations {

    protected void addElementOfRandom(ArrayList<Long> arrayList) {
        Instant startTimeAdd = Instant.now();
        for (int i = 0; i < 500000; i++) {
            long element = (long) (Math.random() * (arrayList.size() + 1));
            int randomIndex = (int) (Math.random() * (arrayList.size() + 1));
            arrayList.add(randomIndex, element);
        }
        Instant endTimeAdd = Instant.now();
        printDuration("���������� ���������� ��������� � ��������� ����� � ������ ArrayList", startTimeAdd, endTimeAdd);
    }

    protected void findElementOFRandomArrayList(ArrayList<Long> arrayList) {
        Instant startTimeFind = Instant.now();
        for (int i = 0; i < 500000; i++) {
            long element = (long) (Math.random() * (arrayList.size() + 1));
            int randomIndex = (int) (Math.random() * (arrayList.size() + 1));
            arrayList.get(randomIndex);
        }
        Instant endFindTime = Instant.now();
        printDuration("������� ����������� ������� ",startTimeFind,endFindTime);
    }

    protected void printDuration(String collectionName, Instant startTime, Instant endTime) {
        Duration duration = Duration.between(startTime, endTime);
        long minutes = duration.toMinutes();
        long seconds = duration.getSeconds() % 60;
        long milliseconds = duration.toMillis() % 1000;
        System.out.println("����� �������� " + collectionName + ": " + minutes + " ����� " + seconds + " ������ "
                + milliseconds + " �����������");
    }
}
