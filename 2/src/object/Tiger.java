package object;

public class Tiger extends Animal{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public void getDescribe(){
        System.out.println("第二种生物为动物类，叫做老虎，");           //默认该生物属于动物 方便输入名称
        System.out.println("丛林之王，性格暴躁，");
        System.out.println("它年龄为"+super.getAge()+"岁，体长为"+super.getSize()+"厘米。");
        System.out.println("它有"+super.getLegNumber()+"条腿，"+super.getEyesNumber()+"只眼睛"+super.getEarsNumber()+"只耳朵。");
    }
}
