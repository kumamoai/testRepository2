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


        for(int dan=1;dan<10;dan++){
            kuku(dan);
        }
    }
static void kuku(int kari){
    for(int kake=1;kake<10;kake++){
        System.out.printf("%2d",kari*kake);
        System.out.print(","); 
    }
System.out.println("");
            
    }
}