import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int breakNum = 0;
        int breakCost = 0;
        int[] profitArray = null;
        int profitSum = 0;
        int initialProfit = 0;
        int maxEndingHere = 0;
        int maxSoFar = 0;
        
        breakNum = scan.nextInt();
        breakCost = scan.nextInt();

        profitArray = new int[breakNum];

        for (int i = 0; i < breakNum; i++) {
            profitArray[i] = scan.nextInt() - breakCost;
        }
        /* You're too slow!
        for (int i = 0; i < profitArray.length; i++) {
            initialProfit = 0;
            for (int j = i; j < profitArray.length; j++) {
                initialProfit += profitArray[j];
                if (initialProfit > profitSum) {
                    profitSum = initialProfit;
                }
            }
        }
         */
        maxEndingHere = profitArray[0];
        maxSoFar = profitArray[0];
        for (int i = 0; i < profitArray.length; i++) {
            maxEndingHere=maxEndingHere+profitArray[i];
            if(profitArray[i]>maxEndingHere)
            {
                maxEndingHere = profitArray[i];
            }
            if(maxSoFar < maxEndingHere){
                maxSoFar = maxEndingHere;
            }           
        }
        profitSum = maxSoFar;

        System.out.println(profitSum);
    }

}
