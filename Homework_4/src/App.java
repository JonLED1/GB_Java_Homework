// Организовать вводи и хранение данных пользователей. ФИО возраст и пол
// вывод в формате Фамилия И.О. возраст пол
// добавить возможность выхода или вывода списка отсортированного по возрасту!)
// *реализовать сортировку по возрасту с использованием индексов
// *реализовать сортировку по возрасту и полу с использованием индексов

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.print("\033[H\033[J");
        String encoding = System.getProperty("console.encoding", "cp866"); // utf-8 почему-то не заработал
        Scanner scanner = new Scanner(System.in, encoding);

        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> surNames = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> genders = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();

        String input_line = "";
        int index_num = 0;
        System.out.println("Введите через пробел Фамилию Имя Отчество возраст пол (м/ж)\n1 - выход и сортировка по возрасту\n2 - выход и сортировка по возрасту с использованием индексов");
        while (true) {
            input_line = scanner.nextLine();
            if (input_line.equals("1")==false & input_line.equals("2")==false){
                String[] input_line_list = input_line.split(" ");
                if (input_line_list.length==5 ){
                    if (isNumeric(input_line_list[3])==true){
                        lastNames.add(0, input_line.split(" ")[0]);
                        firstNames.add(0, input_line.split(" ")[1]);
                        surNames.add(0, input_line.split(" ")[2]);
                        ages.add(0, Integer.parseInt(input_line.split(" ")[3]));
                        genders.add(0, input_line.split(" ")[4]);
                        index.add(0, index_num);
                        index_num++;
                    }
                    else System.out.println("Возраст должно быть число!");
                }
                else System.out.println("Неправильный ввод данных!");
            }
            else{
                scanner.close();
                break;
            }
        }

        if (input_line.equals("1")){
            for (int i=0; i<ages.size()-1; i++){
                for (int n = i+1; n < ages.size(); n++){
                    if (ages.get(n) < ages.get(i)){
                        Collections.swap(ages, i, n);
                        Collections.swap(firstNames, i, n);
                        Collections.swap(lastNames, i, n);
                        Collections.swap(surNames, i, n);
                        Collections.swap(genders, i, n);
                    }
                }
            }      
        }

        if (input_line.equals("2")){
            ArrayList<Integer> ages2 = new ArrayList<>(ages);
            for (int i=0; i<index.size(); i++){
                index.set(i, ages2.indexOf(Collections.max(ages2)));
                ages2.set(ages2.indexOf(Collections.max(ages2)), 0);
            }
        }

        for (int i=0; i<index.size(); i++){
            System.out.println(lastNames.get(index.get(i)) + " " + firstNames.get(index.get(i)) + " " + surNames.get(index.get(i)) + " " + ages.get(index.get(i)) + " " + genders.get(index.get(i)));
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
            }
        
    }
}
