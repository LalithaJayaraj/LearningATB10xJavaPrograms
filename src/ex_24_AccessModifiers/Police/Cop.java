package ex_24_AccessModifiers.Police;

public class Cop {
    String name;
    String iCard;
    int bullet;

    public Cop(int bulletc){
        this.bullet=bulletc;
    }
    protected void shootAccess(){
        System.out.println("Yes you can shoot");
    }

}
