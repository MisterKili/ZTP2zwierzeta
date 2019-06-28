import java.util.ArrayList;
import java.util.List;

public class Kontener<T extends Zwierze> {

    T osobnik;
    List<T> list = new ArrayList<T>();


    Kontener(){}

    Kontener(T osobnik){
        this.osobnik = osobnik;
    }

    public void put(T t){
        osobnik = t;
    }

    public void add(T t){
        list.add(t);
    }

    public String getDane(){
        return osobnik.getDane();
    }

    public void wyswietlWszystkieDane(){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getDane());
        }
    }
}
