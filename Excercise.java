import java.io.*;


public class Excercise
{
    
    public static void main( String[] args )throws IOException{
        //System.out.println( "3の2乗=" + pow2( 3 ) );
        //System.out.println("平均は"+ ave(3,15));
        System.out.println("大きいほうは"+big(23,32));

    }
   
    static int big(int x , int y)
    {
        if(x>y){
            return x;
        }else{
            return y;
        }        
    }
}