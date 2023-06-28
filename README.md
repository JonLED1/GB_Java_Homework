# **Курс знакомство с Java. Домашние задания.**

#  Семинар 1. Java: знакомство и как пользоваться базовым API (папка Homework_1).

## Задача 1. (Task1)

1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

Пункты реализовать в методе main
*Пункты реализовать в разных методах

int i = new Random().nextInt(k); //это кидалка случайных чисел!


# Урок 2. Почему вы не можете не использовать API

Формат сдачи: ссылка на подписанный git-проект.

Задание

Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
В итоге должно получится select * from students where name=Ivanov, country=Russia, city=Moscow

Дополнительные задания

Дана json-строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.

*Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.

# Урок 3. Коллекции JAVA: Введение

Формат сдачи: ссылка на подписанный git-проект.

Задание

Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение

# Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
Организовать ввод и хранение данных пользователей. ФИО возраст и пол
вывод в формате Фамилия И.О. возраст пол </br>
добавить возможность выхода или вывода списка отсортированного по возрасту!

*реализовать сортировку по возрасту с использованием индексов

*реализовать сортировку по возрасту и полу с использованием индексов

# Урок 5. Хранение и обработка данных ч2: множество коллекций Map

Формат сдачи: ссылка на подписанный git-проект.

Задание

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

# Урок 6. Хранение и обработка данных ч3: множество коллекций Set 

Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества и метод позволяющий читать элементы по индексу.
*Реализовать все методы из семинара.
Формат данных Integer.