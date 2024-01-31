package com.springwave.framework.algorithms.usecases;

import com.springwave.framework.algorithms.algos.SortingAlgo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("radixSortUseCase")
public class RadixSortUseCase implements UseCase{

    @Autowired
    @Qualifier("Radix Sort Algorithm")
    public SortingAlgo radixSortAlgo;
}
