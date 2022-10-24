public class Task1_3 {
    public static void main(String[] args) {
        int people = 69;
        int counts = 102;
        int seats = 60;
        int other = counts - seats;
        if (people < seats) {
            seats -= people;
            System.out.println("Количество свободных сидячих мест " + seats);
        } if (people >= seats && people < counts) {
            other -= (people - seats);
            System.out.println("Сидячих мест нет. Количество стоячих мест " + other);
        } if (people >= counts) {
            System.out.println("Свободных мест нет");
        }
    }
}
