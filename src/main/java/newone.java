public class newone {
    public static void main(String[] args) {
        print("Привет");
        print("user");

        double l = 5;
        double a = 3;
        double b = 12;

        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l) );
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(b, a) );
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static double area(double len){
        return len*len;
    }

    public static double area(double a, double b){
        return a * b;
    }
}



