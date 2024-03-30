public class Etudiant {
    private String nom;
    private int age;
    private String niveau;

    public Etudiant(String nom, int age, String niveau) {
        this.nom = nom;
        this.age = age;
        this.niveau = niveau;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Age: " + age + ", Niveau: " + niveau);
    }

    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("Jean", 20, "Licence");
        etudiant1.afficherInfos();
        etudiant1.setAge(21);
        etudiant1.afficherInfos();
    }
}

