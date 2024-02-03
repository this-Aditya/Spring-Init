package com.springwave.framework.algorithms.qualifierTesting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("First Qualifier")
public class FirstQualifierExp implements QualifierExp{
public String name = "First Qualifier";
}
