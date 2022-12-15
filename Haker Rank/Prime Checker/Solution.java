import java.io.*;


import static java.lang.System.in;

public class Solution {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4);
            ob.checkPrime(n1,n2,n3,n4,n5);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
class Prime{
    public void checkPrime(int... numbers){
        for(int num : numbers){
            if(isPrime(num)){
                System.out.print(num + " ");
            }
        }
        System.out.println("");        
    }

    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        if(num == 2 || num == 3 || num ==5){
            return true;
        }
        if(num%2 == 0 || num%3 == 0 || num%5 ==0){
            return false;
        }

        return true;
    }
}
