package com.intellispace.persistence;

import com.intellispace.model.Device;
import com.intellispace.model.Employee;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SHAWN
 * Date: 15-1-7
 */
public interface DeviceMapper {
    Integer addDevice(Device device);
    List<Device> getDevices();
}
