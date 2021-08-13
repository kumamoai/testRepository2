import java.io.*;

public class Excercise
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        //int sum = 0;
        //int loop = 2;
        //int max =0;
        //int min =0;
        int p =0;
        //int sCount =0;
        //int s =0;
        //int b =0;
        //int f =0;
        
        System.out.print("素因数分解したい数字は？＞");
        p = Integer.parseInt(br.readLine());
        
        System.out.print("素数→");

        for(int i =2;p > 1;i++){
            while(p%i==0){
                System.out.print(i +",");
                p /= i;
            }
        }

        //素数判定
        /*
        if(sCount >0){
            System.out.println("結論："+p+"は素数じゃない");
        }else{
            System.out.println("結論："+p+"は素数");
        }
        */
        

        /*
        System.out.println("プレイボール");
        while(s<3&&b<4){
            System.out.print("ストライク=1 or ボール=2 or ファール=3？>");

            p = Integer.parseInt(br.readLine());
            if(p==1){
                s ++;
                System.out.println("ストライク！");
            }else if(p==2){
                b ++;
                System.out.println("ボール！");
            }else if(p==3){
                if(s<2){
                    s ++;
                }
                f ++;
                System.out.println("ファール！");
            }else{
                System.out.println("入力がちがうよ");
            }
        }


        System.out.print("ストライク"+s+"　　ボール"+b+"   ファール"+f);
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