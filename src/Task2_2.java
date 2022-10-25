public class Task2_2 {
    public static void main(String[] args) {
        int age = 68;
        if (age < 7) {
            System.out.println("Ребенку еще рано в школу");
        } else if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age >= 24 && age < 60) {
            System.out.println("Человек окончил университет и ему пора искать работу");
        } else {
            System.out.println("Человеку пора на пенсию");
        }
    }
}
