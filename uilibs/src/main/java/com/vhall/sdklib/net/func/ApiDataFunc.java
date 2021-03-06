package com.vhall.sdklib.net.func;




import com.vhall.sdklib.net.common.ResponseHelper;
import com.vhall.sdklib.net.mode.ApiResult;

import io.reactivex.functions.Function;

/**
 * @Description: ApiResult<T>转T
 * @author: <a href="http://www.xiaoyaoyou1212.com">DAWI</a>
 * @date: 2016-12-30 17:55
 */
public class ApiDataFunc<T> implements Function<ApiResult<T>, T> {
    public ApiDataFunc() {
    }

    @Override
    public T apply(ApiResult<T> response) throws Exception {
        if (ResponseHelper.isSuccess(response)) {
            return response.getData();
        }
        return null;
    }
}
