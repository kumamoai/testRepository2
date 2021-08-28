import java.io.*;

public class Excercise{
    public static void main( String[] args ){
        System.out.println("test");

        for(int a =10000;a=10100;a++){

            if(judge(a)){
                System.out.println(a);
            }    

        }
    }

    static boolean judge(int num){ //審議判定

        for(int i =2;i<num;i++){ //numを追いかける
            if((num%i)==0){ //割り切れたら
                return false; //falseを出力する
            }   
        } //割り切れなかったらループから出て、
        return true; //trueを出力して、メソッド終わり
    }
}