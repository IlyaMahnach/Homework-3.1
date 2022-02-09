public class BonusMilesService {
    public int calculate(int price, int bid) {
        int bonus = price / bid;
        return bonus;
    }
}
