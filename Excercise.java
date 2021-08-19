import java.io.*;

public class Excercise
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
 
        //ソートプログラム

        int temp =0;
        int loop =0;
        int sort[] = new int[10]; 


        //とりあえず配列に10個数値を入れる
        for(int i=0;i<10;i++){
            System.out.print("入力"+(i+1)+"は");
            sort[i]=Integer.parseInt(br.readLine());
        }

        //表示
        System.out.print("ソート前>");
        for(int i=0;i<10;i++){
            System.out.print(sort[i]+",");
        }
      
        for(int b=0;b<10;b++){        
            for(int a=1;a<10;a++){
                //入れ替え
                if(sort[a]<sort[a-1]){
                    temp = sort[a];
                    sort[a]=sort[a-1];
                    sort[a-1]=temp;

                    //表示
                    System.out.println();
                    System.out.print(loop+"ソート>");
                    for(int i=0;i<10;i++){
                    System.out.print(sort[i]+",");
                    }
                    
                    loop ++;
            
                }
            }
        }

        //表示
        System.out.println();
        System.out.print("ソート完了>");
        for(int i=0;i<10;i++){
            System.out.print(sort[i]+",");
        }
    }
}   