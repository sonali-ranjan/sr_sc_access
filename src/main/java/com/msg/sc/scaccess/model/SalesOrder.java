package com.msg.sc.scaccess.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;
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
                         Integer modelSeq,
                         Date createDate,
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
                         Object genericNumber2,
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
                         Boolean genericBoolean6
                         ) {
}
