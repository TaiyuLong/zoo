package object;

public class Cat extends Animal{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public void getDescribe(){
        System.out.println("第一种生物为动物类，叫做猫，");
        System.out.println("擅长抓老鼠，性格温顺，");
        System.out.println("它年龄为"+super.getAge()+"岁，体长为"+super.getSize()+"厘米。");
        System.out.println("它有"+super.getLegNumber()+"条腿，"+super.getEyesNumber()+"只眼睛"+super.getEarsNumber()+"只耳朵。");
    }
}
