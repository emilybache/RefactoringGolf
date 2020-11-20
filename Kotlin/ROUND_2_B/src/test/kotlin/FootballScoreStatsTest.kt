
import org.junit.Test
import org.junit.Assert.assertEquals

class FootballScoreStatsTests {
    @Test
    fun totalsFootballScoresForTeam() {
        val data = FootballData
        val stats = FootballScoreStats(data)
        assertEquals(6, stats.teamTotal("Liverpool"))
    }
}