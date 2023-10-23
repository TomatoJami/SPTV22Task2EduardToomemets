import java.util.Scanner;

public class SPTV22Task2EduardToomemets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трёхзначное число");
        int number = scanner.nextInt();
        scanner.nextLine();
        
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;
        int sum = ones + tens + hundreds;
        
        System.out.println("В этом числе");
        System.out.printf(" - единиц:  %d\n", ones);
        System.out.printf(" - десятков:  %d\n", tens);
        System.out.printf(" - сотни:  %d\n", hundreds);
        System.out.printf(" - сумма цифр:  %d\n", sum);
        
        scanner.close(); // Закрываем Scanner после использования
    }
}