public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;
    public Hogwarts(String name, int magicPower, int transgressionDistance){
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    @Override
    public String toString(){
        return "Имя - " + name +"\n"
                + "Сила магии - " + magicPower +"\n"
                + "Pасстояние трансгрессирования " + transgressionDistance;
    }
    public void compareTwoStudents(Hogwarts firstStudent, Hogwarts secondStudent){
        int sum = firstStudent.magicPower + firstStudent.transgressionDistance;
        int sum2 = secondStudent.magicPower + secondStudent.transgressionDistance;
        int difference = sum - sum2;
        if (difference > 0){
            System.out.println(firstStudent.getName() + " обладает бОльшей мощностью магии, чем " + secondStudent.getName());
        }
        else if (difference < 0){
            System.out.println(secondStudent.getName() + " обладает бОльшей мощностью магии, чем " + firstStudent.getName());
        }
        else{
            System.out.println("Количество очков судентов равно");
        }
    }

}
