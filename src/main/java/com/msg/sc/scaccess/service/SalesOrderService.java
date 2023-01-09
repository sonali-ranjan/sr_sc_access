package com.msg.sc.scaccess.service;

import com.msg.sc.scaccess.model.SalesOrder;
import com.msg.sc.scaccess.model.SalesOrderList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SalesOrderService {
    private final RestTemplate restTemplate;

    public SalesOrderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public SalesOrderList getSalesOrders() {
        return restTemplate.getForObject("/salesOrders", SalesOrderList.class);
    }

    public SalesOrder getSalesOrderById(Long salesOrderId) {
        return restTemplate.getForObject("/salesOrders(%s)".formatted(salesOrderId), SalesOrder.class);
    }

    public SalesOrderList createSalesOrder(List<SalesOrder> salesOrder) {
        return restTemplate.postForObject("/salesOrders", salesOrder, SalesOrderList.class);
    }
}
