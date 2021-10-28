package com.ehmr.spring.basics.springstepbystep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStepByStepApplication {

	public static void main(String[] args) {

		int[] numbers = new int[] {5, 3, 24};

		SortAlgorithm sortAlgorithm = new QuickSortAlgorithm();

		BinarySearchImpl binarySearch = new BinarySearchImpl(sortAlgorithm);
		System.out.println(binarySearch.binarySearch(numbers, 3));

		SpringApplication.run(SpringStepByStepApplication.class, args);
	}

}
