package com.tw1hupup.lc647;

public class LC647 {

    public int countSubstrings(String s){

        int count = 0 ;

        if(s==null||s.length()==0){
            return count;
        }

        for(int i=0;i<s.length();i++){

            count+=countSubstrings(s,i,i);
            count+=countSubstrings(s,i,i+1);
        }
        return count;
    }

    public int countSubstrings(String s,int leftCenter,int rightCenter){

        int count = 0 ;
        while (leftCenter>=0 && rightCenter<s.length() && s.charAt(leftCenter)==s.charAt(rightCenter)){

            count++;
            rightCenter++;
            leftCenter--;

        }
        return count;

    }

}
