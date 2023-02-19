public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public Slytherin(String name, int magicPower,int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
        @Override
        public String toString(){
            return super.toString() + "\n"
                    + "Хитрость - " + cunning + "\n"
                    + "Решительность - " + determination + "\n"
                    + "Амбициозность - " + ambition + "\n"
                    + "Находчивость - " + resourcefulness + "\n"
                    + "Жажда власти - " + lustForPower + "\n";

        }
    public void compareStudents(Slytherin student){
        int sum = this.ambition + this.lustForPower + this.cunning + this.resourcefulness + this.determination;
        int sum2 = student.ambition + student.lustForPower + student.cunning + student.resourcefulness + student.determination;
        int difference = sum - sum2;
        if (difference > 0){
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName());;
        }
        else if (difference < 0){
            System.out.println(student.getName() + " лучший Слизеринец, чем " + this.getName());;
        }
        else{
            System.out.println("Количество очков судентов равно");
        }
    }
}
