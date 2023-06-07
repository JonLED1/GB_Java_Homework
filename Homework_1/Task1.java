package GB_Java_Homework.Homework_1;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int i = Rnd_Number(2001);
        System.out.println("Случайное число (0-2000)= " + i);
        int n = High_Bit(i);
        System.out.println("Старший значащий бит = " + n);
        int[] m1 = Array_Max(i, n);
        System.out.println("Найдено " + m1.length + " кратных " + n + " чисел в диапазоне от " + i + " до " + Short.MAX_VALUE);
        int[] m2 = Array_Min(i, n);
        System.out.println("Найдено " + m2.length + " некратных " + n + " чисел в диапазоне от " + Short.MIN_VALUE + " до " + i);
    }

    static int Rnd_Number(int i) {
        i = new Random().nextInt(i);
        return i;
    }

    static int High_Bit(int n) {
        int res = 0;
        while (n != 1) {
            n >>= 1;
            res++;
        }
        return res;
    }

    static int[] Array_Max(int i, int n) {
        int len_arr = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                len_arr++;
            }
        }
        int[] m1 = new int[len_arr];
        int count=0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[count] = j;
                count++;
            }
        }
        return m1;
    }

    static int[] Array_Min(int i, int n) {
        int len_arr = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                len_arr++;
            }
        }
        int[] m2 = new int[len_arr];
        int count=0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                m2[count] = j;
                count++;
            }
        }
        return m2;
    }

}
