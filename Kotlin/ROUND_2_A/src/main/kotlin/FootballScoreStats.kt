import FootballData.allPlayed

class FootballScoreStats {
    fun teamTotal(teamName: String): Int {
        val played: List<Game> = allPlayed
        var total = 0
        for (game in played) {
            if (game.homeTeam.equals(teamName)) {
                total += game.homeTeamScore
            }
            if (game.awayTeam.equals(teamName)) {
                total += game.awayTeamScore
            }
        }
        return total
    }

}

