package pizza;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizzeria pizzeria = new Pizzeria();

        int point;
        do {
            System.out.println("Добро пожаловать в Пицерию! \n" +
                    "Меню " + "\n" +
                    "1. Margarita" + "\n" +
                    "2. LaFinta" + "\n" +
                    "3. Pepperoni" + "\n" +
                    "0.  Завершить");
            System.out.print(">" + '\t');

            point = scanner.nextInt();
            switch (point) {
                case 1:
                    Margarita margarita = new Margarita();
                    pizzeria.setMargarita(margarita, 25);
                    break;
                case 2:
                    LaFinta laFinta = new LaFinta("Зелень", "Сырный соус");
                    pizzeria.setLaFinta(laFinta, 25);
                    break;
                case 3:
                    Pepperoni pepperoni = new Pepperoni();
                    pizzeria.setPeperoni(pepperoni, 25);
                    break;
                case 0:
                    break;

            }
            if(point != 0) {
                System.out.println("Будете делать ещё заказ?");
                String yesOrNot = scanner.next();
                if (yesOrNot.equals("нет")) {
                    point = 0;
                }
            }

        }
        while (point != 0);
    }
}
