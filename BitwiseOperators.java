public class BitwiseOperators {

    public static void main(String[] args) {
        int p = 9;
        int q = 10;
        System.out.println("OR" + (p | q));
        System.out.println("AND" + (p & q));
        System.out.println("Left shift" + (p << q));
        System.out.println("Right shift" + (p >> q));
        System.out.println("XOR" + (p ^ q));
    }
}