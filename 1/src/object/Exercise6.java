package object;

public class Exercise6 {
    String s="Hello,world!";
    int storage(String s){
        return s.length()*2;
    }
    void print(){
        System.out.println("storage(s)="+storage(s));
    }
    public static void main(String[]args){
        Exercise6 a=new Exercise6();
        a.print();
    }
}

