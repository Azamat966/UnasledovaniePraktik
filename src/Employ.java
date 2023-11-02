public class Employ extends Person{
   private Double solari;
   private String rabota;



    public Employ(Double solari, String rabota) {
        this.solari = solari;
        this.rabota = rabota;
    }


    public Double getSolari() {
        return solari;
    }

    public void setSolari(String solari) {
        this.solari = Double.valueOf(solari);
    }

    public String getRabota() {
        return rabota;
    }

    public void setRabota(String rabota) {
        this.rabota = rabota;
    }

    @Override
    public String toString() {
        return "Employ\n" +
                "name: Jane smith\n"+
                "age: 25\n"+
                "solari " + solari + "\n" +
                "Employ ID| DOLSHNOST: PROGRAMIST\n"+
                "rabota " + rabota;
    }
}



