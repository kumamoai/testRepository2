import java.io.*;
import java.util.Scanner;

public class Excercise
{
    public static void main( String[] args )throws IOException{      
        
        //Scanner scan = new Scanner(System.in);

        //System.out.print("何の段？＞");
        //int dan = scan.nextInt();
        //System.out.print("文字を入力してください＞");
        //String moji = scan.next();

        //int z =Integer.parseInt(br.readLine());
        //triangle(10,"P");
        //triangle(25,"★");


        /*
        for(int dan=1;dan<10;dan++){
            kuku(dan);
        }
        */

        //sosu(6);
        System.out.println("test");
        
        for(int a =4;a<10;a++){
            sosu(a);
        }
        
        
    }
    static void sosu(int kari){
        /*
        int p =0;
        System.out.print("素数判定したい数字は？＞");
        p = Integer.parseInt(br.readLine());
        */
    
        int i = 2;
        while( i < 10000){
            if(kari==i){
                System.out.println(i);
                i++;
            /*
            }else if(kari%i!=0){ //割り切れなかったら
                i++;
            */
            }else if(kari%i==0){ //割り切れたら
                i++;
                continue;
            }
        
        }
        
    }
}