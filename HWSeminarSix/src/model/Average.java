package HWSeminarSix.src.model;

import java.util.List;

public class Average {
    public double getListAverage(List<Integer> list) {
        int sum = 0;
        for (int number: list) {
            sum += number;
        }
        return (double) sum / list.size();
    }
}
