package com.intellispace.controller;

import com.intellispace.model.Device;
import com.intellispace.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public @ResponseBody Device addDevice(@RequestBody Device device) throws Exception{
        logger.info("Start add devices");
        Device deviceStored = deviceService.addDevice(device);
        if (deviceStored.getId() == null){
            throw new Exception();
        }
        return deviceStored;
    }

    @RequestMapping(value = "/v1/devices", method = RequestMethod.GET)
    @ResponseBody
    public List<Device> getDevices(){
        List<Device> devices = deviceService.getDevices();
        return devices;
    }

    @RequestMapping(value = "/v1/device/{id}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void updateDevice(@PathVariable("id") Long deviceId, @RequestBody Device device) throws Exception{
        device.setId(deviceId);
        int resultCode = deviceService.updateDevice(device);
        if (resultCode == 0){
            throw new Exception();
        }
    }

    @RequestMapping(value = "/v1/device/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody void deleteDevice(@PathVariable("id") Long deviceId) throws Exception{
        int resultCode = deviceService.deleteDevice(deviceId);
        if (resultCode == 0){
            throw new Exception();
        }
    }
}
