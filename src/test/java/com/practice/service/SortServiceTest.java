package com.practice.service;

import com.practice.loggic.BubbleSort;
import com.practice.loggic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<String>());

    @Test
    public void test() throws Exception {
        // given
        // when
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        // then
        assertEquals(List.of("1", "2", "3"), actual);
    }

}