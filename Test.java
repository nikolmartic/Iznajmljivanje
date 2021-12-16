import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {

        Test Nikol = new Test();

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(123456);
        lista.add(123);
        lista.add(-4);
        lista.remove(2);

        for (int i = 0; i < lista.size(); i++){
            //System.out.println(lista.get(i));

        }
    }

    public Test() {
Auto mercedes = new Auto("mercedes",2.5f, 2008, false);
Auto audi = new Auto("audi", 3.0f, 2010, false);
Auto bmw = new Auto("bmw", 2.0f, 2009, false);
Auto peugeot = new Auto ("peugeot", 1.6f, 2015, false);
Auto citroen = new Auto("citroen", 2.0f, 2017, false);
Auto toyota = new Auto ("toyota", 2.0f, 2010, false);
Auto renault = new Auto("renault", 1.9f, 2015, false);

 Servis servis = new Servis();
 servis.DodajAuto(mercedes);
 servis.DodajAuto(audi);
 servis.DodajAuto(bmw);
 servis.DodajAuto(peugeot);
 servis.DodajAuto(citroen);
 servis.DodajAuto(toyota);
 servis.DodajAuto(renault);

 ArrayList<Auto>svaautajacaodkubika =servis.getMinimalnakubikaza(2.0f);
  for (int i = 0; i < svaautajacaodkubika.size(); i++){
      System.out.println("Auto jace od dva kubika je " + svaautajacaodkubika.get(i).getProizvodjac());

  }



    }


}




