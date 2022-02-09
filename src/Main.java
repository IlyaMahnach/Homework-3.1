public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(20000, 20);
        System.out.println("Начислено миль: " + miles);
    }
}

