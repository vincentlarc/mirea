import java.util.Random;

public class quadratisch {
    public static void main(String[] args) {
        double a= new Random().nextInt(100) + 1,b= new Random().nextInt(100) + 1,c= new Random().nextInt(100) + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        double d=b*b-4*a*c;
        double x2;
        double x1;
        if(d>0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
        else if(d==0) {
            x1 = (-b) / (2 * a);
            System.out.println(x1);
        }
        else
        {
            System.out.println("Нет корней");
        }
    }
}
