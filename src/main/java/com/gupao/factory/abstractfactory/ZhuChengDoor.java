package com.gupao.factory.abstractfactory;

import com.gupao.factory.IDoor;

public class ZhuChengDoor implements IDoor{
    @Override
    public void open() {
        System.out.println("打开铸成门");
    }
}
