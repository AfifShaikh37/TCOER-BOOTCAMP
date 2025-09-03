public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 7;
        a &= 3;
        int b = 12;
        b |= 5;
        int c = 10;
        c ^= 4;
        int d = 16;
        d <<= 2;
        int e = 32;
        e >>= 3;
        int f = 255;
        f >>>= 4;
        System.out.println("a &= 3 : " + a);
        System.out.println("b |= 5 : " + b);
        System.out.println("c ^= 4 : " + c);
        System.out.println("d <<= 2 : " + d);
        System.out.println("e >>= 3 : " + e);
        System.out.println("f >>>= 4 : " + f);
    }
}

