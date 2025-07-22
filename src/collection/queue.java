package collection;

import java.util.PriorityQueue;

public class queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.add(34);
        list.add(3);
        list.add(341);
        list.add(344);
        list.add(76);
        list.add(12);
        list.add(76);
       list.offer(98);
        System.out.println(list);
        System.out.println(list.poll());// delete lowest value
        System.out.println(list);
        System.out.println(list);

    }
}
