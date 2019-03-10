package com.gupao.factory.abstractfactory;

import com.gupao.factory.IDoor;
import com.gupao.factory.ILock;

public interface AbsIDoorFactory {
    /**
     * 生产门
     * @return
     */
    IDoor createDoor();

    /**
     * 生产门锁
     * @return
     */
    ILock createLock();

}
