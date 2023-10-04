package vn.example.easyeat.retrofit

import retrofit2.Call
import retrofit2.http.GET

import vn.example.easyeat.pojo.MealList

interface MealApi {

    @GET()
    fun getRandomMeal():Call<MealList>
}