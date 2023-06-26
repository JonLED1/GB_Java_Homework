import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        //Пусть дан произвольный список целых чисел.

        // 1) Нужно удалить из него чётные числа
        // 2) Найти минимальное значение
        // 3) Найти максимальное значение
        // 4) Найти среднее значение;

        ArrayList<Integer> list = new ArrayList<>();
        int len_list = 10;
        for (int i=0; i<len_list-1; i++) list.add(i, new Random().nextInt(10));
        System.out.println("Дан список = " + list);
        list.removeIf((item -> (item % 2) == 0));
        System.out.println("Удалили четные числа = " + list);
        System.out.println("Минимальное значение = " + Collections.min(list));
        System.out.println("Максимальное значение = " + Collections.max(list));
        System.out.println("Среднее арифметическое = " + average(list));
    }
    
    static double average (ArrayList<Integer> list) {
            double sum = 0;
            for(int i=0;i<list.size();i++) sum+=list.get(i);
            return sum/list.size();
    }
}
