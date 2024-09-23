package kz.my_projec.first_project;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class secondTask {

    public static void sumArray(int[] array){
        int sum = 0;
        for (int num: array) {
            sum += num;
        }
        System.out.println(sum);
    }

    public static void addNumbers(int[] array){

    }

    public static void main(String[] args) {
        //first task
        int[] massive = {3, 4, 5 , 5};
        sumArray(massive);
        // second task
        int[] an_array = new int[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("do you want to add one more: yes or no ");
        int input = scanner.
        if (input == "yes") {
            addNumbers(an_array);
        }

    }
}
