package com.example.zuul.api.zuulapigatewaydemo;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.codec.binary.Base64;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

import java.nio.charset.Charset;

@Configuration
public class AuthenticatedFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        String auth = "dani" + ":" + "dani";
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("ISO-8859-1")));
        String authValue = "Basic " + new String(encodedAuth);
        ctx.addZuulRequestHeader(HttpHeaders.AUTHORIZATION, authValue);
        return null;
    }
}
