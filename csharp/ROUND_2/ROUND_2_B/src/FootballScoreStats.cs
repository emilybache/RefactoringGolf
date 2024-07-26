namespace ROUND_2_B;

public class FootballScoreStats
{
    private IGameData _footballData;

    public FootballScoreStats(IGameData footballData)
    {
        _footballData = footballData;
    }

    public int TeamTotal(string teamName)
    {
        int total = 0;
        Game[] played = _footballData.GetAllPlayed();
        foreach (var game in played)
        {
            total += game.GetTeamScore(teamName);
        }
        return total;
    }
}