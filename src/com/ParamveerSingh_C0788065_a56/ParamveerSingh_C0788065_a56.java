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

    private static double getServicePackage(double costA, double costB) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Services:" +
                        "\n Package A- $" + costA +
                        "\n Package B- $" + costB +
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
                        "\n Storage Small- $" + optionCostSmall +
                        "\n Storage Large- $" + optionCostLarge +
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
                        "\n Boxes Small- $" + itemBoxesSmall +
                        "\n Boxes Large- $" + itemBoxesLarge +
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
