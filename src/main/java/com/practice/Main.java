package com.practice;

import com.practice.loggic.BubbleSort;
import com.practice.loggic.JavaSort;
import com.practice.loggic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}