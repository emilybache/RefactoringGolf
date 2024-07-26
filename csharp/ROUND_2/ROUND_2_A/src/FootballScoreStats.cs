namespace ROUND_2_A;

public class FootballScoreStats
{
    public int TeamTotal(string teamName)
    {
        int total = 0;
        Game[] played = FootballData.GetAllPlayed();
        foreach (var game in played)
        {
            if (game.HomeTeam.Equals(teamName))
            {
                total += game.HomeTeamScore;
            }
            if (game.AwayTeam.Equals(teamName))
            {
                total += game.AwayTeamScore;
            }
        }
        return total;
    }
}