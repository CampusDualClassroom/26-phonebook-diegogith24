package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, Contact> contactList;


    public Phonebook() {
        this.contactList = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contactList.put(contact.getCode(), contact);
        System.out.println("El contacto fue añadido exitosamente!");
        System.out.println("Tu codigo de contacto es: " + contact.getCode());
    }

    public void showPhonebook() {
        if (!contactList.isEmpty()) {
            for (Map.Entry<String, Contact> entry : contactList.entrySet()) {
                System.out.println();
                entry.getValue().showContactDetails();
            }
        } else {
            System.out.println("tu lista de contactos ya está vacia!");
        }
    }

    public void deleteContact(String code) {
        if (contactList.containsKey(code)){
            System.out.println("El contacto\n");
            contactList.get(code).showContactDetails();
            System.out.println("\nfue eliminado exitosamente!");
            contactList.remove(code);
        } else {
            System.out.println("El contacto no existe");
        }
    }

    public Map<String, Contact> getData() {
        return this.contactList;
    }

    public void getContact(String code) {
        if (contactList.containsKey(code)){
            System.out.println("El contacto es: \n");
            contactList.get(code).showContactDetails();
        } else {
            System.out.println("El contacto no existe");
        }
    }

    }

