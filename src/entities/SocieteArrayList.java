package entities;

import interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion {

    List <Employe> employesList;

    public SocieteArrayList(){
        employesList=new ArrayList<>();
    }



    @Override
    public void ajouterEmploye(Employe employe) {
        employesList.add(employe);
    }


    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employesList) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employesList.contains(employe);

    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employesList.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println(employesList);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employesList);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employesList,new GradeComparator().thenComparing(new NomDepartementComparator()));


    }
}
