package com.springwave.framework.algorithms;

import com.springwave.framework.algorithms.qualifierTesting.FirstQualifierExp;
import com.springwave.framework.algorithms.usecases.QuickSortUseCase;
import com.springwave.framework.algorithms.usecases.RadixSortUseCase;
import com.springwave.framework.algorithms.usecases.UseCase;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Field;

@Configuration
@ComponentScan("com.springwave.framework.algorithms")
public class AlgorithmAppContext {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AlgorithmAppContext.class)) {
            System.out.println("Just checking if dependencies are okay!!");
            QuickSortUseCase quickSortUseCase = (QuickSortUseCase) context.getBean(UseCase.class); // this is primary!!
            var quickSortAlgo = quickSortUseCase.quickSortAlgo;
            System.out.println("QuickSortUseCase -> "+ quickSortAlgo.getClass().getSimpleName());

            RadixSortUseCase radixSortUseCase = (RadixSortUseCase) context.getBean("radixSortUseCase");
            System.out.println("RadixSortUsecase "+ radixSortUseCase.radixSortAlgo.getClass().getSimpleName());

//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            /* This won't work beacuse we are using the qualifier name here, without using the
            @Qualifier annotation. That's why it won't work here!!
            Instead we cam use @Qualifier annoatation and use it in the field!!
            Here it is not working!!
            FirstQualifierExp qualifierExp = (FirstQualifierExp) context.getBean("First Qualifier");
*/
            // But this can happen without aany errors:
            FirstQualifierExp qualifierExp = (FirstQualifierExp) context.getBean("firstQualifierExp");
            System.out.println(qualifierExp);
        }
    }
}
