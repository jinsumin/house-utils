package com.soomin.houseutils.policy;

/**
 * Created by soomin on 2022/04/28
 */

public interface BrokeragePolicy {
    BrokerageRule createBrokerageRule(Long price);

    default Long calculate(Long price) {
        BrokerageRule rule = createBrokerageRule(price);
        return rule.calcMaxBrokerage(price);
    }
}
