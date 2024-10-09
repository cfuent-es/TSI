package T1;

public enum Combustivel {
    GASOLINA,
    ALCOOL,
    DIESEL;

    public static Combustivel getCombustivel(int combustivel) {
        switch (combustivel) {
            case 1:
                return GASOLINA;
            case 2:
                return ALCOOL;
            case 3:
                return DIESEL;
            default:
                return null;
        }
    }
}
