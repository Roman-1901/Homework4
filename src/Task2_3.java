public class Task2_3 {
    public static void main(String[] args) {
        int people = 42;
        if (people < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (people >= 60 && people < 102) {
            System.out.println("В вагоне закончились сидячие места, но есть стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
    }
}
