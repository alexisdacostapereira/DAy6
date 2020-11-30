public abstract class Character implements Movable{
    protected String name;
    protected final String RPGClass;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;

    protected Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
    }

     public String getName() {
        return this.name;
    }

    public String getRPGClass() {
        return this.RPGClass;
    }

    public int getLife() {
        return this.life;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getWit() {
        return this.wit;
    }

    public void attack(String str) throws WeaponException {
        System.out.println(this.getName() + ": Rrrrrrrrr....");
    }

    public void tryToAttack(String weapon){
        try{
            attack(weapon);
        }
        catch(WeaponException e){
            System.out.println(e.getMessage());
        } 
    }

    public void moveRight(){
        System.out.println(this.getName() + ": move right");
    }

    public void moveLeft(){
        System.out.println(this.getName() + ": move left");
    }

    public void moveForward(){
        System.out.println(this.getName() + ": move forward");
    }

    public void moveBack(){
        System.out.println(this.getName() + ": move back");
    }

    public void unsheathe(){
        System.out.println(this.getName() + ": unsheathes his weapon.");
    }


}