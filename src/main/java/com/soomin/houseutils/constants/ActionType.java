package com.soomin.houseutils.constants;

import lombok.AllArgsConstructor;

/**
 * Created by soomin on 2022/04/28
 */

@AllArgsConstructor
public enum ActionType {
    PURCHASE("매매"),
    RENT("임대차");

    private final String description;
}
