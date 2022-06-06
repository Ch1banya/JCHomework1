public class TeamMate {
    private final float height;
    String name;
    int age;
    double speed;

    public TeamMate(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void printInfo() {
        System.out.println(name + " " + age + " " + speed);
    }
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}

