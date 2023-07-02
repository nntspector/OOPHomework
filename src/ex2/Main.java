package ex2;



public class Main {
    public static void main(String[] args) {
        // Создаем участников
        Human human = new Human("John", 2, 10);
        Cat cat = new Cat("Tom", 3, 15);
        Robot robot = new Robot("Robo", 5, 20);

        // Создаем препятствия
        Obstacle[] obstacles = {
                new Wall(3),
                new Track(12),
                new Wall(4),
                new Track(10),
                new Wall(2)
        };

        for (Obstacle obstacle : obstacles) {
            if (!human.passObstacle(obstacle)) {
                break;
            }
            if (!cat.passObstacle(obstacle)) {
                break;
            }
            if (!robot.passObstacle(obstacle)) {
                break;
            }
        }
    }
}
