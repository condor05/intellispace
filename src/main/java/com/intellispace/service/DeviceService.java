package com.intellispace.service;

import com.intellispace.model.Device;
import com.intellispace.persistence.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: SHAWN
 * Date: 15-1-7
 */
@Service
public class DeviceService {
    @Autowired
    private DeviceMapper deviceMapper;

    @Transactional
    public Device addDevice(Device device){
        //TODO replace this with db persistence
        Device device1 = new Device();
        device1.setId(11l);
        return device1;
    }
}
