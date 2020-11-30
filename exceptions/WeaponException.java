public class WeaponException extends Exception{
    private String message = "";

    public WeaponException (String name) {
        super (name + ": I refuse to fight with my bare hands.");
    }

    public WeaponException(String name, String RPGClass, String weapon){
        super();
        if (RPGClass.equals("Warrior")){
            this.message = name + ": A " + weapon + "?? What should I do with this?!";
        }
        else if (RPGClass.equals("Mage")){
            this.message = name + ": I don't need this stupid " + weapon + "! Don't misjudge my powers!";
        }
    }

    public String getMessage(){
        if (this.message.isEmpty()){
            return super.getMessage();
        }
        else
            return this.message;
    }
}
