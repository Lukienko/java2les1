public class Woman implements Competitor {
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private boolean active;
    public Woman(String name) {

        this.name = name;
        this.maxRunDistance = 4000;
        this.maxSwimDistance = 15;
        this.active = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return (name + " пробежала");
        } else {
            active = false;
            return (name + " не пробежала");

        }
    }

    @Override
    public String swim(int dist) {
        if (dist <= maxSwimDistance) {
            return (name + " Проплыла");
        } else {
            active = false;
            return (name + " не проплыла");

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