package com.atguigu.nrpt.demonrptauthserver02.feign;

import com.atguigu.common.to.SocialUser;
import com.atguigu.common.utils.R;
import com.atguigu.nrpt.demonrptauthserver02.vo.UserLoginVo;
import com.atguigu.nrpt.demonrptauthserver02.vo.UserRegistVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("nrpt-member")
public interface MemberFeignService {

    @PostMapping("/member/member/regist")
    R regist(@RequestBody UserRegistVo vo);

    @PostMapping("/member/member/login")
    R login(@RequestBody UserLoginVo vo);

    @PostMapping("/member/member/oauth2/login")
    R SocialLogin(@RequestBody SocialUser vo) throws Exception;
}
