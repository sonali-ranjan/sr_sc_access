package com.msg.sc.scaccess.controller;

import com.msg.sc.scaccess.model.SalesTransaction;
import com.msg.sc.scaccess.model.SalesTransactionList;
import com.msg.sc.scaccess.service.SalesTransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesTransactionController {

    private final SalesTransactionService SalesTransactionService;

    public SalesTransactionController(SalesTransactionService SalesTransactionService) {
        this.SalesTransactionService = SalesTransactionService;

    }

    @GetMapping("/salesTransactions")
    public SalesTransactionList getSalesTransactions() {
        return SalesTransactionService.getSalesTransactions();
    }
/*
    @GetMapping("/SalesTransactions(%s)")
    public SalesTransaction getSalesTransactions(@PathVariable("id") Long salesTransactionId) {
        return SalesTransactionService.getSalesTransactionById(salesTransactionId);
    }

    @PostMapping("/salesTransactions")
    public SalesTransactionList createSalesTransactions(@RequestBody List<SalesTransaction> salesTransactions) {
        return SalesTransactionService.createSalesTransaction(salesTransactions);
    }

*/
}