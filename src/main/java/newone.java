public class newone {
    public static void main(String[] args) {
        print("Привет");
        print("user");
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s) );


        Rectangle r = new Rectangle(4,6);
       // r.a = 3;
        //r.b = 12;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r) );
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static double area(Square s){
        return s.l * s.l;
    }

    public static double area(Rectangle r){
        return r.a * r.b;
    }
}



