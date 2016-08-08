import java.util.Random;

/**
 * Created by sadmin on 08.12.2015.
 */
public class Kolobok {
    public static void main(String[] args) {
       // int gh;
        Random rnd = new Random();
        int gh = rnd.nextInt(41);
        System.out.println("Колобок и " + gh + " разбойников");
        for (int i = 1; i <= gh; i++) {
            System.out.println("Здравствуй, " + i + "-й разбойник!" + "\n" + "Здравствуй, Колобок!");
        //    System.out.println();
        }
        for (int i = gh; i >= 1; i--) {
            System.out.println("До свидания, " + i + "-й разбойник!" + "\n" + "До свидания, Колобок!");

        }
    }
}
