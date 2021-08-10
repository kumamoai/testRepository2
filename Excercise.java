import java.io.*;

public class Excercise
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        //int sum = 0;
        //int loop = 5;
        //int max =0;
        //int min =0;
        int a =0;
        int s =0;
        int b =0;

        System.out.println("プレイボール");
        while(s<3&&b<4){
            System.out.print("ストライク=1 or ボール=2 ？");

            a = Integer.parseInt(br.readLine());
            if(a==1){
                s += 1;
            }else if(a==2){
                b += 1;
            }else{
                System.out.println("ちがうよ");
            }
        }


        System.out.print("ストライク"+s+"　　ボール"+b);
        //System.out.println(sum);
        /*
        for(int i=1;sum<100;i++){
            
                System.out.print(i+"個目:");
                a = Integer.parseInt(br.readLine());
                sum += a;
                System.out.println(sum);
            }
                System.out.print("おしまいだよ。ここまでの合計は");
                System.out.println(sum);
        */    
        //max=a;
        //min=a;

        
            //System.out.print((i-1)%10);

            
            //b = Integer.parseInt(br.readLine());
            /*

            if(i==1){
                min = b;
                max = b;
            }else{
                if(max<b){
                    max = b;
                }else if (min>b){
                    min = b;
                }
                
            */
            
        
        //System.out.println("最大値は"+max+"です");
        //System.out.println("最小値は"+min+"です");
    }
}   