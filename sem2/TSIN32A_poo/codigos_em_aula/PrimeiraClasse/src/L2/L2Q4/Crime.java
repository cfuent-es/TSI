//package L2.L2Q4;

public enum Crime {
    ASSALTO("ASSALTO"),
    CORRUPCAO("CORRUPCAO"),
    ASSASSINATO("ASSASINATO"),
    ROUBO("ROUBO");

    private String crime;

    Crime(String crime){
        this.crime = crime;
    }

    public String getCrime(){
        return crime;
    }
}
