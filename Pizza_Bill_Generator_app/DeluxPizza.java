package Pizza_Bill_Generator_app;
public class DeluxPizza extends Pizza {
    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopping();
    }
}
