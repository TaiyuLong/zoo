package object;

public class Organ {
    private int size;
    private int age;

    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void getDescribe(){
        System.out.println("它年龄为"+age+"岁，体长为"+size+"厘米。");
    }
}
