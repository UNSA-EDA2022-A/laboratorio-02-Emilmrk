package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		System.out.println("inicio");
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n,n-1));			
		}
	}

	public boolean esCuadradoPerfecto(double numero, double count) {
		if(count<=1) {
			return false;
		}
		if(count*count==numero) {
			return true;
		}else {
			
			return esCuadradoPerfecto(numero, count-1);
		}
	}
}
