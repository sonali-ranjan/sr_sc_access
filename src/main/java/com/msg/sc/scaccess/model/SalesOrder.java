package com.msg.sc.scaccess.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;
@JsonInclude(Include.NON_NULL)
public record SalesOrder(List<BusinessUnit> businessUnits,
                         String orderId,
                         String createdBy,
                         String pipelineRun,
                         Long salesOrderSeq,
                         Long processingUnit,
                         String modifiedBy,
                         Long etag,
                         Integer modelSeq) {
}
