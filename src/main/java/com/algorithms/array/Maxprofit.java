public class Maxprofit{
public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int i=0;
        int valley = 0;
        
        while(i<prices.length-1){
            while(i<prices.length-1 && prices[i] >= prices[i+1]){
                i++;//no valley so increment
            }
            
            if(i < prices.length-1){
                valley = prices[i++];
                while(i<prices.length-1 && prices[i] < prices[i+1]){
                    i++;
                }
                maxprofit += prices[i++]-valley;
            }else{
                break;
            }
        }
        
        return maxprofit;
    }

}
