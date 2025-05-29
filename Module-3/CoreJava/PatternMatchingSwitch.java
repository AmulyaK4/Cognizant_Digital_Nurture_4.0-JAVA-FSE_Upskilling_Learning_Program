public class PatternMatchingSwitch {
    public static void main(String[] args) {
        checkType(100);
        checkType("Amulya");
        checkType(45.6);
        checkType(true);
    }

    public static void checkType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer value: " + i);
            case String s -> System.out.println("String value: " + s);
            case Double d -> System.out.println("Double value: " + d);
            default -> System.out.println("Other type");
        }
    }
}

