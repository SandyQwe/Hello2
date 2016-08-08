import java.util.Random;

/**
 * Created by sadmin on 08.12.2015.
 */
public class TestRandom {
    public static void main(String[] args) {
        Random rnd = new Random();
        float middleRandom = 0;
        int countZero = 0,  //счетчик нулей в выборке
                countHundred = 0, //счетчик сотен в выборке
                countEquals = 0,    //счетчик одинаковых чисел стоящих рядом в выборке
                countPast = 0; //счетчик трех одинаковых чисел стоящих рядом в выборке
        int range = 100000;    //мощность выборки (количество бросков кубика)
        int lastK = 0;  //переменная для сравнения рядом стоящих чисел в выборке
        int pastK = 1;  //переменная для сравнения трёх рядом стоящих чисел
        for (int i = 0; i <= range; i++) {
            int k = rnd.nextInt(101);
            middleRandom = middleRandom + k;
            if (k == lastK) {
                countEquals++;
            }
            if (k == lastK && k == pastK) {
                countPast++;
            }
            if (k == 0) {
                //System.out.println("Zero!");
                countZero++;
            } else {
                if (k == 100) {
                    //System.out.println("Hundred!");
                    countHundred++;
                }
                lastK = k;
            }
        }
        middleRandom = middleRandom / range;
        System.out.println("Среднее: " + middleRandom);
        System.out.println("Всего нулей: " + countZero + "\n" + "Всего сотен (100): " + countHundred + "\n" + "Одинаковые подряд:" + countEquals + "\n" + "Три одинаковые подряд: " + countPast);
    }
}
