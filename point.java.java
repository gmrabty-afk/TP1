package tp;
public class point {
 
    private String nom;
    private int abscisse;
    private int ordonnee;
 
    public point(String n, int x, int y) {
        nom = n;
        abscisse = x;
        ordonnee = y;
    }
 
    public point(int x, int y) {
        nom = "";
        abscisse = x;
        ordonnee = y;
    }
 
   public point(String n) {
        nom = n;
        abscisse = 0;
        ordonnee = 0;
    }
 
    public void Affiche() {
        System.out.println(nom + " (" + abscisse + ", " + ordonnee + ")");
    }
 
    public void TranslHoriz(int a) {
        abscisse = abscisse + a;
    }
 
    public void TranslVert(int a) {
        ordonnee = ordonnee + a;
    }
 
    public void Translation(int a, int b) {
        abscisse = abscisse + a;
        ordonnee = ordonnee + b;
    }
 
    
    public String getNom() {
        return nom;
    }
 
    public int getAbscisse() {
        return abscisse;
    }
 
    public int getOrdonnée() {
        return ordonnee;
    }
 
    public void setNom(String ch) {
        nom = ch;
    }
 
    public void setAbscisse(int a) {
        abscisse = a;
    }
 
    public void setOrdonnée(int a) {
        ordonnee = a;
    }
}
 
