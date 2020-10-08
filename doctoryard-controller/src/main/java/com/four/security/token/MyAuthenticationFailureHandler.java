package com.four.security.token;

import com.four.util.Result;
import com.four.util.ResultCode;
import com.four.util.ResultFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//认证失败
@Component
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {

    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException auth) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter print = response.getWriter();
        print.print("没有token或token已过期，请重新登录!");
        print.flush();
        print.close();
//        return ResultFactory.setResultError(ResultCode.HTTP_RES_CODE_500,"token已过期或重新登录");
    }
//    public Result onFailure(){
//        return ResultFactory.setResultError(ResultCode.HTTP_RES_CODE_500,"token已过期或重新登录");
//    }

}