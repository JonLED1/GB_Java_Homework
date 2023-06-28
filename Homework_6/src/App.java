import java.util.*;


public class App {
    public static void main(String[] args) {
        SetImit SetImit = new SetImit();

        for (int i = 0; i < 10; i++) {
            SetImit.add(new Random().nextInt(100));
        }

        System.out.println(SetImit.toString());
        System.out.println(SetImit.size());
        System.out.println(SetImit.isEmpty());
        System.out.println(SetImit.add(9999));
        System.out.println(SetImit.contains(9999));
        System.out.println(SetImit.delElementByIndex(0));
        System.out.println(SetImit.getElementByIndex(0));
        System.out.println(SetImit.size());
        System.out.println(SetImit.toString());

    }
}

class SetImit<E> {
    private HashMap<E, Object> map = new HashMap<>();
    private static final Object OBJECT = new Object();

    public boolean add(E num) {
        return map.put(num, OBJECT) == null;
    }

    public boolean delete(E num) {
        return map.remove(num, OBJECT);
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean contains(Object num) {
        return map.containsKey(num);
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    public E getElementByIndex(int index) {
        E[] mapArray = (E[]) map.keySet().toArray();
        return mapArray[index];
    }

    public boolean delElementByIndex(int index) {
        E[] mapArray = (E[]) map.keySet().toArray();
        return map.remove(mapArray[index], OBJECT);
    }

    public String toString() {
        E[] mapArray = (E[]) map.keySet().toArray();
        String a = "";
        for (int n = 0; n < mapArray.length; n++)
            a = a + mapArray[n] + " ";
        return a;
    }
}
