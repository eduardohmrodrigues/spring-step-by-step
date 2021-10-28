package com.ehmr.spring.basics.springstepbystep;

import com.ehmr.spring.basics.springstepbystep.algorithms.search.BinarySearchImpl;
import com.ehmr.spring.basics.springstepbystep.algorithms.search.SearchAlgorithm;
import com.ehmr.spring.basics.springstepbystep.algorithms.sort.QuickSortAlgorithm;
import com.ehmr.spring.basics.springstepbystep.algorithms.sort.SortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringStepByStepApplication {

	public static void main(String[] args) {

		int number = 5;
		int[] numbers = new int[] {33, 1, number, 24};

		ApplicationContext appContext = SpringApplication.run(SpringStepByStepApplication.class, args);

		SearchAlgorithm searchAlgorithm = appContext.getBean(BinarySearchImpl.class);
		int position = searchAlgorithm.search(numbers, number);
		System.out.println(String.format("Found int %d in array %s at position %d",
				number,
				Arrays.toString(numbers),
				position
		));
	}

}
