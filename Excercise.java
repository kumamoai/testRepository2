import java.io.*;
import java.text.Normalizer.Form;

class Dog{
    private String Name; //インスタンスフィールド
    private int Age;
    private String Kind;

    public Dog(String kd){
        Kind = kd;
    }
    

    public void SetAge(int ag){
        Age = ag;
    }

    public void SetName(String nm){  //メソッド
        Name = nm;
    } 

    public void ShowProfile(){
        System.out.println("名前は"+Name+"です");
        System.out.println("年齢は"+Age+"です");
        System.out.println("種類は"+Kind+"です");
    }
}

public class Excercise{
    public static void main( String[] args ){
        Dog dog1 = new Dog("red"); //インスタンス作成
        Dog dog2 = new Dog("green");

        dog1.SetName("Mario");
        dog1.SetAge(26);
        dog1.ShowProfile();

        dog2.SetName("Luigi");
        dog2.SetAge(24);
        dog2.ShowProfile();
    }


}