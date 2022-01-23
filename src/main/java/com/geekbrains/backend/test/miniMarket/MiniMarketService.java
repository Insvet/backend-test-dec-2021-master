//package com.geekbrains.backend.test.miniMarket;
//
//import java.io.IOException;
//import java.util.List;
//
//import com.geekbrains.backend.test.miniMarket.model.CreatesProduct;
//import com.geekbrains.backend.test.miniMarket.model.Product;
//import lombok.SneakyThrows;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//public class MiniMarketService {
//
//    private final MiniMarketApi api;
//    int id;
//
//    public MiniMarketService() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://minimarket1.herokuapp.com/market/api/v1/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        api = retrofit.create(MiniMarketApi.class);
//    }
//
//    public List<Product> getProducts() throws IOException {
//        Response<List<Product>> response = api.getProducts().execute();
//        if (response.isSuccessful()) {
//            return response.body();
//        } else {
//            throw new RuntimeException("testProducts");
//        }
//    }
//
//    public Product getProduct(Long id) throws IOException {
//        Response<Product> response = api.getProduct(id).execute();
//        if (response.isSuccessful()) {
//            return response.body();
//        } else {
//            throw new RuntimeException("product not found");
//        }
//    }
//
//    @BeforeEach
//    void setUp() {
//        createsProduct = new CreatesProduct()
//                .withTitle()
//                .withCategoryTitle()
//                .withPrice((int) (Math.random() * 10000));
//
//        void createProduct() {
//            Response<CreatesProduct> response = api.createProduct(createsProduct).execute();
//            id = response.body().getId();
//        }
//    }
//}