package com.four.security.token;

import com.four.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * token的校验
 * 该类继承自BasicAuthenticationFilter，在doFilterInternal方法中，
 * 从http头的Authorization 项读取token数据，然后用Jwts包提供的方法校验token的合法性。
 * 如果校验通过，就认为这是一个取得授权的合法请求，新建UsernamePasswordAuthenticationToken对象并存入SecurityContextHolder
 * ps：OncePerRequestFilter 抽象类是 BasicAuthenticationFilter 的父类。
 */
@Component
public class TokenAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    RedisUtil redisUtil;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            //获得头部Authorization信息
            String header = request.getHeader("Authorization");
            //若头部信息正确，则解压token得到username，并存入SecurityContextHolder。
            if (header != null && header.startsWith("Bearer ")) {
//                String username = Jwts.parser()
//                        .setSigningKey("MyKey")
//                        .parseClaimsJws((String) redisUtil.get("token"))
////                        .parseClaimsJws(header.replace("Bearer ", ""))//原来校验头部信息
//                        .getBody()
//                        .getSubject();
                final String authToken = header.substring(7); // 得到token
                if (authToken != null && redisUtil.hasKey(authToken)) {
                    String username = (String)redisUtil.get(authToken); //在redis中获得token对应的username
                    if (username != null) {
                        SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(username, null, new ArrayList<>()));
                    }
                }
            }
        } catch (Exception e) {
            logger.error("token格式不正确，非法操作！");
        } finally {
            chain.doFilter(request, response);
        }
    }
}