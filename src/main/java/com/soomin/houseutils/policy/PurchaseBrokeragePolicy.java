package com.soomin.houseutils.policy;

/**
 * Created by soomin on 2022/04/28
 * <p>
 * 매매일 때 중개수수료를 계산해주는 클래스
 */

public class PurchaseBrokeragePolicy implements BrokeragePolicy {

    public BrokerageRule createBrokerageRule(Long price) {
        BrokerageRule rule = null;
        if (price < 50_000_000) {
            rule = new BrokerageRule(0.6, 250_000L);
        }
        if (price >= 50_000_000 && price < 200_000_000) {
            rule = new BrokerageRule(0.5, 800_000L);
        }
        if (price >= 200_000_000 && price < 600_000_000) {
            rule = new BrokerageRule(0.4, null);
        }
        if (price >= 600_000_000 && price < 900_000_000) {
            rule = new BrokerageRule(0.5, null);
        }
        if (price >= 900_000_000) {
            rule = new BrokerageRule(0.9, null);
        }
        return rule;
    }
}
