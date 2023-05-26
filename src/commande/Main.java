package commande;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        System.out.println("Lancement du Test 1:");
        test.lancerTest1();
        System.out.println("---------------------------");

        System.out.println("Lancement du Test 2:");
        test.lancerTest2();
        
    }
}
