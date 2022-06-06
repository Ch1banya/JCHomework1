public class TeamMate {
    String name;
    int age;
    double speed;

    public TeamMate(String name, int age, float speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public void printInfo() {
        System.out.println(name + " " + age + " " + speed);
    }
    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }
}

