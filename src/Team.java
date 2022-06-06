public class Team {

    String NameTeam;
    TeamMate[] team;

    String result;

    public Team(TeamMate[] team, String NameTeam) {
        this.NameTeam = NameTeam;
        this.team = team;

    }

    public String getNameTeam() {
        return NameTeam;
    }

    public TeamMate[] getTeam() {
        return team;
    }

    public void showResults() {
       System.out.println(result);
    }

}
