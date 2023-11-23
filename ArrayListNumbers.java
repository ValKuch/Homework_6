package org.JavaHW;
import java.util.*;

public class ArrayListNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numbers.add(randomNumber);}

            //1)
            System.out.println("All elements of the collection:");
            System.out.println(numbers);

            //2)
            int minNumber = Collections.min(numbers);
            int maxNumber = Collections.max(numbers);
            System.out.println("\nMinimum number: " + minNumber);
            System.out.println("Maximum number: " + maxNumber);


            //3)
            double sum = 0;
            for(int number : numbers) {
                System.out.print(number + " ");
                sum += number; }
                double average = (double) sum / numbers.size();
                System.out.println("\nAverage value is: " + average);

            //4)
            for (int j = 0; j <numbers.size(); j++) {
            int num = numbers.get(j);
            if (num % 2 == 0) {
                numbers.remove(j);
                j--; } }
                System.out.println("\nCollection without even numbers:");
                System.out.println(numbers);

            //5)
            int givenNumber = 50;
            boolean containsNumber = numbers.contains(givenNumber);
            System.out.println("\nDoes the collection contain " + givenNumber + "? " + containsNumber);

            //6)
            Collections.sort(numbers);
            System.out.println("\nSorted collection: ");
            System.out.println(numbers);

        }
    }

