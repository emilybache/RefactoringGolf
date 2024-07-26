namespace ROUND_2_B.Tests;

public class FootballScoreStatsTests
{
    [Test]
    public void Test1()
    {
        FootballScoreStats stats = new FootballScoreStats(new FootballData());
        Assert.That(stats.TeamTotal("Liverpool"), Is.EqualTo(6));
    }
}