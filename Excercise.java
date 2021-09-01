import java.io.*;
import java.text.Normalizer.Form;

class Dog{
    private String Name; //インスタンスフィールド
    private int Age;


    public void SetAge(int ag){
        Age = ag;
    }


    public void SetName(String nm){  //メソッド
        Name = nm;
    } 

    public void ShowProfile(){
        System.out.println("名前は"+Name+"です");
        System.out.println("年齢は"+Age+"です");
    }


}


public class Excercise{
    public static void main( String[] args ){
        Dog dog1 = new Dog(); //インスタンス作成

        dog1.SetName("tubasa");
        dog1.SetAge(30);

        dog1.ShowProfile();
    }
}