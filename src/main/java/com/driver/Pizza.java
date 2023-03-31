package com.driver;

public class Pizza {

    private int basePrice;

    private Boolean isVeg;

    private int ToppingsPrice;

    private int cheesePrice;

    private int paperBagPrice;

    private String bill;

    private int totalPrice;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean ispaperBagAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg) {//Constructer
        if(isVeg){
            basePrice = 300;
            ToppingsPrice = 70;
        }
        else{
            basePrice = 400;
            ToppingsPrice = 120;
        }

        totalPrice = basePrice;
        cheesePrice = 80;
        paperBagPrice = 20;

        isCheeseAdded = false;
        isToppingsAdded = false;
        ispaperBagAdded = false;
        isBillGenerated = false;

        bill = "Base Price Of The Pizza: "+basePrice+"\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded) {
            totalPrice += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded){
            totalPrice += ToppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!ispaperBagAdded){
            totalPrice += paperBagPrice;
            ispaperBagAdded = true;
        }
    }

    public String getBill(){

        if(!isBillGenerated){

            if(isCheeseAdded) bill += "Extra Cheese Added: " + cheesePrice + "\n";

            if(isToppingsAdded) bill += "Extra Toppings Added: " + ToppingsPrice + "\n";

            if(ispaperBagAdded) bill += "Paperbag Added: " + paperBagPrice + "\n";

            bill += "Total Price: " + totalPrice + "\n";

            isBillGenerated = true;
        }
        return bill;
    }
}
