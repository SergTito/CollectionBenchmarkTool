package programm;

import java.util.Scanner;

public class ColectionBanchmarkTool {
    public static void main(String[] args) {
        ColectionBanchmarkTool colectionBanchmarkTool = new ColectionBanchmarkTool();
        colectionBanchmarkTool.go();
    }

    private void go() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("��� ��������� ��������� ������������ �������� �������� " +
                "���������� �������� ����������, �������� ��� ������ ��������� � ��������� ���������� ");
        System.out.println("�������� ����� � ��� �������� � �����");
        System.out.println("1. ����� �����");
        System.out.println("2. ������������ �����");
        System.out.println("3. ������");
        switch (scanner.nextLine()) {
            case "1":
                System.out.println("�� ������� 1. ����� �����");
                GeneratorRandomIntegersFromCollection generator = new GeneratorRandomIntegersFromCollection();
                generator.countElementsCollections();



        }


    }
}
