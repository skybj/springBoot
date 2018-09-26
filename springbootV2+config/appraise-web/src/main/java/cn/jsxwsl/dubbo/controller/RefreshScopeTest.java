package cn.jsxwsl.dubbo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RefreshScopeTest {
	@Value("${hello}")
    String hello;

}
