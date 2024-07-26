namespace ROUND_2_A.Tests;

public class FootballScoreStatsTests 
{
    [Test]
    public void TotalsFootballScoresForTeam()
    {
        FootballScoreStats stats = new FootballScoreStats();
        Assert.That(stats.TeamTotal("Liverpool"), Is.EqualTo(6));
    }
}