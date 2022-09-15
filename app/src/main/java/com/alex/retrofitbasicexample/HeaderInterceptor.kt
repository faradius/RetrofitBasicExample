package com.alex.retrofitbasicexample

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor:Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("Accept:","application/json")
            .addHeader("ApiKey", "sadni34549n")
            .build()
        return chain.proceed(request)
    }
}