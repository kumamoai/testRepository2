import java.io.*;

public class Excercise
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        //int l = 1; //loop
        //int max =0;
        //int min =0;
        //int a =1; //０が入力されたかの判定用
        //int one =0; //一つ目の数
        //int two =1; //二つ目の数
        int[] v =new int[10];

        //int sum =0;
        //double Count =0;
        int sum =0;
        int sum2 =0;
        //int b =0;
        //int f =0;

        for( int i =0  ; i < 10 ; i++ ){
            System.out.print((i+1)+"番目の入力は？＞");
            v[i] = Integer.parseInt( br.readLine());  
            sum += v[i];
            if(sum>=100||i==9){
                for(i =0; i<10;i++){
                    sum2 += v[i];
                }
            }
        }
        System.out.println(sum2);

        
    }
}   