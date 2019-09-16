import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double volume;
        double fuelUsage;

        System.out.print("Введите объем бака Вашего автомобиля в литрах: ");
        volume = input.nextDouble();
        System.out.println("Объема Вашего бака: " + volume + " л.");

        System.out.print("Введите расход топлива Вашего автомобиля, литров на 100 км.: ");
        fuelUsage = input.nextDouble();
        System.out.println("Расход топлива Вашего автомобиля: " + fuelUsage + " л./100 км.");

        double distance = (volume / fuelUsage) * 100;
        System.out.printf("На вашем топливе вы проедете %.0f км." , distance);


    }
}
