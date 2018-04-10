package xin.scoutzhang.constant;

/**
 * Created by DEAN on 2018/4/10.
 */
public enum Code {
    UNDEFINED(1000,"未定义失败");

    private int code;
    private String message;

    Code(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
