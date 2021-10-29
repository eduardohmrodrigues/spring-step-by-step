package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.springstepbystep.basic.algorithms.search.BinarySearchImpl;
import com.ehmr.spring.basics.springstepbystep.basic.algorithms.search.SearchAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringStepByStepBasicApplication {

	public static void main(String[] args) {

		int number = 5;
		int[] numbers = new int[] {33, 1, number, 24};

		ApplicationContext appContext = SpringApplication.run(SpringStepByStepBasicApplication.class, args);

		SearchAlgorithm searchAlgorithm = appContext.getBean(BinarySearchImpl.class);
		int position = searchAlgorithm.search(numbers, number);
		System.out.println(String.format("Found int %d in array %s at position %d",
				number,
				Arrays.toString(numbers),
				position
		));
	}

}
