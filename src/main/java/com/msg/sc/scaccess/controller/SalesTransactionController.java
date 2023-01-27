package com.msg.sc.scaccess.controller;

import com.msg.sc.scaccess.model.SalesTransaction;
import com.msg.sc.scaccess.model.SalesTransactionP;
import com.msg.sc.scaccess.model.SalesTransactionList;
import com.msg.sc.scaccess.model.SalesTransactionListP;
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

    //@GetMapping("/salesTransactions{id}")
    @GetMapping("/salesTransactions{id}")
    public SalesTransaction getSalesTransactions(@PathVariable("id") Long salesTransactionsSeq) {
        return SalesTransactionService.getSalesTransactionById(salesTransactionsSeq);
    }

    @PostMapping("/salesTransactions")
    public SalesTransactionListP createSalesTransactions(@RequestBody List<SalesTransactionP> salesTransactions) {
        return SalesTransactionService.createSalesTransaction(salesTransactions);
    }


}