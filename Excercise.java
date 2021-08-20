import java.io.*;


public class Excercise
{
    
    public static void main( String[] args )throws IOException{
        //System.out.println( "3の2乗=" + pow2( 3 ) );

        System.out.println("平均は"+ ave(3,15));
    }
   
    static int ave(int n , int m)
    {
        return (n + m) /2;
    }
}