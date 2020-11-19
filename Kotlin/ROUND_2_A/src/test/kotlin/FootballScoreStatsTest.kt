
import org.junit.Test
import org.junit.Assert.assertEquals

class FootballScoreStatsTests {
    @Test
    fun totalsFootballScoresForTeam() {
        val stats = FootballScoreStats()
        assertEquals(6, stats.teamTotal("Liverpool"))
    }
}