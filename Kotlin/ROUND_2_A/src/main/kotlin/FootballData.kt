

object FootballData {
    val allPlayed: List<Game>
        get() {
            val played = listOf(
            Game("Liverpool", 2, "Everton", 0),
            Game("Aston Villa", 1, "Liverpool", 1),
            Game("Liverpool", 3, "West Ham", 1),
            )
            return played
        }
}