package com.lz.ht.base.result;

public class ResultUtil {

    /**
     * 返回成功
     */
    public static Result success() {
        Result result = new Result();
        //成功
        result.setCode("0");
        //提示语
        result.setMsg("成功");
        return result;
    }

    /**
     * 返回成功
     */
    public static Result success(Object object) {
        Result result = new Result();
        //成功
        result.setCode("0");
        //提示语
        result.setMsg("成功");
        //返回内容
        result.setDate(object);
        return result;
    }

    /**
     * 返回失败
     */
    public static Result error() {
        Result result = new Result();
        //失败
        result.setCode("1");
        //提示语
        result.setMsg("失败");
        return result;
    }

    /**
     * 返回失败
     */
    public static Result error(String code, String msg) {
        Result result = new Result();
        //失败
        result.setCode(code);
        //提示语
        result.setMsg(msg);
        return result;
    }

}