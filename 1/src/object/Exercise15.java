package object;

class Value{
    int i;
}

public class Exercise15 {
    public static void main(String[]args){
        Integer n1=new Integer(47);
        Integer n2=new Integer(47);
        System.out.println(n1==n2);
        System.out.println(n1!=n2);
        System.out.println(n1.equals(n2));

        Value v1=new Value();
        Value v2=new Value();
        v1.i=v2.i=47;
        System.out.println(v1.equals(v2));
    }
}
