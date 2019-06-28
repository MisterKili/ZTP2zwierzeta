public class Wyswietlacz {

    public static void pokazDaneZwierzecia(Kontener k){
        System.out.println(k.getDane());
    }

    public void pokazDaneSsaka(Kontener k, Ssak s){
        System.out.println(k.getDane());
    }

    public void pokazDanePsa(Kontener k, Pies p){
        System.out.println(k.getDane());
    }

    public static void main(String[] args) {
        Zwierze zwierze = new Zwierze("samiec");
        Ssak ssak = new Ssak(50,"samica");
        Pies pies = new Pies("Amidala", 40, "samica");

        Kontener<Zwierze> zwierzeKontener = new Kontener<>();
        zwierzeKontener.put(zwierze);
        zwierzeKontener.put(pies);

        Kontener<Ssak> ssakKontener = new Kontener<>();
        ssakKontener.put(ssak);

//        Kontener<Pies> zwierzeKontener2 = new Kontener<>();
//        zwierzeKontener2.put(ssak);   //blad kompilacji

        Kontener<Pies> piesKontener = new Kontener<>();
        piesKontener.put(pies);

//        piesKontener.put(zwierze);    //blad kompilacji

        System.out.println("Pojedynczy obiekt w kontenerze:");

        pokazDaneZwierzecia(zwierzeKontener);
        pokazDaneZwierzecia(ssakKontener);
        pokazDaneZwierzecia(piesKontener);
        System.out.println();

        Zwierze zwierze2 = new Zwierze("samica");

        System.out.println("Lista obiektow 1 - kontener zwierze:");
        Kontener<Zwierze> kontener4 = new Kontener<>();
        kontener4.add(zwierze);
        kontener4.add(zwierze2);
        kontener4.add(pies);
        kontener4.add(ssak);
        kontener4.wyswietlWszystkieDane();
        System.out.println();

        System.out.println("Lista obiektow 2 - kontener ssak:");
        Kontener<Ssak> kontenerSsak = new Kontener<>();
        kontenerSsak.add((Ssak) zwierze);    //koercja
        kontenerSsak.add(pies);
        kontenerSsak.add(ssak);
        kontenerSsak.wyswietlWszystkieDane();
    }
}
