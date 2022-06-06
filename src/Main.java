public class Main {
    public static void main(String[] args) {



        TeamMate[] coop = new TeamMate[4];
        coop[0] = new TeamMate ("Катя", 24, 1); // Имя+возраст+максимальная высота прыжка
        coop[1] = new TeamMate ("Саша", 32, 4);
        coop[2] = new TeamMate ("Марта", 21, 3);
        coop[3] = new TeamMate ("Вова", 24, 2);

        Team team = new Team(coop, "Друзья");

        Course jump = new Course();
        jump.doIt(team);

        team.showResults();






    }
}
