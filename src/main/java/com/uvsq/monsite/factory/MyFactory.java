package com.uvsq.monsite.factory;

import java.util.Map;
import java.util.HashMap;

import com.uvsq.monsite.action.*;


public class MyFactory {
    public static Map<String, Class<? extends Action>> createActionMap() {
        Map<String, Class<? extends Action>> actionMap = new HashMap<>();
        actionMap.put("ActionDebut", ActionDebut.class);
        actionMap.put("ActionUn", ActionUn.class);
        actionMap.put("LoginAction", LoginAction.class);
        actionMap.put("LogoutAction", LogoutAction.class);
        return actionMap;
    }
}