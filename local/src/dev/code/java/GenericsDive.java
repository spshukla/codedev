package dev.code.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by shreeprakash on 12/18/15.
 */
public class GenericsDive {
    public static void main(String args[]) {
        scenario1();
        scenario2();
        genericArrays();
    }

    public static void scenario2() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        Integer[] integers = new Integer[arrayList.size()];
        arrayList.toArray(integers);
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
        Integer[] integers1 = new Integer[arrayList.size()];
        System.arraycopy(integers, 0, integers1, 0, arrayList.size());
        for (int i = 0; i < integers1.length; i++) {
            System.out.println(integers1[i]);
        }
    }

    public static void scenario1() {
        Set<String> setObj = new HashSet<>();
        setObj.add("12");
        setObj.add("13");
        // Preferred way to use instanceof
        if (setObj instanceof Set<?>) {
            System.out.println(setObj.iterator().next());
        }
        // It is also valid
        if (setObj instanceof Set) {
            System.out.println(setObj.iterator().next());
        }
    }

    public static <E> void genericArrays() {
        List list = new ArrayList<>();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        E[] toArray = (E[]) list.toArray();
        for (E e : toArray) {
            System.out.println(e.toString());
        }

        Object[] toArray1 = list.toArray();
        for (Object object : toArray1) {
            System.out.println(object.toString());
        }
    }


}
