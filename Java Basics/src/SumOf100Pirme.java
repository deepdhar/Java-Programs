public class SumOf100Pirme {
	final static double MAX = 10000 ;   
    static boolean prime[] = new boolean [(int) (MAX + 1.0)] ;  
    static void SieveOfEratosthenes()  
    {  
        for(int i = 0; i <= MAX; i++) 
            prime[i] = true ; 
          
        prime[1] = false;  
        
        for (int p = 2; p * p <= MAX; p++) {  
            if (prime[p] == true) {   
                for (int i = p * 2; i <= MAX; i += p)  
                    prime[i] = false;  
            }  
        }  
    }     
    static int solve(int n)  
    {  
        int count = 0, num = 1;  
        long sum = 0;  
        
        while (count < n) {   
            if (prime[num]) {  
                sum += num;  
                count++;  
            }  
            num++;  
        }  
        return (int) sum;  
    }  
 
    public static void main(String args[]) 
    { 
        SieveOfEratosthenes();  
        int n = 100;  
        System.out.println("Sum of 1st 100 prime numbers are: " + solve(n));            
    } 
}
