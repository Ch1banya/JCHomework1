public class Team {

    String NameTeam;
    TeamMate[] team;

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
}
