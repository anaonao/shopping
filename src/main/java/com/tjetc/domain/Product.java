package com.tjetc.domain;

public class Product {
    private int productId;//商品编号
    private String productName;//商品名称
    private String productCount;//商品库存
    private String productPrice;//商品价格
    private String productImage;//商品图片路径
    private String productMsg;//商品描述
    private String productHot;//商品热度
    private Product product;//商品类型信息

    public Product() {
    }

    public Product(int productId, String productName, String productCount, String productPrice, String productImage, String productMsg, String productHot, Product product) {
        this.productId = productId;
        this.productName = productName;
        this.productCount = productCount;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.productMsg = productMsg;
        this.productHot = productHot;
        this.product = product;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCount() {
        return productCount;
    }

    public void setProductCount(String productCount) {
        this.productCount = productCount;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductMsg() {
        return productMsg;
    }

    public void setProductMsg(String productMsg) {
        this.productMsg = productMsg;
    }

    public String getProductHot() {
        return productHot;
    }

    public void setProductHot(String productHot) {
        this.productHot = productHot;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCount='" + productCount + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productImage='" + productImage + '\'' +
                ", productMsg='" + productMsg + '\'' +
                ", productHot='" + productHot + '\'' +
                ", product=" + product +
                '}';
    }
}
