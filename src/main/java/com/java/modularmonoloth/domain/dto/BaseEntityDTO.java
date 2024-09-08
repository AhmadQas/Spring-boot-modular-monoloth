package com.java.modularmonoloth.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class BaseEntityDTO {

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    private String createdBy;

    private String updatedBy;
}
