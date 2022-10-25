public class Task1_2 {
    public static void main(String[] args) {
        int age = 33;
        if (age < 7) {
            System.out.println("Ребенку еще рано в школу");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24 && age < 60) {
            System.out.println("Человек окончил университет и ему пора искать работу");
        }
        if (age >= 60) {
            System.out.println("Человеку пора на пенсию");
        }

    }
}
