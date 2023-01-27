package com.msg.sc.scaccess.service;

import com.msg.sc.scaccess.model.SalesTransaction;
import com.msg.sc.scaccess.model.SalesTransactionP;
import com.msg.sc.scaccess.model.SalesTransactionList;
import com.msg.sc.scaccess.model.SalesTransactionListP;
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

    public SalesTransaction getSalesTransactionById(Long salesTransactionsSeq) {
        return restTemplate.getForObject("/salesTransactions(%s)".formatted(salesTransactionsSeq),
                SalesTransaction.class);
    }

    public SalesTransactionListP createSalesTransaction(List<SalesTransactionP> salesTransactions) {
        return restTemplate.postForObject("/salesTransactions", salesTransactions, SalesTransactionListP.class);

    }

}