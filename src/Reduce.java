public class Reduce {
    public static void main(String[] args) {
        int a = 10;
        int i = 0;
        while (a != 0) {
            if (a % 2 == 0) {
                a = a / 2;
                i++;
            }
            else {
                a = a - 1;
                i++;
            }
        }
        System.out.println(i);
    }
}
