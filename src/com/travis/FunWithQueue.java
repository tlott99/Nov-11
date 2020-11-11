package com.travis;

import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FunWithQueue implements IFunWithQueue {


    @Override
    public void initializeQueue() {
        Queue<Integer> numbers = new LinkedList<Integer>();
        numbers.add(5);
        numbers.add(35);
        numbers.add(100);
        numbers.add(4);
        numbers.add(42);
        numbers.add(11);
        System.out.println(numbers);
        iterateQueue(numbers);

    }

    @Override
    public void iterateQueue(Queue<Integer> numbers) {
        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
