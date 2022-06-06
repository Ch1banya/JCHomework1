public class Course {

    private int[] course = {1, 2, 3, 2}; // Высота препятствий в метрах

    public void doIt(Team team) {
        for (TeamMate mate : team.getTeam()) {
            if (mate.getHeight() >= course[0] && mate.getHeight() >= course[1] && mate.getHeight() >= course[2] &&
                    mate.getHeight() >= course[3]) {
                team.result += mate.name + " успешно прошел испытание" + "\n";
            }
        }
    }
}