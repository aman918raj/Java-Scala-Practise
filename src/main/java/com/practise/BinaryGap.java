package com.practise;

import scala.collection.mutable.Stack;

public class BinaryGap {

    public static void main(String[] args) {
        int n = 1162;
        BinaryGap bg = new BinaryGap();
        String binaryValue = bg.convertToBinary(n,"").replaceFirst("^0*","");
        System.out.println(binaryValue);
        int binaryGap = bg.findMaxGap(binaryValue);
        System.out.println(binaryGap);
    }

    public String convertToBinary(int n,  String str){
        if(n==1 || n==0)
            return String.valueOf(n) + str;
        int remainder = n % 2;
        int quotent = n / 2;
        str = String.valueOf(remainder) + str;
        return convertToBinary(quotent, str);
    }

    public int findMaxGap(String binaryStr){
        char[] binaryCharArr = binaryStr.toCharArray();
        int cnt = 0;
        int maxCnt = 0;
        boolean flag = false;
        for (int i =1; i < binaryCharArr.length; i++){
            if (binaryCharArr[i] == '0' )
                cnt += 1;
            else
                flag = true;

            if(flag && maxCnt < cnt){
                maxCnt = cnt;
            }

            if(flag)
                cnt=0;
            flag = false;
        }
        return maxCnt;
    }
}
