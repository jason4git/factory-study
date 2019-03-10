package com.gupao.factory.abstractfactory;

import com.gupao.factory.IDoor;
import com.gupao.factory.ILock;

/**
 * 铸成工程
 */
public class ZhuchengFactory implements AbsIDoorFactory{
    @Override
    public IDoor createDoor() {
        return new ZhuChengDoor();
    }

    @Override
    public ILock createLock() {
        return new ZhuChengLock();
    }
}
