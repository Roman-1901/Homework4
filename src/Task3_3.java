public class Task3_3 {
    public static void main(String[] args) {
        int one = 100;
        int two = 31;
        int three = 55;
        boolean maxOne = one >= two && one >= three;
        boolean maxTwo = two >= one && two >= three;
        boolean maxThree = three >= one && three >= two;
        if (maxOne) {
            System.out.println("Максимальное число - " + one);
        } else if (maxTwo) {
            System.out.println("Максимальное число - " + two);
        } else if (maxThree) {
            System.out.println("Максимальное число - " + three);
        }
    }
}
