package Tasks;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task5 {
    public static void main(String[] args) {
        String s="";
        try{
            int cnt=0;
            double least=Double.MAX_VALUE;
            double high=Double.MIN_VALUE;
            double Sum=0;

            BufferedReader b=new BufferedReader(new FileReader("Given file.csv"));
            while((s=b.readLine())!=null){
                String T[]=s.split(",");
                double money=Double.parseDouble(T[3]);
                Sum+=money;
                if(money>high){
                    Sum=high;
                }
                if(money<least){
                    Sum=least;
                }
                cnt++;
            }
            System.out.println("Total number of Transactions (bills) : "+cnt);
            System.out.println("Total Bill amount  : "+Sum);
            System.out.println("Maximum Bill amount : "+high);
            System.out.println("Minimum Bill amount : "+least);
        }
        catch (Exception e){
            System.out.println("Run time Error");
        }
    }
}
