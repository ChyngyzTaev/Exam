package pizza;

import java.util.Scanner;

public class Pizzeria {
    Scanner scanner = new Scanner(System.in);
    private LaFinta[] laFinta;
    private Margarita[] margarita;
    private Pepperoni[] peperoni;


    public void setMargarita(Margarita margarita,int size) {
        this.margarita = new Margarita[size];
        for (int i = 0; i < this.margarita.length; i++) {
            if (this.margarita[i] == null) {
                this.margarita[i] = margarita;
                break;
            }
        }
        System.out.println("С мясом или без? ");
        String withMeatOrNot = scanner.next();

        if (withMeatOrNot.equals("да")) {
            margarita.setWithMeatOrNot(true);
        } else {
            margarita.setWithMeatOrNot(false);
        }
        System.out.println("Какой размер? (большой, средний, маленький)");
        boolean price = true;

        while (price) {
            String scales = scanner.next();
            if (scales.equals("большой")) {
                margarita.setWeight(3.5);
                margarita.setPrice(1000);
                price = false;

            } else if (scales.equals("маленький")) {
                margarita.setWeight(1);
                margarita.setPrice(500);
                price = false;

            } else if (scales.equals("средний")) {
                margarita.setWeight(2);
                margarita.setPrice(700);
                price = false;
            } else {
                System.out.println("Вы сделали ошибку при выборе, просьба повторить операцию! ");
            }
        }

        System.out.println("Начать готовить? (Приготовление, на лицевой стороне): ");
        String order = scanner.next();
        boolean cookOrFront =true;
        while (cookOrFront) {

            if (order.equals("да") || order.equals("готовка")) {

                System.out.println("Ваша пица будет готова через 10 минут: ");
                margarita.setCook("Подготовка");
                cookOrFront = false;

            } else {
                System.out.println("Вы ошиблись!");
            }
        }
        System.out.println(margarita);
    }

    public Margarita[] getMargarita() {
        return margarita;
    }

    public void setMargarita(Margarita[] margarita) {
        this.margarita = margarita;
    }

    public void setLaFinta(LaFinta laFinta, int size) {
        this.laFinta = new LaFinta[size];
        for (int i = 0; i < this.laFinta.length; i++) {
            if (this.laFinta[i] == null) {
                this.laFinta[i] = laFinta;
                break;
            }
        }
        System.out.print("С грибами? ");
        String withMeatOrNot = scanner.next();
        if (withMeatOrNot.equals("да")) {
            laFinta.setWithCheese(true);
        } else {
            laFinta.setWithCheese(false);
        }

        System.out.println("Какой размер? (большой, средний, маленький)");
        boolean price = true;

        while (price) {
            String scales = scanner.next();
            if (scales.equals("большой")) {
                laFinta.setWeight(3.5);
                laFinta.setPrice(1000);
                price = false;

            } else if (scales.equals("маленький")) {
                laFinta.setWeight(1);
                laFinta.setPrice(500);
                price = false;

            } else if (scales.equals("средний")) {
                laFinta.setWeight(2);
                laFinta.setPrice(700);
                price = false;

            } else {
                System.out.println("Вы сделали ошибку при выборе, просьба повторить операцию! ");
            }
        }

        System.out.println("Начать готовить? (Приготовление, на лицевой стороне): ");
        String order = scanner.next();

        boolean cookOrFront =true;
        while (cookOrFront) {

            if (order.equals("да") || order.equals("готовка")) {
                System.out.println("Ваша пица будет готова через 12 минут: ");
                laFinta.setCook("подготовка");
                cookOrFront = false;

            } else {
                System.out.println("Вы ошиблись!");
            }
        }
        System.out.println(laFinta);
    }

    public LaFinta[] getLaFinta() {
        return laFinta;
    }

    public void setLaFinta(LaFinta[] laFinta) {
        this.laFinta = laFinta;
    }

    public void setPeperoni(Pepperoni peperoni, int size) {
        this.peperoni = new Pepperoni[size];
        for (int i = 0; i < this.peperoni.length; i++) {
            if (this.peperoni[i] == null) {
                this.peperoni[i] = peperoni;
                break;
            }
        }

        System.out.println("Какой размер? (большой, средний, маленький)");
        boolean price = true;

        while (price) {
            String scales = scanner.next();
            if (scales.equals("большой")) {
                peperoni.setWeight(3.5);
                peperoni.setPrice(1000);
                price = false;

            } else if (scales.equals("маленький")) {
                peperoni.setWeight(1);
                peperoni.setPrice(500);
                price = false;

            } else if (scales.equals("средний")) {
                peperoni.setWeight(2);
                peperoni.setPrice(700);
                price = false;

            } else {
                System.out.println("Вы сделали ошибку при выборе, просьба повторить операцию!");
            }
        }

        System.out.println("Начать готовить? (Приготовление, на лицевой стороне): ");
        String order = scanner.next();

        boolean cookOrFront = true;
        while (cookOrFront) {

            if (order.equals("да") || order.equals("готовка")) {

                System.out.println("Ваша пица будет готова через 7 минут: ");
                peperoni.setCook("Подготовка");
                cookOrFront = false;

            } else {
                System.out.println("Вы ошиблись!");
            }
        }
        System.out.println(peperoni);
    }

    public Pepperoni[] getPeperoni() {
        return peperoni;
    }

    public void setPeperoni(Pepperoni[] peperoni) {
        this.peperoni = peperoni;
    }
}
