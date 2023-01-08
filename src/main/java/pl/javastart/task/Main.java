package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        // tutaj możesz przeprowadzać manualne testy listy

        // lista powinna być parametryzowana (analogicznie jak java.util.ArrayList czy java.util.LinkedList)
        CustomList<String> customListOfStrings = new CustomList<>();
        CustomList<Integer> customListOfIntegers = new CustomList<>();
        customListOfStrings.add("5");
        customListOfIntegers.add(5);
        System.out.println(customListOfStrings);
        System.out.println(customListOfIntegers);

    }
}
