package com.atguigu.nrpt.thirdpart.service;

import com.atguigu.nrpt.thirdpart.config.MyAccess;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface SendSms {
    public boolean send(MyAccess access,String phoneNum, String code);
}
