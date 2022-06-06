public class TeamMate {
    private final float height;
    String name;
    int age;


    public TeamMate(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void printInfo() {
        System.out.println(name + " " + age + " " + height);
    }
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}

