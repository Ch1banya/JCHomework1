public class Course {

    private int[] course = {250, 150, 350, 450};

    public void doIt(Team team) {
        double result = 0;
        double totalResult = 0;
        for (int i = 0; i < course.length; i++) {
            for (int j = 0; j < team.getTeam().length; j++) {
                result = course[i] / team.getTeam()[i].getSpeed();
            }
            System.out.println("Результат члена команды по имени " + team.getTeam()[i].getName() + " из команды " + team.getNameTeam() + " это " + result);
            totalResult += result;

        }
        System.out.println("Общий результат " + team.getNameTeam() + " это " + totalResult);
    }
}
