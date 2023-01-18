package com.msg.sc.scaccess.service;

import com.msg.sc.scaccess.controller.SalesTransactionController;
import com.msg.sc.scaccess.model.SalesTransaction;
import com.msg.sc.scaccess.model.SalesTransactionList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SalesTransactionService {
    private final RestTemplate restTemplate;

    public SalesTransactionService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public SalesTransactionList getSalesTransactions() {
        return restTemplate.getForObject("/salesTransactions", SalesTransactionList.class);
    }
/*
    public SalesTransaction getSalesTransactionById(Long salesTransactionId) {
        return restTemplate.getForObject("/SalesTransactions(%s)".formatted(salesTransactionId),
                SalesTransaction.class);
    }

    public SalesTransactionList createSalesTransaction(List<SalesTransaction> salesTransactions) {
        return restTemplate.postForObject("/salesTransactions", salesTransactions, SalesTransactionList.class);

    }
*/
}