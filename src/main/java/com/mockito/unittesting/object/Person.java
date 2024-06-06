package com.mockito.unittesting.object;
public class Person {
    private String nom ;
    private String prenom ;
    private String matricule ;

    private double age;
    public Person(String nom, String prenom, String matricule, double age) {
        this.nom = nom ;
        this.prenom = prenom ;
        this.matricule = matricule ;
        this.age = age ;
    }

    public Person(String nom, String prenom, String matricule) {
        this.nom = nom ;
        this.prenom = prenom ;
        this.matricule = matricule ;
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
    public String getMatricule() {
        return matricule;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    @Override
    public boolean equals(Object obj) {
        // Objet nul ?
        if(obj == null) return false ;
        // Même référence ?
        if(this == obj) return true ;
        // Même classe ?
        if(getClass() != obj.getClass()) return false ;
        Person p = (Person) obj ;
        if(nom == null) {
            if(p.nom != null)
                return false ;
        } else if (!nom.equals(p.nom))
            return false ;
        if(prenom == null) {
            if(p.prenom != null)
                return false ;
        } else if(!prenom.equals(p.prenom))
            return false ;
        if(matricule == null) {
            if(p.matricule != null)
                return false ;
        } else if(!matricule.equals(p.matricule))
            return false ;
        return true;
    }
}