package object;

public class Bird extends Organ {
    private String canfly;
    private String migratorybird;

    public String getCanfly(){
        return canfly;
    }
    public void setCanfly(String canfly) {
        this.canfly = canfly;
    }

    public String getMigratorybird(){
        return migratorybird;
    }

    public void setMigratorybird(String migratorybird) {
        this.migratorybird = migratorybird;
    }

    public void getDescribe(){
        System.out.println("它年龄为"+super.getAge()+"岁，体长为"+super.getSize()+"厘米。");
        System.out.println("它"+canfly+"飞，"+migratorybird+"候鸟。");
    }
}
