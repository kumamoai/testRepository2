import java.io.*;

public class Excercise
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
 
        //入力された数値を 16 桁の２進数で表示するプログラム


        System.out.println("10進数をどうぞ");        
        int value = Integer.parseInt( br.readLine() );
        int binary[] = new int[16];

        // 配列 binaryに0か1を代入する
        for( int i = 0 ; i < 16 ; i++ ){
            binary[i]=value%2;
            value /= 2;
        }
        
        System.out.println("2進数にするよ");
        for( int i = 15 ; i >= 0 ; i-- ){
            System.out.print( binary[i] );
        }
        

        
    }
}   