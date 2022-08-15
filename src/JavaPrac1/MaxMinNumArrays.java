package JavaPrac1;


import java.util.Arrays;

public class MaxMinNumArrays {
    public static void main(String[] args) {


        int[] numbers = {32, 61, 16, 89, 74, 25};
        Arrays.sort(numbers);
        System.out.println("Smallest number"+" "+numbers[0]);
        System.out.println("Biggest number"+" "+numbers[numbers.length-1]);
        System.out.println("Second biggietst number"+" "+numbers[numbers.length-2]);


    }
}