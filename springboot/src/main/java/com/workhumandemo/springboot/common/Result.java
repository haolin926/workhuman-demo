package com.workhumandemo.springboot.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private String Code;
    private String msg;
    private Object data;

    public static Result success(Object data)
    {
        return new Result("1","success",data);
    }

    public static Result error()
    {
        return new Result("0","error",null);
    }

}
