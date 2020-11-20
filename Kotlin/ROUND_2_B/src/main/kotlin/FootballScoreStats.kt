
class FootballScoreStats(private val footballData: GameData) {
    fun teamTotal(teamName: String): Int {
        var total = 0
        val played: List<Game> = footballData.allPlayed
        for (game in played) {
            total = game.teamScore(teamName, total)
        }
        return total
    }

}

