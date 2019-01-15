package object;

class Rock{
    Rock(){
        System.out.print("Rock ");
    }
}

public class Exercise21 {
    public static void main(String[]args){
        for(int i=0;i<10;i++){
            new Rock();
        }
    }
}
