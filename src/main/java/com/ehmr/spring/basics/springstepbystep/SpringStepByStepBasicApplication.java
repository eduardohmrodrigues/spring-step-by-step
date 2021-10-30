package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.springstepbystep.basic.algorithms.search.BinarySearchImpl;
import com.ehmr.spring.basics.springstepbystep.basic.algorithms.search.SearchAlgorithm;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class SpringStepByStepBasicApplication {

	public static void main(String[] args) {

		int number = 5;
		int[] numbers = new int[] {33, 1, number, 24};

		try(AnnotationConfigApplicationContext appContext =
					new AnnotationConfigApplicationContext(SpringStepByStepBasicApplication.class)){
			SearchAlgorithm searchAlgorithm = appContext.getBean(BinarySearchImpl.class);
			int position = searchAlgorithm.search(numbers, number);
			System.out.println(String.format("Found int %d in array %s at position %d",
					number,
					Arrays.toString(numbers),
					position
			));
		}
	}

}
