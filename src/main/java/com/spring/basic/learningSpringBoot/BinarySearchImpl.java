package com.spring.basic.learningSpringBoot;

public class BinarySearchImpl {
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int [] numbers, int numberToSearchFor){
        int[] sortedNumbers = SortAlgorithm.sort(numbers);
        //Implementing Sorting logic

        return 3;
    }
}
