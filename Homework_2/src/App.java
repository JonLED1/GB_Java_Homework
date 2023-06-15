public class App {
    public static void main(String[] args){

        // Дана строка sql-запроса "select * from students where ".
        // Сформируйте часть WHERE этого запроса, используя StringBuilder. 
        // Данные для фильтрации приведены ниже в виде json-строки.
        // Если значение null, то параметр не должен попадать в запрос.
        // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        // В итоге должно получится select * from students where name=Ivanov, country=Russia, city=Moscow
        String sql_req = "select * from students where ";
        String filter = "{\"name\":\"Ivanov\",\"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        filter = filter.replace("{", "").replace("}", "").replace("\"", "").replace(" ", "");

        String[] arr_filter = filter.split(",");
    
        System.out.println(arr_filter[0]);


  
       
        


        
        
     
    
        //*Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder
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
}