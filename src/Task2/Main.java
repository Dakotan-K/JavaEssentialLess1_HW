package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double side1;
        double side2;

        System.out.print("Введите длину 1 стороны треугольника: ");
        Scanner in = new Scanner(System.in);
        side1 = in.nextDouble();
        System.out.print("Введите длину 2 стороны треугольника: ");
        side2 = in.nextDouble();

        System.out.println("Площадь треугольника = " + Rectangle.areaCalculator(side1, side2));
        System.out.println("Периметр треугольника = " + Rectangle.perimeterCalculator(side1, side2));
    }
}
