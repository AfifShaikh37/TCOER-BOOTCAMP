public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        // Here you can imagine true as 1 and false as 0
        System.out.println("a && b : " + (a && b));
        System.out.println("a || b : " + (a || b));
        System.out.println("!a : " + (!a));
        System.out.println("(a && c) || b : " + ((a && c) || b));
        System.out.println("!(a || b) : " + (!(a || b)));
        System.out.println("(a || b) && (!c) : " + ((a || b) && (!c)));
    }
}
