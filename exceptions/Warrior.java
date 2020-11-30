public class Warrior extends Character{
    public Warrior(String name) {
        super(name, "Warrior");
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(this.getName() + ": My name will go down in history.");
    }

    public void tryToAttack(String weapon){
        try{
            attack(weapon);
        }
        catch(WeaponException e){
            System.out.println(e.getMessage());
        } 
    }


    @Override
    public void attack (String str) throws WeaponException {
        if (str.equals(""))
            throw new WeaponException(name);
        else if(str.equals("hammer") || str.equals("sword")){
            super.attack(str);
            System.out.println(this.getName() + ": I'll crush you with my " + str + "!");
        }
        else{
            throw new WeaponException(name, RPGClass, str);
        }  
    }
    @Override
    public void moveRight(){
        System.out.println(this.getName() + ": move right like a bad boy.");
    }
    @Override
    public void moveLeft(){
        System.out.println(this.getName() + ": move left like a bad boy.");
    }
    @Override
    public void moveForward(){
        System.out.println(this.getName() + ": move forward like a bad boy.");
    }
    @Override
    public void moveBack(){
        System.out.println(this.getName() + ": move back like a bad boy.");
    }
}
