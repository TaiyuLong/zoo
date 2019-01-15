package object;

class Integral{
    float f;
}

public class Exercise14 {
    public static void main(String[]args){
        Integral n1=new Integral();
        Integral n2=new Integral();
        n1.f=9f;
        n2.f=48f;
        System.out.println("1:n1.f:"+n1.f+" n2.f:"+n2.f);
        n1=n2;
        System.out.println("2:n1.f:"+n1.f+" n2.f:"+n2.f);
        n1.f=27f;
        System.out.println("3:n1.f:"+n1.f+" n2.f:"+n2.f);
    }
}
