import java.util.*;

public class Transaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the transaction array:");
        int n = sc.nextInt();
        
        System.out.println("Enter the values of the transaction array:");
        int[] transactions = new int[n];
        for (int i = 0; i < n; i++)
            transactions[i] = sc.nextInt();
        
        System.out.println("Enter the total number of targets to be achieved:");
        int t = sc.nextInt();
        
        while(t-->0) {
            System.out.println("Enter the value of the target:");
            int target = sc.nextInt();
            
            int sum = 0;
            int count = 0;
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                sum += transactions[i];
                count++;
                
                if (sum >= target) {
                    flag = true;
                    break;
                }
            }
            
            if (flag) 
                System.out.println("Target achieved after " + count + " transactions");
             else 
                System.out.println("Given target is not achieved");
        }
        
        sc.close();
    }
}
