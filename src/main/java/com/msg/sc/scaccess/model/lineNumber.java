package com.msg.sc.scaccess.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;
@JsonInclude(Include.NON_NULL)
public record lineNumber(int value, unitType unitType){
}