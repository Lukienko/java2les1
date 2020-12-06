package Maraphon;
public class Wall extends Barrier {

    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Высота препятствия: " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("Перепрыгнул!");


            return true;
        } else {
            System.out.println("Не смог перепрыгнуть(");



            return false;
        }
    }
}