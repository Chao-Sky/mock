package com.example.demo.test;


import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eason
 * @date 2021年07月30日 16:09
 */
@Slf4j
@RestController
@RequestMapping("/easonshary/mock")
public class MockController {

    @RequestMapping("/queryRefund")
    public Object queryRefund() {
        String respStr = "{\n" +
                "    \"code\": 0,\n" +
                "    \"message\": \"成功\",\n" +
                "\t\"content\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"refundStatus\":\"3\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";

        Object resp = JSON.parse(respStr);
        return resp;
    }
}
