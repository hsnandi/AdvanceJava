package com.stream_api;

import com.entities.Student;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		int[] intArray = { 3, 2, 8, 7, 5, 1, 4, 9, 6 };

		IntStream intStream = Arrays.stream(intArray);

		// We can use multiple features in one array, using StreamAPI.
		intStream.filter(no -> no % 2 == 0) // for choosing only even numbers.
		.filter(number -> number > 2)
		.map(num -> num + 1)	
		.forEach(no -> System.out.println(no));
		// Here first its filtering only even number, and then adding 1 to each of the
		// filtered output.

		Student[] studentArray = new Student[5];
		studentArray[0] = new Student(1, "Harish", 21);
		studentArray[1] = new Student(2, "Sagar", 20);
		studentArray[2] = new Student(3, "Omkar", 22);
		studentArray[3] = new Student(4, "Akshay", 24);
		studentArray[4] = new Student(5, "Frank", 27);

		Stream<Student> studentStream = Arrays.stream(studentArray);
		studentStream.map(e -> e.getName())
		.filter(name -> name.charAt(1) == 'a')
		.forEach(name -> System.out.println(name));

		Stream<Student> studentStream2 = Arrays.stream(studentArray); // for second operation of even Roll number.
		studentStream2.map(f -> f.getRollNo())
		.filter(rollNo -> rollNo % 2 == 0)
		.forEach(rollNo -> System.out.println(rollNo));
		
		Stream<Student> studentStream3 = Arrays.stream(studentArray); // for third operation of odd Roll number.
		studentStream3
		.filter(rollNo -> rollNo.getRollNo() % 2 == 1)
		.forEach(rollNo -> System.out.println(rollNo));
	}
}
