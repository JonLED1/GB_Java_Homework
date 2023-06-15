public class App {
    public static void main(String[] args){

        // Дана строка sql-запроса "select * from students where ".
        // Сформируйте часть WHERE этого запроса, используя StringBuilder. 
        // Данные для фильтрации приведены ниже в виде json-строки.
        // Если значение null, то параметр не должен попадать в запрос.
        // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        // В итоге должно получится select * from students where name=Ivanov, country=Russia, city=Moscow
        StringBuilder sql_req = new StringBuilder ("select * from students where ");
        String filter = "{\"name\":\"Ivanov\",\"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        filter = filter.replace("{", "").replace("}", "").replace("\"", "").replace(" ", "");

        String[] arr_filter = filter.split(",");
        for (int n  = 0; n < arr_filter.length; n++){
            if (arr_filter[n].contains("null")) continue;
            else{
                sql_req.append(arr_filter[n].replace(":", "=") + ", ");
            }
        
        }
        sql_req.delete(sql_req.length()-2, sql_req.length());
        System.out.println(sql_req);

        // Дана json-строка (можно сохранить в файл и читать из файла)
        // [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
        // Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
        // Пример вывода:
        // Студент Иванов получил 5 по предмету Математика.
        // Студент Петрова получил 4 по предмету Информатика.
        // Студент Краснов получил 5 по предмету Физика.
        System.out.println();
        String a = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] arr_a = a.split("}");
        for (int n=0; n < arr_a.length-1; n++) System.out.println(Parse_Func(arr_a[n]));
        
        
        //*Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder
        System.out.println();
        String ss = "";
        long start = System.currentTimeMillis();        
        for (int i = 0; i < 1000; i++) ss+=Character.getName(i);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        ss = ss.toLowerCase();
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        StringBuilder bb = new StringBuilder(ss);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        ss = ss.replace('a', 'A');
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (int i=0; i < bb.length(); i++){
            if (bb.charAt(i) == 'a') bb.setCharAt(i, 'A');
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        bb = new StringBuilder(bb.toString().replace('a', 'A'));
        System.out.println(System.currentTimeMillis() - start);
    }

    static String Parse_Func(String a){
        a = a.replace(",", "").replace("{", "").replace(":", "")
            .replace("[", "").replace("]", "").replace("\"", "");
        a = a.replace("фамилия", "Студент ").replace("оценка", " получил ").replace("предмет", " по предмету ");
        return a+".";
        }
}