import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballScoreStatsTests {

	@Test
	public void totalsFootballScoresForTeam() {
		FootballScoreStats stats = new FootballScoreStats(new FootballData());
		assertEquals(6, stats.teamTotal("Liverpool"));
	}

}
