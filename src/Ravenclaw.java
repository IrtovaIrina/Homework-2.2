public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }


    public Ravenclaw(String name, int magicPower,int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(name,magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }
        @Override
        public String toString(){
            return super.toString() + "\n"
                    + "Ум - " + mind + "\n"
                    + "Мудрость - " + wisdom + "\n"
                    + "Остроумие - " + wit + "\n"
                    + "Творчество - " + creation + "\n" ;

        }
    public void compareStudents(Ravenclaw student){
        int sum = this.creation + this.mind + this.wit + this.wisdom;
        int sum2 = student.creation + student.mind + student.wit + student.wisdom;
        int difference = sum - sum2;
        if (difference > 0){
            System.out.println(this.getName() + " лучший Когтевранец, чем " + student.getName());;
        }
        else if (difference < 0){
            System.out.println(student.getName() + " лучший Когтевранец, чем " + this.getName());;
        }
        else{
            System.out.println("Количество очков судентов равно");
        }
    }
}

