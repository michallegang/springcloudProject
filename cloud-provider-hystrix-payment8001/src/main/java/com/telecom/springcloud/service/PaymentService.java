package com.telecom.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Date：2020-11-09 10:39
 * Description：
 */
@Service
public class PaymentService {

    /**
     * 服务正常
     * @param id
     * @return
     */
    public String paymentInfo_ok(Integer id){
        return "线程池： " + Thread.currentThread().getName() + " PaymenyInfo_OK,id: " + id + "\t" + "O(∩_∩)O哈哈~";
    }

    /**
     * 服务超时
     * @param id
     * @return
     */
    public String paymentInfo_timeout(Integer id){
        int timeNumber = 3000;
        try {
            TimeUnit.MILLISECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： " + Thread.currentThread().getName() + " PaymenyInfo_TimeOut,id: " + id + "\t" + "O(∩_∩)O哈哈~" + " 耗时" + timeNumber + "毫秒";
    }


}
