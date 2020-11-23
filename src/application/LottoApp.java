package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class LottoApp {

	static Random gen = new Random();

	public static void main(String[] args) {
		int hamisparHahazak;
		int[] luckyNumbers = new int[6];
		ran(luckyNumbers);
		selectSort(luckyNumbers);
		System.out.println(Arrays.toString(luckyNumbers));
		hamisparHahazak = (1 + gen.nextInt(7));
		System.out.println("     "+hamisparHahazak);
		for (int i = 0; i < 3; i++) {
			
		
		lottoShufle();
		}
	}

	private static void lottoShufle() {
		ArrayList<Integer> num = new ArrayList<>();
		ArrayList<Integer> tos = new ArrayList<>();
		for (int i = 1; i < 37; i++) {
			num.add(i);
			if (i < 8) {
				tos.add(i);
			}
		}

		Collections.shuffle(num);
		Collections.shuffle(tos);
		for (int i = 0; i < 6; i++) {
			System.out.print(num.get(i) + ", ");
		}
		System.out.println();
		System.out.println("     "+tos.get(0));

	}

	static void ran(int[] arr) {
		int j, i;
		arr[0] = (1 + gen.nextInt(37));
		for (i = 1; i < 6; i++) {
			arr[i] = (1 + gen.nextInt(37));
			j = 0;
			for (; j < i; j++)
				if (arr[j] == arr[i])
					i--;
		}
	}

	static void selectSort(int[] arr) {
		int i, i_min;
		for (i = 0; i < 5; i++) {
			i_min = minValue(arr, i);
			if (i != i_min)
				;
			swap(arr, i_min, i);
		}
	}

	static int minValue(int[] arr, int i) {
		int min = arr[i];
		int i_min = i;
		for (; i < 6; i++) {
			if (arr[i] < min) {
				min = arr[i];
				i_min = i;
			}
		}
		return i_min;
	}

	public static void swap(int[] arr, int i, int j) {
		int pocket = arr[i];
		arr[i] = arr[j];
		arr[j] = pocket;
	}
}
