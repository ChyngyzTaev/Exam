package circle;

public class Launch {
    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1);
            System.out.print(i + 1 + "й ");
            circles[i].square();
        }
    }
}
