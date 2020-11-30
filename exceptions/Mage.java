public class Mage extends Character{
    public Mage(String name) {
        super(name, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(this.getName() + ": May the gods be with me.");
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
        else if(str.equals("magic") || str.equals("wand")){
            super.attack(str);
            System.out.println(this.getName() + ": Feel the power of my " + str + "!");
        }
        else{
            throw new WeaponException(name, RPGClass, str);
        }  
    }

    
    @Override
    public void moveRight(){
        System.out.println(this.getName() + ": move right furtively.");
    }
    @Override
    public void moveLeft(){
        System.out.println(this.getName() + ": move left furtively.");
    }
    @Override
    public void moveForward(){
        System.out.println(this.getName() + ": move forward furtively.");
    }
    @Override
    public void moveBack(){
        System.out.println(this.getName() + ": move back furtively.");
    }
}
