package com.practise;

public class FrogJmp {

    public static void main(String[] args) {
        int X = 4;
        int Y = 30;
        int D = 1;
        int cnt;
        int diff =  (Y - X) ;
        if((diff % D) == 0)
            cnt = diff / D;
        else{
            cnt = (diff / D) + 1;
        }
        System.out.println(cnt);
    }
}
