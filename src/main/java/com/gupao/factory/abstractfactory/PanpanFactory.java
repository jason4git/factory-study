package com.gupao.factory.abstractfactory;

import com.gupao.factory.IDoor;
import com.gupao.factory.ILock;

/**
 * 盼盼工厂
 */
public class PanpanFactory implements AbsIDoorFactory{
    @Override
    public IDoor createDoor() {
        return new PanPanDoor();
    }

    @Override
    public ILock createLock() {
        return new PanPanLock();
    }
}
