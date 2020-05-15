package org.my.com.base.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    public static final int CODE_SUCCESS = 0;
    public static final int CODE_FAILED = 1;

    private Integer code;

    private Map<String, String> msg;

    private Object data;


    public static Map<String, String> msg(String key, String value) {
        Map<String, String> map = new HashMap();
        map.put(key, value);
        return map;
    }

    public static Result success() {
        return new Result(CODE_SUCCESS, null, null);
    }

    public static Result success(Object data) {
        return new Result(CODE_SUCCESS, null, data);
    }

    public static Result success(Map<String ,String> msg,Object data){
        return new Result(CODE_SUCCESS,msg,data);
    }

}
