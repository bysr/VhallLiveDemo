package com.vhall.sdklib.config.api;


import com.vhall.sdklib.config.Const;
import com.vhall.sdklib.net.mode.ApiResult;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 接口api
 */
public interface RetrofitService {

    @FormUrlEncoded
    @POST(Const.GET_VIDEO_LIST) /*新用户注册*/
    Observable<ApiResult> getVideolist(
            @Field("user_id") int user_id,
            @Field("type") int type,
            @Field("pos") int pos,
            @Field("limit") int limit,
            @Field("status") int status
    );

}
