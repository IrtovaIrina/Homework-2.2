public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public Hufflepuff( String name,int magicPower,int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
        @Override
        public String toString(){
            return super.toString() + "\n"
                    + "Трудолюбие - " + industriousness + "\n"
                    + "Верность - " + loyalty + "\n"
                    + "Честность - " + honesty + "\n";

        }
    public void compareStudents(Hufflepuff student){
        int sum = this.loyalty + this.industriousness + this.honesty;
        int sum2 = student.loyalty + student.industriousness + student.honesty;
        int difference = sum - sum2;
        if (difference > 0){
            System.out.println(this.getName() + " лучший Пуфиндуец, чем " + student.getName());
        }
        else if (difference < 0){
            System.out.println(student.getName() + " лучший Пуфиндуец, чем " + this.getName());;
        }
        else{
            System.out.println("Количество очков судентов равно");
        }
    }
}

