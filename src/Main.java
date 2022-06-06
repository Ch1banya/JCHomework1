public class Main {
    public static void main(String[] args) {



        TeamMate[] coop = new TeamMate[4];
        coop[0] = new TeamMate ("Катя", 24, 5);
        coop[1] = new TeamMate ("Саша", 32, 13);
        coop[2] = new TeamMate ("Марта", 21, 15);
        coop[3] = new TeamMate ("Вова", 24, 7);

        Team team = new Team(coop, "Друзья");


        Course run = new Course();
        run.doIt(team);

    }
}
