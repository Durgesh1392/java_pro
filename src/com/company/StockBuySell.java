package com.company;

import java.util.ArrayList;

class Interval {
    int buy, sell ;
}
public class StockBuySell {

    public static void stockBuySell(int[] price, int n)
    {
        if(n ==1){
            return;
        }
        int i = 0;
        int count = 0;
        ArrayList<Interval> sol = new ArrayList<>();
        while(i < n-1)
        {
            // to find local minima
            while(i < n-1 && price[i+1] < price[i])
            {
                i++;
            }
            if (i == n - 1)
                break;

            Interval e = new Interval();
            e.buy = i++;
            // to find local maxima
            while(i < n-1 && price[i-1] < price[i])
            {
                i++;
            }
            e.sell = i-1;
            sol.add(e);
            count++;
        }
        if( count == 0){
            System.out.println("no stock to buy");
        }
        else {
            for (int j = 0; j < count; j++)
                System.out.println("Buy on day: " + sol.get(j).buy
                        + "        "
                        + "Sell on day : " + sol.get(j).sell);

            return;

        }
    }
    public static void main(String[] args) {
        StockBuySell stock = new StockBuySell();

        // stock prices on consecutive days
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;

        // fucntion call
        stock.stockBuySell(price, n);

    }
}
