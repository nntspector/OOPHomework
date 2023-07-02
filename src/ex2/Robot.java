package ex2;

public class Robot {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public boolean passObstacle(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            return jump(((Wall) obstacle).getHeight());
        } else if (obstacle instanceof Track) {
            return run(((Track) obstacle).getDistance());
        }
        return false;
    }

    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал дистанцию " + distance + " метров.");
            return true;
        } else {
            System.out.println(name + " не смог пробежать дистанцию " + distance + " метров.");
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул через стену высотой " + height + " метров.");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть через стену высотой " + height + " метров.");
            return false;
        }
    }
}

