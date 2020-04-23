package com.spring.basic.learningSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers){
        return numbers;
    }
}
