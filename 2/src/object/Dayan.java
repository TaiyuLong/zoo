package object;

public class Dayan extends Bird{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public void getDescribe(){
        System.out.println("第四种生物为禽类，叫做大雁，");            //默认该生物属于禽类 方便输入名称
        System.out.println("多为野生，冬天会向南方迁徙，");
        System.out.println("它年龄为"+super.getAge()+"岁，体长为"+super.getSize()+"厘米。");
        System.out.println("它"+super.getCanfly()+"飞，"+super.getMigratorybird()+"候鸟。");
    }
}
