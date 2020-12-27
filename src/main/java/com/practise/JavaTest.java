package com.practise;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaTest {

    public static void main(String[] args) {
        List<Integer> tickets = new ArrayList<Integer>();
        tickets.add(2);
        tickets.add(3);
        tickets.add(2);
        tickets.add(13);
        tickets.add(4);

        Collections.sort(tickets);
        int ret = 0;
        int count = 1;

        for (int i = 1; i < tickets.size(); i++){
            if(tickets.get(i-1).equals(tickets.get(i)) || tickets.get(i-1).equals(tickets.get(i)-1)){
                System.out.println(tickets.get(i-1)+".."+tickets.get(i));
                count++;}
            else
                count=1;
        }

    }
}
