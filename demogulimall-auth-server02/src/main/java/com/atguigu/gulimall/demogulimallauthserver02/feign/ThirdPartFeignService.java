package com.atguigu.nrpt.demonrptauthserver02.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("nrpt-third-party")
public interface ThirdPartFeignService {

    @GetMapping("/sms/sendcode}")
    public R sendCode(@RequestParam("phone") String phone, @RequestParam("code")String code);
}
