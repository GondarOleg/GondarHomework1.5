package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размерность массива для отрисовки (чётное число будет дополнено до нечётного для получения правильной матрицы): ");
        int massSize = scanner.nextInt();
        if(massSize%2 == 0){
            massSize++;
        }
        for (int i = 0; i < massSize; i++){
            for (int j = 0; j < massSize; j++){
                if(i==j || j == massSize - i -1){
                    System.out.print(i==j & i == massSize/2 ? " 0 " :" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
