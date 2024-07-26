namespace ROUND_2_A;

public class FootballData
{
    public static Game[] GetAllPlayed()
    {
        Game[] played =
        [
            new Game("Liverpool", 2, "Everton", 0),
            new Game("Aston Villa", 1, "Liverpool", 1),
            new Game("Liverpool", 3, "West Ham", 1)
        ];
        return played;
    }
}