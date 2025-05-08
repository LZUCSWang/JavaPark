import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void ForTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void EnhanceForTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static void IterTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        // ForTest();
        EnhanceForTest();
    }
}