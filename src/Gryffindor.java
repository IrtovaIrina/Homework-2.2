public class Gryffindor extends Hogwarts {
    private  int nobility;
    private int honor;
    private int bravery;

    public Gryffindor( String name,int magicPower,int transgressionDistance,int nobility, int honor, int bravery){
        super(name,magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery ;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"
                + "Благородство - " + honor + "\n"
                + "Честь - " + nobility + "\n"
                + "Храбрость - " + bravery + "\n";

    }
    public void compareStudents(Gryffindor student){
        int sum = this.bravery + this.honor + this.nobility ;
        int sum2 = student.bravery + student.honor + student.nobility;
        int difference = sum - sum2;
        if (difference > 0){
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student.getName());
        }
        else if (difference < 0){
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
        else{
            System.out.println("Количество очков судентов равно");
        }
    }
}
