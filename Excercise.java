import java.io.*;
import java.text.Normalizer.Form;

public class Excercise{
    public static void main( String[] args ){

        int from = 10;
        int to = 20;
        for(int a = (from+1) ; a<= (to+1) ; a++){
            fibnum(a);   
        }

    }

    public static void fibnum (int num){ //フィボナッチ数列のnum項目を返すメソッド

        int one = 0;
        int next = 1;

        for(int i=0;i<100;i++){

            if(i+1==num){
                System.out.println(one);
            }
        
            int nextnext = one + next;      
            one=next;
            next = nextnext;
            
        }
    }
}