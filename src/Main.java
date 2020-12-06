public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross(80),  new Water(100));
        Team team = new Team("Our command", new Man("Maxim"), new Woman("Anna"));
        c.doIt(team);
        team.showResults();
    }
}