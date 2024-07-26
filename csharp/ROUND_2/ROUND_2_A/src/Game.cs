namespace ROUND_2_A;

public class Game
{
    public string HomeTeam { get; }
    public int HomeTeamScore { get; }
    public string AwayTeam { get; }
    public int AwayTeamScore { get; }

    public Game(string homeTeam, int homeTeamScore, string awayTeam, int awayTeamScore)
    {
        HomeTeam = homeTeam;
        HomeTeamScore = homeTeamScore;
        AwayTeam = awayTeam;
        AwayTeamScore = awayTeamScore;
    }
}