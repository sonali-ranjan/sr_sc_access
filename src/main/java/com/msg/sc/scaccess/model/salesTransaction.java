package com.msg.sc.scaccess.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;
import java.util.List;
@JsonInclude(Include.NON_NULL)

public record salesTransaction(List<SalesOrder> SalesOrder,
                               List<lineNumber> lineNumber,
                               List<subLineNumber> subLineNumber,
                               List<eventType> eventType,
                              // List<preadjustedValue> preadjustedValue,---typo
                               List<genericNumber2> genericNumber2,
                               List<value> value,
                               List<BusinessUnit> businessUnits,
                               List<transactionAssignments> transactionAssignments,
                               List<salesTransactionSeq> salesTransactionSeq,
                               List<discountPercent> discountPercent,
                               Date compensationDate,
                               long modelSeq,
                               String originTypeId,
                               Boolean isRunnable,
                               Boolean accountingDate,
                               String productId,
                               String productName,
                               String productDescription,
                               // Object numberOfUnits,
                               //Object unitValue,
                               // Object nativeCurrencyAmount,
                               // Object discountPercent,
                               String discountType,
                               String paymentTerms,
                               //Object poNumber,
                               //Object channel,-- check for type
                               String alternateOrderNumber,
                               //Object dataSource,
                               String reason,
                               String comments,
                               //Object billToAddress,
                               //Object shipToAddress,
                               //Object otherToAddress,
                               String genericAttribute1,
                               String genericAttribute2,
                               String genericAttribute3,
                               String genericAttribute4,
                               String genericAttribute5,
                               String genericAttribute6,
                               String genericAttribute7,
                               String genericAttribute8,
                               //Object genericNumber3,
                               // Object genericNumber4,
                               Date genericDate1,
                               Date genericDate2,
                               Date genericDate3,
                               Date genericDate4,
                               Boolean genericBoolean1,
                               Boolean genericBoolean2,
                               Long processingUnit,
                               Date modificationDate,
                               long pipelineRun,
                               String nativeCurrency) {
}