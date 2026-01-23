package com.aldeerdev.practice.utils;

import java.util.Random;

public class RandomUtils {
	
	private static final Random RANDOM = new Random();
	
	public static int intBetwnn(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("min no puede ser mayor de max.");
		}
		return RANDOM.nextInt(max - min + 1) + min;
	}
}
