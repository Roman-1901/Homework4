public class Task3_2 {
    public static void main(String[] args) {
        int age = 30;
        if (age <= 5) {
            System.out.println("Ребенку " + age + " лет. Кататься на аттракционе нельзя.");
        } else if (age > 5 && age < 14) {
            System.out.println("Ребенку " + age + " лет. Кататься на аттракционе можно только в сопровождении взрослого.");
        } else if (age >= 14 && age < 18) {
            System.out.println("Ребенку " + age + " лет. Кататься на аттракционе можно без сопровождения взрослого.");
        } else {
            System.out.println("Человек уже не является ребенком.");
        }
    }
}
