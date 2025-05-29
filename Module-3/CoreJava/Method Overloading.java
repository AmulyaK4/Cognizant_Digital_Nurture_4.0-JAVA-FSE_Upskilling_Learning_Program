public class Overloading {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("add(int, int): " + add(5, 3));
        System.out.println("add(double, double): " + add(5.5, 3.2));
        System.out.println("add(int, int, int): " + add(1, 2, 3));
    }
}



