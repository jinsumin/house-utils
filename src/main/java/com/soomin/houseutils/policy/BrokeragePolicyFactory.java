package com.soomin.houseutils.policy;

import com.soomin.houseutils.constants.ActionType;

/**
 * Created by soomin on 2022/04/28
 */

public class BrokeragePolicyFactory {

    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType) {
            case RENT:
                return new RentBrokeragePolicy();
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            default:
                throw new IllegalArgumentException("해당 actionType 에 대한 정책이 존재하지 않습니다.");
        }
    }
}
