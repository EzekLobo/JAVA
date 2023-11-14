public class Tabuada {
    public static void main(String[] args) {
        int num = 5;
        tabuada(num);
    }

    public static void tabuada(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }
}
