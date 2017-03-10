package pl.javastart.exercise.streams;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Streams1Test {

    private Streams1 streams = new Streams1();

    @Test public void shouldFilterOutNotEvenNumbers() {

        // given
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(123);
        numberList.add(11);
        numberList.add(124);
        numberList.add(12);
        numberList.add(13);
        numberList.add(21);
        numberList.add(71);

        // when
        List<Integer> filteredList = streams.filterOutNotEvenNumbers(numberList);

        // then
        assertThat(filteredList.size(), is(2));
        assertThat(filteredList, CoreMatchers.hasItem(12));
        assertThat(filteredList, CoreMatchers.hasItem(124));
    }

    @Test public void shouldFilterOutNumberLowerThan20() {

        // given
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(123);
        numberList.add(11);
        numberList.add(124);
        numberList.add(12);
        numberList.add(13);
        numberList.add(21);
        numberList.add(71);

        // when
        List<Integer> filteredList = streams.filterOutLowerNumbersThan20(numberList);

        // then
        assertThat(filteredList.size(), is(4));
        assertThat(filteredList, CoreMatchers.hasItem(123));
        assertThat(filteredList, CoreMatchers.hasItem(124));
        assertThat(filteredList, CoreMatchers.hasItem(21));
        assertThat(filteredList, CoreMatchers.hasItem(71));
    }

}
