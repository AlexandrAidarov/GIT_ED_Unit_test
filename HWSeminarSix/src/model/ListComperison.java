package HWSeminarSix.src.model;

import java.util.List;

public class ListComperison {

    private final Average average;

    public ListComperison(Average average) {
        this.average = average;
    }
    public static int comperison(List<Integer> firstList, List<Integer> secondList) {
        double firstListAverage = average.getListAverage(firstList);
        double secondListAverage = average.getListAverage(secondList);
        
        if (firstListAverage > secondListAverage){
            return 1;
        }else if (firstListAverage < secondListAverage){
            return 2;
        }else {
            return 3;
        }
    }
}
