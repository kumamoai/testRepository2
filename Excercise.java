import java.io.*;

public class Excercise
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
 
        //  九九表プログラム
        int a=0;
        int b=0;

        System.out.print("入力１＞");
        a = Integer.parseInt( br.readLine() );
        System.out.print("入力２＞");
        b = Integer.parseInt( br.readLine() );

        int kuku[][] = new int[9][9];
        // 配列 kuku に値を代入する
        for( int i = 0 ; i < 9 ; i++ ){
            for( int j = 0 ; j < 9 ; j++ ){
                kuku[i][j]=(i+1)*(j+1);

                //System.out.printf("%2d", kuku[i][j]);
                //System.out.print(" ");        
            }
            //System.out.println();
        }
        System.out.println(kuku[a-1][b-1]);
    }
}   