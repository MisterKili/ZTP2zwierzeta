public class Pies extends Ssak {

    public String imie;

    public Pies(String imie, int masa, String plec){
        super(masa, plec);
        this.imie = imie;
    }

    @Override
    public String getDane() {
        return super.getDane()+" imie: "+imie;
    }
}
