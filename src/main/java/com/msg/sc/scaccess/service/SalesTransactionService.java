package com.msg.sc.scaccess.service;

import com.msg.sc.scaccess.model.salesTransaction;
import com.msg.sc.scaccess.model.salesTransactionList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SalesTransactionService {
    private final RestTemplate restTemplate;

    public SalesTransactionService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public salesTransactionList getSalesTransactions() {
        return restTemplate.getForObject("/SalesTransactions", salesTransactionList.class);
    }

    public salesTransaction getSalesTransactionById(Long salesTransactionId) {
        return restTemplate.getForObject("/SalesTransactions(%s)".formatted(salesTransactionId),
                salesTransaction.class);
    }

    public salesTransactionList createSalesTransaction(List<salesTransaction> salesTransactions) {
        return restTemplate.postForObject("/salesTransaction", salesTransactions, salesTransactionList.class);
    }
}
