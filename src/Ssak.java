public class Ssak extends Zwierze {

    int masa;

    public Ssak(){
        super();
    }

    public Ssak(int masa, String plec){
        super(plec);
        this.masa = masa;
    }

    @Override
    public String getDane() {
        return super.getDane()+" masa: "+masa;
    }
}
