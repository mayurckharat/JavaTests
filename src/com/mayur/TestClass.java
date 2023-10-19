package com.mayur;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {

		//getFabSeries();
		//sortArray();
		//sortArray1();
		//printStringReverseOrder();
		//stringReversal();
		//findDuplicateElement();
		//findPrimeNumber();
		//palindromeNumbers();
		
	}

	private static void palindromeNumbers() {
		int originalNum=3223, reversedNum=0, ramainder;
		int num=originalNum;
		while(num !=0) {
			ramainder = num%10;
			reversedNum = reversedNum * 10+ramainder;
			num = num/10;
		}
		
		if(originalNum==reversedNum) {
			System.out.println(originalNum +" is Palindrome");
		}else {
			System.out.println(originalNum +" is Not a Palindrome");
		}
	}

	private static void findPrimeNumber() {
		for(int i=0;i<=100;i++) {
			boolean flag=true;
			for(int j=2;j<=100;j++) {
				if(i!=j && i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(i+" is Prime number");
			}
		}
	}

	private static void findDuplicateElement() {
		int[] arr = {1,3,2,3,4,6,1,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

	private static void stringReversal() {
		String str = "Pune";
		char[] arr = str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}

	private static void printStringReverseOrder() {
		String str = "My Name Is Mayur";
		String[] arr = str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void sortArray1() {
		int[] arr = {3,4,2,1,6,0};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sortArray() {
		int[] arr = {3,4,2,1,6,0};
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	private static void getFabSeries() {
		int num1=0,num2=1,temp=0;
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i=0;i<10;i++) {
			temp=num1+num2;
			System.out.println(temp);
			num1=num2;
			num2=temp;
		}
	}

}
