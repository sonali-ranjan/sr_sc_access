package com.msg.sc.scaccess.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;
@JsonInclude(Include.NON_NULL)
public record salesTransactionSeq(List<SalesOrder> salesOrder,
                                  List<lineNumber> lineNUmber,
                                  List<subLineNumber> subLineNumber,
                                  List<eventType> eventType){
}