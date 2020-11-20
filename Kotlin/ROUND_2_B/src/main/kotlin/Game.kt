class Game(val homeTeam: String, val homeTeamScore: Int, val awayTeam: String, val awayTeamScore: Int) {

    fun teamScore(teamName: String, total: Int): Int {
        var total1 = total
        if (this.homeTeam.equals(teamName)) {
            total1 += this.homeTeamScore
        }
        if (this.awayTeam.equals(teamName)) {
            total1 += this.awayTeamScore
        }
        return total1
    }
}