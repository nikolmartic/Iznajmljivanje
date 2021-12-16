import java.util.ArrayList;

public class Servis {

    //provjera broja svih auta

    //pretraživanje po proizvodjacu

    //pretraživanje po kubikaži

    //pretraga slobodnih auta za iznajmljivanje

    //iznajmljivanje auta

    //vraćanje auta

    private ArrayList<Auto> listaSvihAuta = new ArrayList<>();
    private ArrayList<Auto> listaSlobodnihAuta = new ArrayList<>();


    public Servis() {

    }

    public void DodajAuto(Auto auto) {
        listaSvihAuta.add(auto);
    }

    public int getBrojauta() {
        return listaSvihAuta.size();
    }

    public ArrayList<Auto> getProizvodjacauta(String proizvodjac) {
        ArrayList<Auto> povratnaLista = new ArrayList<>();
        for (int i = 0; i < listaSvihAuta.size(); i++) {

            if (listaSvihAuta.get(i).getProizvodjac() == proizvodjac) {
                povratnaLista.add(listaSvihAuta.get(i));
            }
        }

        return povratnaLista;

    }


    public ArrayList<Auto> getMinimalnakubikaza(float kubikaza) {
        ArrayList<Auto> povratnaLista = new ArrayList<>();
        for (int i = 0; i < listaSvihAuta.size(); i++) {

            if (listaSvihAuta.get(i).getKubikaza() >= kubikaza) {
                povratnaLista.add(listaSvihAuta.get(i));
            }
        }

        return povratnaLista;
    }

    public ArrayList<Auto> getIznajmljen(boolean iznajmljen) {
        ArrayList<Auto> povratnaLista = new ArrayList<>();
        for (int i = 0; i < listaSvihAuta.size(); i++) {

            if (listaSvihAuta.get(i).getIznajmljen() == true) {
                povratnaLista.add(listaSvihAuta.get(i));

            }


        }       return povratnaLista;
    }
}





























