import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("\t\t\tДобро пожаловать в конвертер ГБ");
//        System.out.println("В " + 8 + " gb: " + (8*1024) + " мб");

        // маса (кг)/ рост2 (м2)
        System.out.println("\t\t\t***Добро пожаловать в калькулятор BMI***");
        System.out.println("Введите свой вес(кг):");
        double weigh = new Scanner(System.in).nextDouble();
        System.out.println("Введите свой рост (м2) через запятую");
        double height = new Scanner(System.in).nextDouble();
        System.out.println("BMI: " + weigh/(height*height));



    }
}
