import ru.netology.service.CustomsService;

import java.util.Scanner;

public class CalculationDuty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вас привествует программа расчета пошлины!");

        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        int result = CustomsService.calculateCustoms(price, weight);

        System.out.println("Размер пошлины (в руб.) составит: " + result);


    }
}
