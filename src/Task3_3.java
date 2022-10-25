public class Task3_3 {
    public static void main(String[] args) {
        int one = 10;
        int two = 12;
        int three = 12;
        if (one > two && one > three) {
            System.out.println("Максимальное число - " + one);
        } else if (two > one && two > three) {
            System.out.println("Максимальное число - " + two);
        } else if (three > one && three > two) {
            System.out.println("Максимальное число - " + three);
        } else if (one == two && one > three) {
            System.out.println("Первое число " + one + " равно второму числу " + two + ", являются максимальными");
        } else if (one == three && one > two) {
            System.out.println("Первое число " + one + " равно третьему числу " + three + ", являются максимальными");
        } else if (two == three && two > one) {
            System.out.println("Второе число " + two + " равно третьему числу " + three + ", являются максимальными");
        } else if (one == two && one == three) {
            System.out.println("Первое число " + one + ", второе число " + two + ", третье число " + three + " - числа равны");
        }
    }
}

