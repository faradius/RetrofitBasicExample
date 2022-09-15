package com.alex.retrofitbasicexample

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface APIService {

    @GET //normalmente la url se pone aqui <- pero en este ejemplo se utiliza el @URL por que no sabemos la ruta final
    suspend fun getDogsByBreeds(@Url url:String):Response<DogsResponse>

    /*
    @GET("/example/example2/{id}/loquesea")
    fun ejemplo(@Path ("id") id:String): Call<DogsResponse>

    @GET("/example/example2/v2/loquesea")
    fun ejemplo2(@Query ("pet")pet:String,@Query("name") name:String): Call<DogsResponse>

    @POST
    fun getEverything(@Body exampleDto: ExampleDto):Call<*>

    @Multipart
    @POST
    fun getEverything2(@Part image:MultipartBody.Part, @Part("example") myExample:String):Call<*>

    */
    //val requestBody = RequestBody.create(MediaType.parse(getContentResolver().getType(fileUri)),file);
    //val a = MultipartBody.Part.createFormData("picture",file.getName(),requestBody);
}

//data class ExampleDto(val name: String, val age:Int)