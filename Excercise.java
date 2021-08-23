import java.io.*;
import java.util.Scanner;

public class Excercise
{
    //3つ以上の数でもできるように

    public static void main( String[] args )throws IOException{

       
        
        Scanner scan = new Scanner(System.in);

        System.out.print("数字を入力してください＞");
        int suji = scan.nextInt();
        System.out.print("文字を入力してください＞");
        String moji = scan.next();

 //       int z =Integer.parseInt(br.readLine());
//     triangle(10,"P");
  //      triangle(25,"★");
        triangle(suji,moji);


    }
   
    static void triangle(int n,String s){
        for(int t=0;t<=n;t++){
            for(int y=0;y<t;y++){
                System.out.print(s);
                
            }
            System.out.println("");   
            
        }
    }
}