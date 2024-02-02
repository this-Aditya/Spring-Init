package com.springwave.framework.algorithms.usecases;

import com.springwave.framework.algorithms.algos.SortingAlgo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("bubbleSortCase") // no need of this as this is the default qualifier
public class BubbleSortUseCase implements UseCase{

    @Autowired
    @Qualifier("Bubble Sort")
    public SortingAlgo bubbleSortAlgo;
}
