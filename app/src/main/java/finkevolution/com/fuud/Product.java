package finkevolution.com.fuud;

/**
 * Created by Girondins on 2017-11-13.
 */

public class Product {
    private String productName, productMeasurment;
    private double productQuantity;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMeasurment() {
        return productMeasurment;
    }

    public void setProductMeasurment(String productMeasurment) {
        this.productMeasurment = productMeasurment;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(double productQuantity) {
        this.productQuantity = productQuantity;
    }
}
