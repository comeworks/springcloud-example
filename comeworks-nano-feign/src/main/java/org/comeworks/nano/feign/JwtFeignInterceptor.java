package org.comeworks.nano.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class JwtFeignInterceptor implements RequestInterceptor {

    private final String key = "Authorization";


    @Override
    public void apply(RequestTemplate template) {

//        if (!template.headers().containsKey(key)) {
//            String currentToken = null;//UserUtils.getCurrentToken();
//            if (!StringUtils.isEmpty(currentToken)){
//                template.header(key, currentToken);
//            }
//        }
    }
}