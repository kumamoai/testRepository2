import java.io.*;


public class Excercise
{
    //3つ以上の数でもできるように

    public static void main( String[] args )throws IOException{

        BufferedReader br = new BufferedReader(
                            new InputStreamReader( System.in ) );
        int x =Integer.parseInt(br.readLine());
        int y =Integer.parseInt(br.readLine());
        int z =Integer.parseInt(br.readLine());
        System.out.println("一番大きいのは"+big(big(x,y),z));

    }
   
    static int big(int n , int m)
    {
        if(n>m){
            return n;
        }else{
            return m;
        }        
    }
}