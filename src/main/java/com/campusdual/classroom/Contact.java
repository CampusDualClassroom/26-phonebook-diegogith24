package com.campusdual.classroom;

import java.text.Normalizer;


public class Contact implements ICallActions {
    private String name;
    private String surName;
    private String phoneNumber;


    public Contact(String name, String surName, String phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surName;
    }

    public void setSurnames(String lastName) {
        this.surName = surName;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCode(){
        String nameClean = cleanCode(this.name);
        String surNameClean = cleanCode(this.surName);

        String[] surNames = surNameClean.split(" ");
        StringBuilder sb = new StringBuilder();

        sb.append(nameClean.charAt(0));

        if (surNames.length > 1) {
            sb.append(surNames[0].charAt(0));
            for (int i = 1; i < surNames.length; i++) {
                sb.append(surNames[i]);
            }
        } else {
            sb.append(surNameClean);
        }
        return sb.toString();
    }

    public String cleanCode(String nameCode){
        nameCode = Normalizer.normalize(nameCode, Normalizer.Form.NFD);
        nameCode = nameCode.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        nameCode = nameCode.toLowerCase();
        return nameCode;
    }



    @Override
    public void callMyNumber() {
        System.out.println("El contacto " + this.name + " " + this.surName + " se está llamando a sí mismo.");
        System.out.println("Su número de teléfono es: " + this.phoneNumber);

    }

    @Override
    public void callOtherNumber(String number) {
        System.out.println("El contacto " + this.name + " " + this.surName + " está llamando al número: " + number);

    }

    @Override
    public void showContactDetails() {
        System.out.println("--- Detalles del Contacto ---");
        System.out.println("Nombre Completo: " + this.name + " " + this.surName);
        System.out.println("Número de Teléfono: " + this.phoneNumber);
        System.out.println("Codigo: " + this.getCode());
        System.out.println("---------------------------");

    }
}
