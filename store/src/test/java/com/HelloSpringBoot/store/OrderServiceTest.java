package com.HelloSpringBoot.store;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class OrderServiceTest {
    @Test
    void checkPaymentService(){
        PaymentService mockPaymentService = mock(PaymentService.class);
        OrderService orderService=new OrderService(mockPaymentService);
        orderService.placeOrder();
    }

}
