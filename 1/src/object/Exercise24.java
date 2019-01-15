package object;

public class Exercise24 {
    String s1="Initialized at definition";
    String s2;
    public Exercise24(String s2i){
        s2=s2i;
    }
    public static void main(String[]args){
        Exercise24 si=new Exercise24("Initialized at construction");
        System.out.println("si.s1="+si.s1);
        System.out.println("si.s2="+si.s2);
    }
}
