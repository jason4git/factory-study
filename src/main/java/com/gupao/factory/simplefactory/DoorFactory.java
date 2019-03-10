package com.gupao.factory.simplefactory;

import com.gupao.factory.IDoor;

/****
 * 简单工厂模式
 */
public class DoorFactory {
    public IDoor create(Class<? extends IDoor> clazz){
        if(null != clazz){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
