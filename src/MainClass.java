public class MainClass {

    public static void main(String[] args) {

        Athlete[] groupOne = new Athlete[4];
        groupOne[0] = new Athlete("Stepa",37, 13.5f);
        groupOne[1] = new Athlete("Ola",25, 10.5f);
        groupOne[2] = new Athlete("Toma",33, 12f);
        groupOne[3] = new Athlete("Oleg",27, 14.2f);

        Athlete[] groupTwo = new Athlete[4];
        groupTwo[0] = new Athlete("Gera",30, 10.8f);
        groupTwo[1] = new Athlete("Lena",20, 9.9f);
        groupTwo[2] = new Athlete("Vlad",40, 15.5f);
        groupTwo[3] = new Athlete("Misha",22, 11.5f);


        Team teamOne = new Team(groupOne, "Moon");
        Team teamTwo = new Team(groupTwo, "Mars");



        Course race = new Course();
        race.doit(teamOne);
        race.doit(teamTwo);
    }
}
