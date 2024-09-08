package com.java.modularmonoloth.news.enumrations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NewsStatuses {
    ACTIVE(1), INACTIVE(0);
    private final int value;
}
