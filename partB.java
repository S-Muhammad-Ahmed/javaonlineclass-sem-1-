import java.util.Scanner;

public class partB {

    static int[] convertToBinary(int number) {

        int n = number;
        int[] temp = new int[32];
        int index = 0;

        if (n == 0) {
            int[] zero = {0};
            return zero;
        }

        while (n > 0) {
            temp[index] = n % 2;
            n = n / 2;
            index++;
        }

        int[] binaryArray = new int[index];
        for (int i = 0; i < index; i++) {
            binaryArray[i] = temp[index - 1 - i];
        }

        return binaryArray;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        int[] result = convertToBinary(number);

        System.out.print("Binary of " + number + " is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();

        input.close();
    }
}
