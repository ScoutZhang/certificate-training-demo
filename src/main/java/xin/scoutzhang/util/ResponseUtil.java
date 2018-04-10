package xin.scoutzhang.util;

import xin.scoutzhang.constant.Code;
import xin.scoutzhang.dto.Response;

import java.util.ArrayList;

/**
 * Created by DEAN on 2018/4/10.
 */
public class ResponseUtil {
    public static <T> Response<T> successResponse(T object){
        Response<T> response = new Response<T>();
        response.setCode(0);
        response.setMessage("请求成功");
        response.setData(object);
        return response;
    }

    public static <T> Response<T> failResponse(T object){
        Response<T> response = new Response<T>();
        response.setCode(-1);
        response.setMessage("请求失败");
        response.setData(object);
        return response;
    }

    public static <T> Response<T> codeResponse(Code code){
        Response<T> response = new Response<T>();
        response.setCode(code.getCode());
        response.setMessage(code.getMessage());
        response.setData(null);
        return response;
    }
}
