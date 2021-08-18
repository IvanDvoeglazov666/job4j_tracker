package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        Product[] res = new Product[products.length];
        for (int i = 0; i < products.length; i++) {
               if (i == index) {
                products[i] = null;
                res[i] = products[i];
            } else if (i > index) {
                   products[i - 1] = products[i];
                   res[i - 1] = products[i];
                   res[i] = null;
            } else if (i < index) {
                   res[i] = products[i];
               }
        }
        return res;
    }
}
