package com.example.ecommercespring.gateway.api;

import com.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.http.GET;
import retrofit2.Call;

import java.io.IOException;


public interface IFakeStoreCategoryApi {
    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllFakeCategories() throws IOException;
}
