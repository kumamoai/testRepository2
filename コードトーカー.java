import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("A～G#を入力してね > ");
      String Root = scanner.next();
      System.out.print("その先を入力してね > ");
      scanner.nextLine();
      String Pattern = scanner.nextLine();
      System.out.println("あなたが入力したのは"+Root+Pattern+"です");

      int RtNum = 0;
      String C = "C";
      String Cs = "C#";
      String D = "D";
      String Ds ="D#";
      String E ="E";
      String F ="F";
      String Fs = "F#";
      String G = "G";
      String Gs = "G#";
      String A = "A";
      String As ="A#";
      String B ="B";

      String m ="m";
      String blank ="";
      String M7 ="M7";
      String seven = "7";
      String m7 ="m7";

      if(Root.equals(C)){
        RtNum=1;
      }else if(Root.equals(Cs)){
        RtNum=2;
      }else if(Root.equals(D)){
        RtNum=3;
      }else if(Root.equals(Ds)){
        RtNum=4;
      }else if(Root.equals(E)){
        RtNum=5;
      }else if(Root.equals(F)){
        RtNum=6;
      }else if(Root.equals(Fs)){
        RtNum=7;
      }else if(Root.equals(G)){
        RtNum=8;
      }else if(Root.equals(Gs)){
        RtNum=9;
      }else if(Root.equals(A)){
        RtNum=10;
      }else if(Root.equals(As)){
        RtNum=11;
      }else if(Root.equals(B)){
        RtNum=12;
      }

      String[] SingleNote = {"ド","ド#","レ","レ#","ミ","ファ","ファ#","ソ","ソ#","ラ","ラ#","シ"};

      if(Pattern.equals(m)){
        System.out.println(Root+Pattern+"の構成音は"+SingleNote[(RtNum-1)%12]+SingleNote[(RtNum+2)%12]+SingleNote[(RtNum+6)%12]+"です");
      }else if(Pattern.equals(blank)){
        System.out.println(Root+Pattern+"の構成音は"+SingleNote[(RtNum-1)%12]+SingleNote[(RtNum+3)%12]+SingleNote[(RtNum+6)%12]+"です");
      }else if(Pattern.equals(seven)){
        System.out.println(Root+Pattern+"の構成音は"+SingleNote[(RtNum-1)%12]+SingleNote[(RtNum+3)%12]+SingleNote[(RtNum+6)%12]+SingleNote[(RtNum+9)%12]+"です");
      }else if(Pattern.equals(M7)){
        System.out.println(Root+Pattern+"の構成音は"+SingleNote[(RtNum-1)%12]+SingleNote[(RtNum+3)%12]+SingleNote[(RtNum+6)%12]+SingleNote[(RtNum+10)%12]+"です");
      }else if(Pattern.equals(m7)){
        System.out.println(Root+Pattern+"の構成音は"+SingleNote[(RtNum-1)%12]+SingleNote[(RtNum+2)%12]+SingleNote[(RtNum+6)%12]+SingleNote[(RtNum+9)%12]+"です");
      }
    }  
}

