package cn.stylefeng.guns.core.api;

/**
 * json返回的接口
 *
 * @author Administrator
 */
public class JsonResult {

    public static ResultBaseEntity success() {
        return result(ResultCode.SYS_NORNAL.getCode(), null, ResultCode.SYS_NORNAL.getMessage());
    }

    public static <T> ResultBaseEntity<T> success(T data) {
        return result(ResultCode.SYS_NORNAL.getCode(), data, ResultCode.SYS_NORNAL.getMessage());
    }

    public static ResultBaseEntity success(ICode iCode) {
        return result(iCode.getCode(), null, iCode.getMessage());
    }

    public static ResultBaseEntity success(ICode iCode, Object data) {
        return result(iCode.getCode(), data, iCode.getMessage());
    }

    public static ResultBaseEntity error(ICode iCode) {
        return error(iCode, null);
    }

    public static <T> ResultBaseEntity<T> error(ICode iCode, T data) {
        return result(iCode.getCode(), data, iCode.getMessage());
    }


    public static <T> ResultBaseEntity<T> error(ICode iCode, T data, String message) {
        return result(iCode.getCode(), data, message);
    }

    /**
     * @param code    返回码
     * @param data
     * @param message
     * @return
     */
    public static <T> ResultBaseEntity<T> result(Integer code, T data, String message) {
        ResultBaseEntity<T> ResultBaseEntity = new ResultBaseEntity<T>();
        ResultBaseEntity.setCode(code);
        ResultBaseEntity.setMessage(message);
        if (data != null) {
            ResultBaseEntity.setData(data);
        }
        return ResultBaseEntity;
    }

}
