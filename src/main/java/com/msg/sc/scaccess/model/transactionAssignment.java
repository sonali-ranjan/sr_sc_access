package com.msg.sc.scaccess.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//@JsonInclude(Include.NON_NULL)
public record transactionAssignment(salesTransactionSeq salesTransactionSeq,
                                     Long setNumber,
                                     String payeeId,
                                     String positionName,
                                     String titleName
                                     ) {
}