public class Character{
    /* 1) Constructor
     *      - how to make your object
     * 2) Instance Variable
     *      - many properties of a class
     * 3) Setters / Getters
     *      - getting info from class
     *      - setting/giving info to class to change
     * 4) Instance (aka non-static) Method
     *      - method that belongs to this class &&
     *        used on only instances of objects
     */

    // Instance variables
    private String name;
    private String specialMove;
    private double health;

    // Constructor
    public Character(String name_input, String specialMove, double health){
        name = name_input;
        this.specialMove = specialMove;
        this.health = health;
    }

    // Getter
    public String getName(){
        return name;
    }
    public double getHealth(){
        return health;
    }

    // Setter
    public void setName(String newName){
        this.name = newName;
    }

    public double getHit(double hitDamage){
        health -= hitDamage;
        return health;
    }

    public static void main(String[] args){
        int[] arr = new int[10];
        Character Mario = new Character(
                            "Peach",
                            "Locked in a tower",
                            98.6);
        Character Mario2 = new Character(
                            "Locked in a tower",
                            "Peach",
                            98.6);

        System.out.println("Mario's name is " + Mario.getName());
        Mario.setName("Bowser");
        System.out.println("Mario's name is " + Mario.getName());

        System.out.println("Mario's health is " + Mario.getHealth());
        System.out.println("Mario's new health is " + Mario.getHit(10));

        System.out.println("Mario2's health is " + Mario2.getHealth());
    }
}
