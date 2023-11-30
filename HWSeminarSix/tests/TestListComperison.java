package HWSeminarSix.tests;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import HWSeminarSix.src.model.Average;
import HWSeminarSix.src.model.ListComperison;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class TestListComperison {

    @Test
    void testCompare() {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(5, 2, 5));
        List<Integer> secondtList = new ArrayList<>(Arrays.asList(5, 5, 5));
        Average average = mock(Average.class);
        when(average.getListAverage(firstList)).thenReturn(1.0);
        when(average.getListAverage(secondtList)).thenReturn(2.0);

        ListComperison listComperison = new ListComperison(average);
        assertThat(listComperison.comperison(firstList, secondtList)).isEqualTo(1);    
        assertThat(listComperison.comperison(secondtList, firstList)).isEqualTo(2);
        verify(average, times(2)).getListAverage(firstList);
        verify(average, times(2)).getListAverage(secondtList);

    }
}
