public class Etudiant {
    private String nom;
    private int age;
    private String niveau;
    private String filiere;
    private int notes;
    private String tagini;

    public Etudiant(String nom, int age, String niveau, String filiere) {
        this.nom = nom;
        this.age = age;
        this.niveau = niveau;
	this.filiere = filiere
    }

    public void afficherInfos() {
        System.out.println("Nom mamamamamamamammamamamamamamama !: " + nom + ", Age: " + age + ", Niveau: " + niveau + ", filière:" + filiere);
    }

    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("Jean", 20, "Licence" , "GIGD");
        etudiant1.afficherInfos();
        etudiant1.setAge(21);
        etudiant1.afficherInfos();
    }
}

