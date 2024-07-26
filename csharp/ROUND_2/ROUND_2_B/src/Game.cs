namespace ROUND_2_B;

public class Game
{
    private readonly string _homeTeam;
    private readonly int _homeTeamScore;
    private readonly string _awayTeam;
    private readonly int _awayTeamScore;

    public Game(string homeTeam, int homeTeamScore, string awayTeam, int awayTeamScore)
    {
        _homeTeam = homeTeam;
        _homeTeamScore = homeTeamScore;
        _awayTeam = awayTeam;
        _awayTeamScore = awayTeamScore;
    }

    public int GetTeamScore(string teamName)
    {
        int total = 0;
        if (_homeTeam.Equals(teamName))
        {
            total += _homeTeamScore;
        }

        if (_awayTeam.Equals(teamName))
        {
            total += _awayTeamScore;
        }

        return total;
    }
}