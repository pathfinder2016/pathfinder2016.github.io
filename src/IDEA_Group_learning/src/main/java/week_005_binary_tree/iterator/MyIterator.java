package week_005_binary_tree.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyIterator {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.addLast(i);
        }
        for (Integer aLinkedList : linkedList) {
            System.out.print(aLinkedList + "_");
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(i);
        }
        Iterator<Integer> listInterator = list.iterator();

    }
}