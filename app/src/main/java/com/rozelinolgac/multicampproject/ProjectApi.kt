package com.rozelinolgac.multicampproject

import com.rozelinolgac.multicampproject.model.arrayResponce

import retrofit2.http.GET

interface ProjectApi {
   @GET("multicamp/communities")
 suspend  fun getTopCommunities() : arrayResponce


}