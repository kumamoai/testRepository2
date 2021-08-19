import java.io.*;

public class Excercise
{
    public static void main( String[] args ) throws IOException
    {
        //BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
 
        //  九九表プログラム

        int kuku[][] = new int[9][9];
        // 配列 kuku に値を代入する
        for( int i = 0 ; i < 9 ; i++ ){
            for( int j = 0 ; j < 9 ; j++ ){
                kuku[i][j]=(i+1)*(j+1);

                System.out.printf("%2d", kuku[i][j]);
                System.out.print(" ");
        
            }
            System.out.println();

        }
    }
}   