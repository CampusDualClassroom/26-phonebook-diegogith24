package com.campusdual.classroom;


import com.campusdual.Utils;

public class Exercise {
    public static void main(String[] args) {
        Contact c1 = new Contact("Javier", "López", "654321321");
        Contact c2 = new Contact("Carlos", "Fernández-Simón", "654321321");
        Contact c3 = new Contact("Jose Manuel", "Soria", "654321321");
        Contact c4 = new Contact("Santiago","Fernández Rocha", "654321321");
        Contact c5 = new Contact("Esteban","Serrano del Río", "654321321");
        Contact c6 = new Contact("Fernando Miguel","Juan de los Santos Requejo León", "654321321");

        Phonebook p = new Phonebook();

        p.addContact(c1);
        p.addContact(c2);
        p.addContact(c3);
        p.addContact(c4);
        p.addContact(c5);
        p.addContact(c6);

        int option;

        do {
            System.out.println("\n=======   Hola. Bienvenido!   =======");
            System.out.println("Por favor, escoge la opcion que quieres: ");
            System.out.println("\nSelecciona 1 para añadir un nuevo contacto");
            System.out.println("Selecciona 2 para ver tu lista de contactos");
            System.out.println("Selecciona 3 para eliminar un contacto");
            System.out.println("Selecciona 4 para ver un contacto");
            System.out.println("Selecciona 5 para salir del Menú");
            option = Utils.integer("\nPor favor, escoge una opción: ");

            switch (option) {
                case 1:
                    Contact c = new Contact(Utils.string("Ingresa tu nombre(s): "), Utils.string("Ingresa tu apellido(s): "),
                            Utils.string("Ingresa tu numero telefonico: "));

                    p.addContact(c);
                    break;
                case 2:
                    p.showPhonebook();
                    break;
                case 3:
                    p.deleteContact(Utils.string("Por favor, ingresa el codigo del contacto: "));
                    break;
                case 4:
                    p.getContact(Utils.string("Por favor, ingresa el codigo del contacto: "));
                    break;
                case 5:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Tu opcion no es valida, selecciona una opcion valida: ");
                    break;
            }
        } while (option != 5);
    }
}



