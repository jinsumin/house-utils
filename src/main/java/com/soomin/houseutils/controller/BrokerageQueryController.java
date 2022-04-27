package com.soomin.houseutils.controller;

import com.soomin.houseutils.constants.ActionType;
import com.soomin.houseutils.policy.BrokeragePolicy;
import com.soomin.houseutils.policy.BrokeragePolicyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by soomin on 2022/04/28
 */

@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType,
                              @RequestParam Long price) {
        // TODO: 중개 수수료 계산하는 로직
        BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);
        return policy.calculate(price);
    }
}
