// We are given an infinite supply of coin [1,2,5,10,20,50,100,500].
// Find min no. of coins/notes to make change for a value Value.

import java.util.*;
public class IndianCoin {
    public static void main(String[] args) {
        
        Integer coin[] = {1,2,5,10,20,50,100,500};
        Arrays.sort(coin, Comparator.reverseOrder());

        int Value = 121;
        int count = 0;

        ArrayList <Integer> list = new ArrayList<>();
    
        for(int i = 0; i<coin.length; i++){
            if(coin[i] <= Value){
                while(coin[i] <= Value){
                    Value -= coin[i];
                    list.add(coin[i]);
                    count++;
                }
            }
        }
        System.out.println("total (min) coins used : "+ count);
        System.out.println(list);
    }
}
