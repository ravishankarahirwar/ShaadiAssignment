package com.shaadi.apis;

import com.shaadi.models.UserList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 13-01-2019
 */
public interface  APIInterface {
    @GET("api/")
    Call<UserList> getUsers(@Query("results") int userCount);

}
