public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри",24,24,26,7,8);
        Gryffindor hermioneGranger = new Gryffindor("Гермеона",97,2,1,2,3);
        Gryffindor ronWeasley = new Gryffindor("Рон",45,34,8,9,9);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария",3,7,36,97,24);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик",7,7,8,12,24);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин" ,55,32,77,8,5);
        Ravenclaw zhouChang = new Ravenclaw("Джоу",4,5,57,6,87,7);
        Ravenclaw padmaPatil = new Ravenclaw("Падма",5,67,9,32,56,7);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус",5,67,9,23,6,8);
        Slytherin dracoMalfoy = new Slytherin("Драко",5,6,34,7,98,8,5);
        Slytherin grahamMontagrew = new Slytherin("Грэхэм",4,6,8,2,8,1,5);
        Slytherin gregoryGoil = new Slytherin("Грегори",5,7,3,7,9,1,7);
        System.out.println(harryPotter.toString());
        hermioneGranger.compareStudents(harryPotter);
    }
}