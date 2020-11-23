
class ScoreStats(private val gameData: GameData) {
    fun teamTotal(teamName: String): Int {
        var total = 0
        val played: List<Game> = gameData.allPlayed
        for (game in played) {
            total = game.teamScore(teamName, total)
        }
        return total
    }

}

