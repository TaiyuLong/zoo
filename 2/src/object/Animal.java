package object;

public class Animal extends Organ {
    private int legNumber;
    private int eyesNumber;
    private int earsNumber;

    public int getLegNumber(){
        return legNumber;
    }
    public void setLegNumber(int legNumber){
        this.legNumber=legNumber;
    }

    public int getEyesNumber(){
        return eyesNumber;
    }
    public void setEyesNumber(int eyesNumber){
        this.eyesNumber=eyesNumber;
    }

    public int getEarsNumber(){
        return earsNumber;
    }
    public void setEarsNumber(int earsNumber){
        this.earsNumber=earsNumber;
    }

    public void getDescribe(){
        System.out.println("它年龄为"+super.getAge()+"岁，体长为"+super.getSize()+"厘米。");
        System.out.println("它有"+legNumber+"条腿，"+eyesNumber+"只眼睛"+earsNumber+"只耳朵。");
    }
}
