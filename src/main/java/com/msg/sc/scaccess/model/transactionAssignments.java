package com.msg.sc.scaccess.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;
@JsonInclude(Include.NON_NULL)
public record transactionAssignments(//Long salesTransactionSeq,
                                     List<salesTransactionSeq> salesTransactionSeq,
                                     Long setNumber,
                                     String payeeId,
                                     String positionName,
                                     String titleName) {
}