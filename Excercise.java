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
        int v[]=new int[10];

        //int sum =0;
        //double Count =0;
        //int s =0;
        //int b =0;
        //int f =0;

        for( int i = 0 ; i < 10 ; i++ ){
            System.out.print("入力は？＞");
            v[i] = Integer.parseInt( br.readLine());  
        }
    

        for( int i = 0 ; i < 10 ; i++ ){
            System.out.println(v[i]+"の２倍は"+v[i] * 2 );
        }
            //for(int i=0)
        
        
        //フィボナッチ数列
        /*
        System.out.println("フィボナッチ数列");
        System.out.print(one+",");
        System.out.print(two+",");

        for(int l = 0;l>=0;l++){
            if(one+two>1000){
                break;
            }else if(l%2==0){
                one =one + two;
                System.out.print(one+",");
            }else{
                two = one + two;
                System.out.print(two+",");
            }    

        }
        */


        
    

        
        /*
        while(a!=0){
            System.out.print("入力は？＞");
            p = Integer.parseInt(br.readLine());
            a = p;
            sum += p;
            Count ++;
        }
        */

        /*
        System.out.println("合計は"+sum);
        System.out.println("平均は"+sum/Count);
        */

        
        /*
        for(int i =2;p > 1;i++){
            while(p%i==0){
                System.out.print(i +",");
                p /= i;
            }
        }
        */

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