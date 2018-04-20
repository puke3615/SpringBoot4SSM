package com.puke.base;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zijiao
 * @version 18/4/20
 */
@Data
@AllArgsConstructor
public class Result<T> {

    private static final String MSG_SUCCESS = "SUCCESS";
    private static final String MSG_ERROR = "ERROR";

    private boolean success;
    private String msg;
    private T data;

    public static <T> Result<T> success(T data, String msg) {
        return new Result<>(true, msg, data);
    }

    public static <T> Result<T> success(T data) {
        return success(data, MSG_SUCCESS);
    }

    public static <T> Result<T> error(String msg) {
        return new Result<>(false, msg, null);
    }

    public static <T> Result<T> error() {
        return error(MSG_ERROR);
    }

}
