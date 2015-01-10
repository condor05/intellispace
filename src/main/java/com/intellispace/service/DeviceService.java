package com.intellispace.service;

import com.intellispace.model.Device;
import com.intellispace.model.Employee;
import com.intellispace.persistence.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        deviceMapper.addDevice(device);
        return device;
    }

    @Transactional
    public List<Device> getDevices(){
        return deviceMapper.getDevices();
    }

    @Transactional
    public int updateDevice(Device device){
         return deviceMapper.updateDevice(device);
    }

    @Transactional
    public int deleteDevice(Long id){
        return deviceMapper.deleteDevice(id);
    }
}
