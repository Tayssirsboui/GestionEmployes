package entities;

public class Employe implements Comparable<Employe>{

    private int identifiant;
    private String nom;
    private String prenom;
    private String nomDep;
    private int grade;

    public Employe(){}

    public Employe(int identifiant, String nom, String prenom, String nomDep, int grade) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof Employe employe) {
            return (this.identifiant == employe.identifiant && this.nom.equals(employe.nom));
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employe{" + "identifiant=" + identifiant + ", nom='" + nom + ", prenom='" + prenom  + ", nomDep='" + nomDep +  ", grade=" + grade + '}';
    }

    @Override
    public int compareTo(Employe e) {
        return this.identifiant - e.identifiant;
    }

}
