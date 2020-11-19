object FootballData {
    val allPlayed: Array<Game?>
        get() {
            val played: Array<Game?> = arrayOfNulls<Game>(3)
            played[0] = Game("Liverpool", 2, "Everton", 0)
            played[1] = Game("Aston Villa", 1, "Liverpool", 1)
            played[2] = Game("Liverpool", 3, "West Ham", 1)
            return played
        }
}