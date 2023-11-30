package HWSeminarSix.src.view;


import HWSeminarSix.src.model.Average;
import HWSeminarSix.src.model.ListComperison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Console {

    private final ListComperison listComperison;
    

    public Console(ListComperison listComperison) {
        this.listComperison = listComperison;
    }

    public void run() {
        System.out.println("Сравнение двух списков чисел.");
        List<Integer> firstList = new ArrayList<>(Arrays.asList(3, 5, 6));
        System.out.println("Первый список: " + firstList.toString());
        List<Integer> secondList = new ArrayList<>(Arrays.asList(2, 4, 7));
        System.out.println("Второй список: " + secondList.toString());
        int valueComperison = listComperison.comperison(firstList,secondList);
        if (valueComperison > 0) {
            System.out.println("Первый список имеет большее среднее значение.");
        }
        if (valueComperison < 0) {
            System.out.println("Второй список имеет большее среднее значение.");
        }
        if (valueComperison == 0) {
            System.out.println("Средние значения равны.");
        }
    }
}
