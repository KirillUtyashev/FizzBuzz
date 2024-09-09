public class Reduce {
    public static void main(String[] args) {
        int number = 100;
        int counter = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number -= 1;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
