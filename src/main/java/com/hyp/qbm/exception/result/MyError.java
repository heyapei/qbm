package com.hyp.qbm.exception.result;

import lombok.Data;

/**
 * @author 何亚培
 * @version V1.0
 * @Date 2020/4/15 18:08
 * @Description: TODO
 */
@Data
public class MyError {
    private Integer errorCode;
    private String codeMsg;
    private String errorMsg;

    public MyError() {
    }

    public MyError(Integer errorCode, String codeMsg, String errorMsg) {
        this.errorCode = errorCode;
        this.codeMsg = codeMsg;
        this.errorMsg = errorMsg;
    }

    public static MyError requestErrorInit() {
        MyError myError = new MyError();
        myError.setErrorCode(400);
        myError.setCodeMsg("遇到了错误");
        myError.setErrorMsg("服务器你已经长大了，你应该学会解决问题了~~~(^v^)~~~");
        return myError;
    }
}
