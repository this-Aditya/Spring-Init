package com.springwave.framework.algorithms.usecases;

import com.springwave.framework.algorithms.algos.SortingAlgo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortUseCase implements UseCase{

    @Autowired
    public SortingAlgo quickSortAlgo;
}
