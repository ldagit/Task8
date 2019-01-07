package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int numb[] = new int[10];
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите в массив 10 целых чисел: ");
        for (i=0; i<10; ++i){
            System.out.printf("numb[%d] = ", i);
            numb[i] = in.nextInt();
        }
        System.out.println("Каждый элемент массива умножается на 2: ");
        for (i=0; i<10; ++i){
           // numb[i] = numb[i]*2;
            System.out.print(2*numb[i] + " ");

        }
    }
}