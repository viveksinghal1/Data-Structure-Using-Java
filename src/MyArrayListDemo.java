import java.util.*;

public class MyArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(234);
        list.add(10);
        list.add(20);
        System.out.println(list);
        list.add(1,15);
        System.out.println(list);
        list.addAll(list1);
        System.out.println(list);
        Integer[] a = new Integer[8];
        a = list.toArray(a);
        for(Integer i : a){
            System.out.println(i);
        }

        Object list2 = list.clone();
        System.out.println(list2);

        list.replaceAll(b->b+10);
        System.out.println(list);
    }
}