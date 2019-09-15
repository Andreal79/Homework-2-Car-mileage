import java.util.Scanner; //(нашел в интернете использовал в задаче)
public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);  // инструмент для пользовательского ввода
        double volume; //создаём переменную - объема бака
        double fuelUsage; //создаём переменную - расход топлива

        System.out.print("Введите объем бака Вашего автомобиля в литрах: ");  //выводим на консоль сообщение о вводе
        volume = vvod.nextDouble();  //вводим с клавиатуры значение в созданную переменную
        System.out.println("Объема Вашего бака: " + volume + " л.");//выводим отформатированное сообщение
        // содержащее значение введённой переменной

        System.out.print("Введите расход топлива Вашего автомобиля, литров на 100 км.: ");
        fuelUsage = vvod.nextDouble();  //вводим с клавиатуры значение в созданную переменную
        System.out.println("Расход топлива Вашего автомобиля: " + fuelUsage + " л./100 км.");

        double distance = (volume / fuelUsage) * 100;
        System.out.print("На вашем топливе вы проедете ");
        System.out.printf("%.0f" , distance); // (эту вещь прочитал в интернете, ипсользовал чтобы убрать значения после запятой)
        System.out.print(" км.");

    }
}
