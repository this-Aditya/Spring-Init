package com.springwave.framework.algorithms.qualifierTesting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Second Qualifier")
public class SecondQualifierExp implements QualifierExp {
    public String name = "Second";
}
