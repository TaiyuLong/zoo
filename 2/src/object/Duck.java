package object;

public class Duck extends Bird{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public void getDescribe(){
        System.out.println("第三种生物为禽类，叫做鸭子，");            //默认该生物属于禽类 方便输入名称
        System.out.println("可以人工饲养，会游泳，");
        System.out.println("它年龄为"+super.getAge()+"岁，体长为"+super.getSize()+"厘米。");
        System.out.println("它"+super.getCanfly()+"飞，"+super.getMigratorybird()+"候鸟。");
    }
}
