package com.ParamveerSingh_C0788065_a56;

import javax.swing.*;

public class ParamveerSingh_C0788065_a56 {
    private double servicesPackageA;
    private double servicesPackageB;
    private double optionsStorageSmall;
    private double optionsStorageLarge;
    private double itemsBoxesSmall;
    private double itemsBoxesLarge;

    public ParamveerSingh_C0788065_a56(){
        setServicesPackageA();
        setServicesPackageB();
        setOptionsStorageSmall();
        setOptionsStorageLarge();
        setItemsBoxesSmall();
        setItemsBoxesLarge();
    }

    /**
     The set methods store values in their respective fields
     */

    public void setServicesPackageA() {
        this.servicesPackageA = 100.00;
    }

    public void setServicesPackageB() {
        this.servicesPackageB = 150.00;
    }

    public void setOptionsStorageSmall() {
        this.optionsStorageSmall = 8.00;
    }

    public void setOptionsStorageLarge() {
        this.optionsStorageLarge = 20.11;
    }

    public void setItemsBoxesSmall() {
        this.itemsBoxesSmall = 2.50;
    }

    public void setItemsBoxesLarge() {
        this.itemsBoxesLarge = 4.50;
    }

    /**
     * The get methods return values to their respective fields
     * @return values to methods
     */

    public double getServicesPackageA() {
        return servicesPackageA;
    }

    public double getServicesPackageB() {
        return servicesPackageB;
    }

    public double getOptionsStorageSmall() {
        return optionsStorageSmall;
    }

    public double getOptionsStorageLarge() {
        return optionsStorageLarge;
    }

    public double getItemsBoxesSmall() {
        return itemsBoxesSmall;
    }

    public double getItemsBoxesLarge() {
        return itemsBoxesLarge;
    }

    public static void main(String[] args) {
        ParamveerSingh_C0788065_a56 cost = new ParamveerSingh_C0788065_a56();
        int i = 1;
        int j = 2;
        String input;
        while (true){
            String username = JOptionPane.showInputDialog(null,"Enter Username: (Hint: Paramveer)");
            String password = JOptionPane.showInputDialog(null,"Enter Password: (Hint: Singh)");
            if(username.equals("Paramveer") && password.equals("Singh")){
                JOptionPane.showMessageDialog(null, "Welcome! You are logged in.");

                double servicesPackage = getServicePackage(cost.getServicesPackageA(),cost.getServicesPackageB());
                input = JOptionPane.showInputDialog(null,"How many hours you want this service: ");
                double hoursService = Double.parseDouble(input);
                double totalService = servicesPackage * hoursService;
                System.out.println("Cost of Service Package: $" + totalService);

                double optionsStorage = getStorageOption(cost.getOptionsStorageSmall(),cost.getOptionsStorageLarge());
                input = JOptionPane.showInputDialog(null,"How many days you want this option: ");
                double dayOptions = Double.parseDouble(input);
                double totalOptions = optionsStorage * dayOptions;
                System.out.println("Cost of Options Storage: $" + totalOptions);

                double itemsBoxes = getBoxOption(cost.getItemsBoxesSmall(),cost.getItemsBoxesLarge());
                input = JOptionPane.showInputDialog(null,"How many boxes you want this item: ");
                double boxItems = Double.parseDouble(input);
                double totalBoxes = itemsBoxes * boxItems;
                System.out.println("Cost of Options Storage: $" + totalBoxes);
                JOptionPane.showMessageDialog(null,
                        "Total services cost as per your selection: $"+ totalService +
                                "\nTotal options cost as per your selection: $"+ totalOptions +
                                "\nTotal cost of items as per your selection: $"+ totalBoxes +
                                "\n\nTotal cost including everything: $" + (totalService + totalOptions + totalBoxes));
                break;
            }
            else if (i < 3 ){
                JOptionPane.showMessageDialog(null, "Please enter correct credentials. " + j + " more tries left.");
                i++;
                j--;
            }
            else {
                JOptionPane.showMessageDialog(null, "You have exceeded your tries, goodbye.");
                break;
            }
        }
    }

    private static double getServicePackage(double costA, double costB) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Services:" +
                        "\n Package A- $" + costA + "/hr" +
                        "\n Package B- $" + costB + "/hr" +
                        "\n For package A, enter A" +
                        "\n For package B, enter B");

        if(servicePackage.equalsIgnoreCase("A")){
            return costA;
        }
        else if(servicePackage.equalsIgnoreCase("B")){
            return costB;
        }
        else  {
            return 0.0;
        }
    }

    private static double getStorageOption(double optionCostSmall, double optionCostLarge) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Options:" +
                        "\n Storage Small- $" + optionCostSmall + "/day" +
                        "\n Storage Large- $" + optionCostLarge + "/day" +
                        "\n For storage small, enter S" +
                        "\n For storage large, enter L");
        if(servicePackage.equalsIgnoreCase("S")){
            return optionCostSmall;
        }
        else if(servicePackage.equalsIgnoreCase("L")){
            return optionCostLarge;
        }
        else  {
            return 0.0;
        }
    }

    private static double getBoxOption(double itemBoxesSmall, double itemBoxesLarge) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Items:" +
                        "\n Boxes Small- $" + itemBoxesSmall + "/box" +
                        "\n Boxes Large- $" + itemBoxesLarge + "/box" +
                        "\n For boxes small, enter S" +
                        "\n For boxes large, enter L");
        if(servicePackage.equalsIgnoreCase("S")){
            return itemBoxesSmall;
        }
        else if(servicePackage.equalsIgnoreCase("L")){
            return itemBoxesLarge;
        }
        else  {
            return 0.0;
        }
    }
}