package Main;

import Main.Product.Product;

public class Main {
    public static void main(String[] args) {

        SimpleConnector connector;

        //API_KEY is a unique for your API2Cart account
        final String API_KEY = "cd40010ae9e83dda0143fd304e47b657";

        //STORE_KEYS are unique for all connected stores under your account
        final String OPENCART_STORE_KEY = "ed58a22dfecb405a50ea3ea56979360d";
        final String WOOCOMMERCE_STORE_KEY = "cfce78a77cc4r46ab02ca75aee5d4398";

        connector = new SimpleConnector(OPENCART_STORE_KEY, API_KEY);
        connector.clearLog();

        Product product = new Product(connector);

        product.productList();
        product.productInfo(32);
        product.productVariantCount();

    }
}