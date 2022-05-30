import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int digitSumprimeNumberCount = 0;
        int digitSumnotprimeNumberCount = 0;

        int digitSum = 0;

        if (number < -1){
            System.err.println("Incorrect number!!!");
            System.exit(000);
        }

        while (number != -1){

            int verificationnumber = number;

            while (verificationnumber !=0 ) {

                digitSum = digitSum + verificationnumber % 10;
                verificationnumber = verificationnumber / 10;
            }


                int x = 2;
                boolean isPrime = true;
                while ((x * x) < digitSum) {
                    if (digitSum % x == 0) {
                        isPrime = false;
                        break;
                    }
                    x++;
                }

                if (isPrime) {
                    digitSumprimeNumberCount++;
                } else {
                    digitSumnotprimeNumberCount++;
                }
                number = scanner.nextInt();

        }
        System.out.println(digitSumprimeNumberCount);
        System.out.println(digitSumnotprimeNumberCount);
    }
}