package object;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
          Scanner input=new Scanner(System.in);

        Animal animal=new Cat();
        System.out.println("请输入猫的年龄：");
        animal.setAge(input.nextInt());
        System.out.println("请输入猫的身长：");
        animal.setSize(input.nextInt());
        System.out.println("请输入猫的腿数：");
        animal.setLegNumber(input.nextInt());
        System.out.println("请输入猫的眼睛数：");
        animal.setEyesNumber(input.nextInt());
        System.out.println("请输入猫的耳朵数：");
        animal.setEarsNumber(input.nextInt());

        Animal tiger=new Tiger();
        System.out.println("请输入老虎的年龄：");
        tiger.setAge(input.nextInt());
        System.out.println("请输入老虎的身长：");
        tiger.setSize(input.nextInt());
        System.out.println("请输入老虎的腿数：");
        tiger.setLegNumber(input.nextInt());
        System.out.println("请输入老虎的眼睛数：");
        tiger.setEyesNumber(input.nextInt());
        System.out.println("请输入老虎的耳朵数：");
        tiger.setEarsNumber(input.nextInt());

        Bird duck=new Duck();
        System.out.println("请输入鸭子的年龄：");
        duck.setAge(input.nextInt());
        System.out.println("请输入鸭子的身长：");
        duck.setSize(input.nextInt());
        System.out.println("请输入鸭子是否能飞：");
        duck.setCanfly(input.next());
        System.out.println("请输入鸭子是否为候鸟：");
        duck.setMigratorybird(input.next());

        Bird dayan=new Dayan();
        System.out.println("请输入大雁的年龄：");
        dayan.setAge(input.nextInt());
        System.out.println("请输入大雁的身长：");
        dayan.setSize(input.nextInt());
        System.out.println("请输入大雁是否能飞：");
        dayan.setCanfly(input.next());
        System.out.println("请输入大雁是否为候鸟：");
        dayan.setMigratorybird(input.next());

        animal.getDescribe();
        tiger.getDescribe();
        duck.getDescribe();
        dayan.getDescribe();

    }
}
