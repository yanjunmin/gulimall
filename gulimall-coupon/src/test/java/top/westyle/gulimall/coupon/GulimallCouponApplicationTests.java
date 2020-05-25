package top.westyle.gulimall.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
    }

}
