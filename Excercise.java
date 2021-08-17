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
        //int s =0;
        //int b =0;
        //int f =0;

        for( int i =0  ; i < 10 ; i++ ){
            System.out.print((i+1)+"番目の入力は？＞");
            v[i] = Integer.parseInt( br.readLine());  
        }
    

        System.out.print("偶数:");
        for( int i = 0 ; i < 10 ; i++ ){
            
            if(v[i]%2==0){
                System.out.print(v[i]+" ");
            }else{
            }
        }

        System.out.println();
        System.out.print("奇数:");
        for( int i = 0 ; i < 10 ; i++ ){
            
            if(v[i]%2!=0){
                System.out.print(v[i]+" ");
            }else{
            }
        }
        
    }
}   