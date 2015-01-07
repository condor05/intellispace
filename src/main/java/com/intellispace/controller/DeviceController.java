package com.intellispace.controller;

import com.intellispace.model.Device;
import com.intellispace.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: SHAWN
 * Date: 15-1-7
 */
@Controller
public class DeviceController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private DeviceService deviceService;

    @RequestMapping(value = "/v1/devices", method = RequestMethod.POST)
    public @ResponseBody Device addDevice(@RequestBody Device device) {
        logger.info("Start add devices");
        Device deviceStored = deviceService.addDevice(device);
        return deviceStored;
    }
}
