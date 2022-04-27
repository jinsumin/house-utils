package com.soomin.houseutils.policy;

/**
 * Created by soomin on 2022/04/28
 * <p>
 * 임대차일 때 중개 수수료를 계산해주는 클래스
 */

public class RentBrokeragePolicy implements BrokeragePolicy {

    public BrokerageRule createBrokerageRule(Long price) {
        BrokerageRule rule = null;
        if (price < 50_000_000) {
            rule = new BrokerageRule(0.5, 200_000L);
        }
        if (price >= 50_000_000 && price < 100_000_000) {
            rule = new BrokerageRule(0.4, 300_000L);
        }
        if (price >= 100_000_000 && price < 300_000_000) {
            rule = new BrokerageRule(0.3, null);
        }
        if (price >= 300_000_000 && price < 600_000_000) {
            rule = new BrokerageRule(0.4, null);
        }
        if (price >= 600_000_000) {
            rule = new BrokerageRule(0.8, null);
        }
        return rule;
    }
}
