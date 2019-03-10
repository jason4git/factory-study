package com.gupao.factory.abstractfactory;

import com.gupao.factory.ILock;

public class ZhuChengLock implements ILock{
    @Override
    public void lock() {
        System.out.println("铸成锁");
    }
}
