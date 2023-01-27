package com.msg.sc.scaccess.model;

import java.util.Date;
import java.util.List;

//@JsonInclude(Include.NON_NULL)

public record SalesTransactionP(String salesTransactionSeq,
                                    SalesOrder salesOrder,
                                    lineNumber lineNumber,
                                    subLineNumber subLineNumber,
                                    eventType eventType,
                                    long modelSeq,
                                    //String originTypeId, -- as per API doc
                                    //Boolean isRunnable, -- as per API doc
                                    Boolean accountingDate,
                                    String productId,
                                    String productName,
                                    String productDescription,
                                    Object numberOfUnits,
                                    Object unitValue,
                                    Date compensationDate,
                                    preadjustedValue preadjustedValue,
                                    genericNumber2 genericNumber2,
                                    value value,
                                    Object nativeCurrencyAmount,
                                    DiscountPercent discountPercent,
                                    String discountType,
                                    String paymentTerms,
                                    Object poNumber,
                                    Object channel,
                                    String alternateOrderNumber,
                                    Object dataSource,
                                    String reason,
                                    String comments,
                                    Object billToAddress,
                                    Object shipToAddress,
                                    Object otherToAddress,
                                    String genericAttribute1,
                                    String genericAttribute2,
                                    String genericAttribute3,
                                    String genericAttribute4,
                                    String genericAttribute5,
                                    String genericAttribute6,
                                    String genericAttribute7,
                                    String genericAttribute8,
                                    String genericAttribute9,
                                    String genericAttribute10,
                                    String genericAttribute11,
                                    String genericAttribute12,
                                    String genericAttribute13,
                                    String genericAttribute14,
                                    String genericAttribute15,
                                    String genericAttribute16,
                                    Object genericNumber1,
                                    Object genericNumber3,
                                    Object genericNumber4,
                                    Object genericNumber5,
                                    Object genericNumber6,
                                    Date genericDate1,
                                    Date genericDate2,
                                    Date genericDate3,
                                    Date genericDate4,
                                    Date genericDate5,
                                    Date genericDate6,
                                    Boolean genericBoolean1,
                                    Boolean genericBoolean2,
                                    Boolean genericBoolean3,
                                    Boolean genericBoolean4,
                                    Boolean genericBoolean5,
                                    Boolean genericBoolean6,
                                    List<transactionAssignment> transactionAssignments,
                                    List<BusinessUnit> businessUnits

) {

}