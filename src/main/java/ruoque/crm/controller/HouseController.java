package ruoque.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ruoque.crm.service.HouseManager;

import javax.annotation.Resource;

/**
 * Created by liangyu on 9/23/15.
 */
@Controller
@RequestMapping(value = "/house")
public class HouseController {
    @Resource
    private HouseManager houseManager;

    public void setHouseManager(HouseManager houseManager) {
        this.houseManager = houseManager;
    }


}
