package com.gupao.factory.abstractfactory;

import com.gupao.factory.ILock;

public class PanPanLock implements ILock{
    @Override
    public void lock() {
        System.out.println("盼盼锁");
    }
}
