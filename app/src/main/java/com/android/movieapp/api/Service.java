package com.android.movieapp.api;

import com.android.movieapp.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface Service {

    @GET("movie/popular?language=es&")
    Call<MoviesResponse> getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/top_rated?language=es&")
    Call<MoviesResponse> getTopRatedrMovies(@Query("api_key") String apiKey);
}
