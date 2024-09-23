package kz.my_projec.first_project;

import java.util.Scanner;

public class firstTask {

    public static void greetings(){
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java!");
    }

    public static void checkSigh(int a, int b, int c){
        int result = a + b + c;
        if (result > 0) {
            System.out.println("Число положительное: " + result);
        } else {
            System.out.println("Число не положительное: " + result);
        }
    }

   public static void selectColor(int a){
        if (a <= 10)
        {
            System.out.println("Красный");
        }
        else if (a > 11 && a <= 20)
        {
            System.out.println("Желтый");
        }
        else
        {
            System.out.println("Зеленый");
        }
   }

    public static void compareNumber(int a, int b){
        if (a <= b)
        {
            System.out.println(a + "<=" + b);
        }

        else
        {
            System.out.println(a + ">" + b);
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment){
            System.out.println(initValue + delta);
        }
        else {
            System.out.println(initValue - delta);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the method from 1 to 5: ");
        int input = scanner.nextInt();
        if (input == 1) {
            //first task
            greetings();
        }
        else if (input == 2) {
            //second task
            checkSigh(5, 7, 9);
        }
        else if (input == 3) {
            //third task
            selectColor(15);
        }
        else if (input == 4) {
            //fourth task
            compareNumber(10, 12);
        }
        else {
            //fifth task
            addOrSubtractAndPrint(10, 7, false);
        }
    }
 }
