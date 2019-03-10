package com.gupao.factory.abstractfactory;

import com.gupao.factory.IDoor;

public class PanPanDoor implements IDoor{
    @Override
    public void open() {
        System.out.println("打开盼盼门");
    }
}
