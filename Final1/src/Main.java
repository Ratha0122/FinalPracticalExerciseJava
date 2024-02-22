


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int Num = scanner.nextInt();
        int[] numbers = new int[Num];
        for (int i = 0; i < Num; i++) {
            System.out.print("Enter the numbers:");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nDisplay all numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ ", ");
        }
        scanner.close();
    }
}