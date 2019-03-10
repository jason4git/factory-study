package com.gupao.factory.factorymethod;

import com.gupao.factory.IDoor;
import com.gupao.factory.SecurityDoor;

public class SecurityDoorFactory implements IDoorFactory{

    @Override
    public IDoor create() {
        return new SecurityDoor();
    }
}
