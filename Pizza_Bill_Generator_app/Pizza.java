package Pizza_Bill_Generator_app;

public class Pizza {
    private int price;
    private boolean veg;
    private int addExtraCheesePrice = 100;
    private int addExtraToppingPrice = 150;
    private int backPack = 100;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded =  false;
    private boolean isExtraToppingAdded = false;
    private boolean isOptedTakeAway = false;


    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePizzaPrice = this.price;

    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += addExtraCheesePrice;

    }
    public void addExtraTopping(){
        isExtraToppingAdded = true;
        this.price += addExtraToppingPrice;

    }
    public void takeAway(){
        isOptedTakeAway = true;
        this.price += backPack;

    }
    public void getBill(){
        String bill =  "";
        System.out.println("Pizza : "+basePizzaPrice);
       if(isExtraCheeseAdded){
           bill +="Extra Cheese Added : "+addExtraCheesePrice+ "\n";

       }
        if(isExtraToppingAdded){
            bill +="Extra Topping Added : "+addExtraToppingPrice+ "\n";

        }

        if(isOptedTakeAway){
            bill +="Take Away : "+backPack+ "\n";

        }

        bill += "Bill :"+this.price + "\n";
        System.out.println(bill);



    }




}
