public class Auto {


    private String proizvodjac = "";
    private float kubikaza;
    private int godiste;
    private boolean iznajmljen;



    public Auto (String proizvodjac, float kubikaza, int godiste, boolean iznajmljen) {
        this.proizvodjac=proizvodjac;
        this.kubikaza=kubikaza;
        this.godiste=godiste;
        this.iznajmljen=iznajmljen;
    }


    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }
    public String getProizvodjac() {
        return proizvodjac;
    }


    public void setKubikaza (float kubikaza) {this.kubikaza = kubikaza; }
    public float getKubikaza() { return kubikaza; }


    public void setGodiste (int godiste) { this.godiste = godiste; }
    public int getGodiste () { return godiste; }

    public void setIznajmljen (boolean iznajmljen) {this.iznajmljen = iznajmljen;}
    public boolean getIznajmljen () {return iznajmljen; }






}

