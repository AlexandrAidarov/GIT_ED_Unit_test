package HWSeminarSix.tests;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import HWSeminarSix.src.model.Average;
import static org.assertj.core.api.Assertions.assertThat;

class TestAverage {
    @Test
    void testGetListAverage() {
        Average average = new Average();
        List<Integer> list = new ArrayList<>(Arrays.asList(5,2,5));
        assertThat(average.getArithmeticAverage(list)).isEqualTo(6.0);
    }
}