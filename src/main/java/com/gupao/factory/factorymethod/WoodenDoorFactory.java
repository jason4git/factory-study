package com.gupao.factory.factorymethod;

import com.gupao.factory.IDoor;
import com.gupao.factory.WoodenDoor;

public class WoodenDoorFactory implements IDoorFactory {

    @Override
    public IDoor create() {
        return new WoodenDoor();
    }
}
