package programm;

import java.util.Scanner;

public class ColectionBanchmarkTool1 {
    public static void main(String[] args) {
        ColectionBanchmarkTool1 colectionBanchmarkTool = new ColectionBanchmarkTool1();
        colectionBanchmarkTool.go();
    }

    private void go() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Это программа позволяет пользователю измерять скорость " +
                "выполнения операций чтение, добавление или удаление элементов в различных коллекциях ");
        System.out.println("Выберите какие у вас элементы в файле");
        System.out.println("1. Целые числа");
        System.out.println("2. Вещественные числа");
        System.out.println("3. Строки");
        switch (scanner.nextLine()) {
            case "1":
                System.out.println("Вы выбрали 1. Целые числа");
                GeneratorRandomIntegersFromCollection generator = new GeneratorRandomIntegersFromCollection();
                generator.countElementsCollections();




        }


    }
}
