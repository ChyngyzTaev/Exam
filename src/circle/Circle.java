package circle;

public class Circle {
    private double radius;
    private static final double PI = 3.14;
    static int count = 0;

    public Circle() {

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public void square(){
        double num = PI * radius * 2;
        if ((num % 3 ) == 0){
            count ++;
        }
        System.out.println("Круг = " + num );
    }
}
