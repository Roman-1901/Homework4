public class Task2_3 {
    public static void main(String[] args) {
        int people = 100;
        int counts = 102;
        int seats = 60;
        int other = counts - seats;
        if (people < seats) {
            seats -= people;
            System.out.println("Количество свободных сидячих мест " + seats);
        } else if (people >= seats && people < counts) {
            other -= (people - seats);
            System.out.println("Сидячих мест нет. Количество стоячих мест " + other);
        } else if (people >= counts) {
            System.out.println("Свободных мест нет");
        }
    }
}