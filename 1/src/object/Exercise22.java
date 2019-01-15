package object;

class Rock2{
    Rock2(int i){
        System.out.print("Rock"+i+" ");
    }

}
public class Exercise22 {
    public static void main(String[]args){
        for(int i=0;i<10;i++){
            new Rock2(i);
        }
    }
}
