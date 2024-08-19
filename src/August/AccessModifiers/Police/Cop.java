package August.AccessModifiers.Police;

public class Cop {
    public int gun;
    private String idCard;

    public Cop(int gun){
        this.gun = gun;
    }

    public void canIShoot(){
        System.out.println("Yes, You can shoot!!");
    }

    //Protected = Default, both are, if we don't anything,it will be considered as default

}
