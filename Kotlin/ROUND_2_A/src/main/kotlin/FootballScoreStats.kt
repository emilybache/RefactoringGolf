import FootballData.allPlayed

class FootballScoreStats {
    fun teamTotal(teamName: String?): Int {
        var total = 0
        val played: Array<Game?> = allPlayed
        for (game in played) {
            if (game != null) {
                if (game.homeTeam.equals(teamName)) {
                    total += game.homeTeamScore
                }
            }
            if (game != null) {
                if (game.awayTeam.equals(teamName)) {
                    total += game.awayTeamScore
                }
            }
        }
        return total
    }
}