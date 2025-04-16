package controllers;
import models.Person;
import views.ShowConsole;

public class MetodosdeBusquedaBinaria {
    private Person[] people;
    private ShowConsole pantalla;
    public MetodosdeBusquedaBinaria(Person[] people) {
        this.people = people;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodo de Busqueda binaria");
    }

    private int findPersonByCode(int code){
        int bajo = 0;
        int alto = people.length - 1;
        while (alto >= bajo) {
            int central = (bajo + alto) / 2;
            if (people[central].getCode() == code){
                return central;
            }
            
            if(people[central].getCode() < code){
                bajo = central + 1;//izq
            } else {
                alto = central - 1;//der
            }
        }
        return -1; 
    }

    public void showPersonByName() {
        String nameToFind = pantalla.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson == -1) {
            pantalla.showMessage("Persona con nombre " + nameToFind + " no encontrada.");
        } else {
            pantalla.showMessage("Persona encontrada: " + people[indexPerson].toString());
        }
    }

    public int findPersonByName(String name) {
        sortPeopleByName();
        for (int i = 0; i < people.length; i++) {
            if (people[i].getNombre().equalsIgnoreCase(name)) {
                return i; // Retorna el índice de la persona
            }
        }
        return -1; // No se encontró a la persona con el nombre dado
    }

    private void sortPeopleByName() {
        
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[j].getNombre().compareToIgnoreCase(people[j + 1].getNombre()) > 0) {
                    
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }
    }


