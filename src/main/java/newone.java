public class newone {
    public static void main(String[] args) {
        print("Привет");
        print("user");
        Square s = new Square(4);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area() );


        Rectangle r = new Rectangle(4,6);
        //r.a = 3;
        //r.b = 12;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area() );
    }

    public static void print(String text) {
        System.out.println(text);
    }

}



