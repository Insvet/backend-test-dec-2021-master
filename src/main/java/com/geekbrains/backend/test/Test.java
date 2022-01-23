//package com.geekbrains.backend.test;
//
//import java.io.IOException;
//import java.util.List;
//
//import com.geekbrains.backend.test.miniMarket.MiniMarketService;
//import com.geekbrains.backend.test.miniMarket.model.Product;
//import com.geekbrains.backend.test.miniMarket.model.ProductResponse;
//import com.geekbrains.backend.test.miniMarket.model.Products;
//import okhttp3.Response;
//import retrofit2.Call;
//
//public class Test {
//    public static void main(String[] args) throws IOException {
//        MiniMarketService service = new MiniMarketService();
//        List<Product> products = service.getProducts();
//        Product product = service.getProduct(98L);
//        System.out.println(products);
//        System.out.println(product);
//        Object createProduct = service.createProduct();
//    }
//}
