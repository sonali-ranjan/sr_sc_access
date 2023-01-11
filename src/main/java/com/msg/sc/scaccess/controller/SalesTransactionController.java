package com.msg.sc.scaccess.controller;

import com.msg.sc.scaccess.model.salesTransaction;
import com.msg.sc.scaccess.model.salesTransactionList;
import com.msg.sc.scaccess.service.SalesTransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesTransactionController {

    private final SalesTransactionService SalesTransactionService;

    public SalesTransactionController(SalesTransactionService SalesTransactionService) {
        this.SalesTransactionService = SalesTransactionService;

    }

    @GetMapping()
    public salesTransactionList getSalesTransactions() {
        return SalesTransactionService.getSalesTransactions();
    }

    @GetMapping()
    public salesTransaction getSalesTransactions(@PathVariable("id") Long salesTransactionId) {
        return SalesTransactionService.getSalesTransactionById(salesTransactionId);
    }

    @PostMapping()
    public salesTransactionList createSalesTransactions(@RequestBody List<salesTransaction> salesTransactions) {
        return SalesTransactionService.createSalesTransaction(salesTransactions);
    }
}