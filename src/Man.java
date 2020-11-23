public class Man implements Competitor {
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private boolean active;

    public Man(String name) {

        this.name = name;
        this.maxRunDistance = 5000;
        this.maxSwimDistance = 20;
        this.active = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return (name + " пробежал");
        } else {
            active = false;
            return (name + " не пробежал");
        }
    }

    @Override
    public String swim(int dist) {
        if (dist <= maxSwimDistance) {
            return (name + " Проплыл");
        } else {
            active = false;
            return (name + " не проплыл");

        }
    }


    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }
}