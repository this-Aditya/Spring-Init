package com.springwave.framework.algorithms;

import com.springwave.framework.algorithms.qualifierTesting.FirstQualifierExp;
import com.springwave.framework.algorithms.qualifierTesting.QualifierExp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InjectingQualifier {

    @Autowired
    @Qualifier("First Qualifier")
    public QualifierExp qualifier;
}
