package model;

public class User {
    private Integer quantity,quantity2;
    private String calculator;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setCalculator(String calculator) {
        this.calculator = calculator;
    }

    public void setQuantity2(Integer quantity2) {
        this.quantity2 = quantity2;
    }

    public String getCalculator() {
        return calculator;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getQuantity2() {
        return quantity2;
    }
}
