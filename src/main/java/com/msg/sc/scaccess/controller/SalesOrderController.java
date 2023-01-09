package com.msg.sc.scaccess.controller;

import com.msg.sc.scaccess.model.SalesOrder;
import com.msg.sc.scaccess.model.SalesOrderList;
import com.msg.sc.scaccess.service.SalesOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesOrderController {


    private final SalesOrderService salesOrderService;

    public SalesOrderController(SalesOrderService salesOrderService) {
        this.salesOrderService = salesOrderService;

    }

    @GetMapping("/salesOrders")
    public SalesOrderList getSalesOrders() {
        return salesOrderService.getSalesOrders();
    }

    @GetMapping("/salesOrders/{id}")
    public SalesOrder getSalesOrder(@PathVariable("id") Long salesOrderId) {
        return salesOrderService.getSalesOrderById(salesOrderId);
    }

    @PostMapping("/salesOrders")
    public SalesOrderList createSalesOrder(@RequestBody List<SalesOrder> salesOrder) {
        return salesOrderService.createSalesOrder(salesOrder);
    }
}
