import java.util.Scanner;

public class evenincre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the series:");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the series:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The modified series is:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + "  " + number * 2 + " ");
            } else {
                System.out.print(number + " ");
            }
        }
    
    }
}
