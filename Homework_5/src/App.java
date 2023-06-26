// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
//  их необходимо считать, как одного человека с разными телефонами.
//  Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.print("\033[H\033[J");
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner scanner = new Scanner(System.in, encoding);
        HashMap<String, ArrayList<String>> contacts = new HashMap<>();
        String input_line = "";

        while (true){
            System.out.println("Введите имя (0-выход): ");
            input_line = scanner.nextLine();
            if (input_line.equals("0")) break;
            if (contacts.containsKey(input_line)){
                ArrayList<String> phone = contacts.get(input_line);
                System.out.println("Введите телефон: ");
                phone.add(scanner.nextLine());
                contacts.replace(input_line, phone);
            }
            else{
                System.out.println("Введите телефон: ");
                ArrayList <String> phone = new ArrayList(Arrays.asList(scanner.nextLine()));
                contacts.put(input_line, phone);
            }
        }
        scanner.close();
        String[] keys = contacts.keySet().toArray(new String[0]);
        Arrays.sort(keys, (val1, val2) -> contacts.get(val2).size() - contacts.get(val1).size());

        for (String key : keys) {
            System.out.println(key + " " + String.join(", ", contacts.get(key)));
        }
    

    }
}




