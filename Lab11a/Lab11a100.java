import java.util.*;

public class Lab11a100 {
    public static void main(String[] args){
        boolean [] num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound ===> ");
        final int MAX = input.nextInt();
        boolean primes[] = new boolean[MAX+1];
        primes = computePrimes(primes);
        displayPrimes(primes,MAX);
    }
    public static boolean[] computePrimes(boolean primes[]){
        for(int i=2;i*i<=primes.length-1;i++){
            //System.out.print(primes[i]+"i");
            if(!primes[i]){
                for(int j=i*i;j<=primes.length-1;j+=i){
                    primes[j]=true;
                    //System.out.print(primes[j]+"j");
                }   
            }
        }
        return primes;
    }
    public static void displayPrimes(boolean primes[],int max){
        String format="%0"+String.valueOf(max).length()+"d";
        int count = 0;
        for(int i=2;i<primes.length-1;i++){
            if(!primes[i]){
                System.out.format(format,i);
                System.out.print(" ");
                count++;
                if(count%15==0){System.out.print("\n");}
            }
        }
    }
}
