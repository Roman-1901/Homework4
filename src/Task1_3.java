public class Task1_3 {
    public static void main(String[] args) {
        int people = 102;
        if (people < 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (people >= 60 && people < 102) {
            System.out.println("В вагоне закончились сидячие места, но есть стоячие места");
        }
        if (people >= 102) {
            System.out.println("Вагон полностью забит");
        }
    }
}
