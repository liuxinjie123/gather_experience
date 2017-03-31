package com.experience.service;

import com.experience.dto.User;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class MapToObjectTest {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 1);
        map.put("name", "liuxinjie");
        map.put("phone", "15618177577");
        try {
            User user = new User();
            BeanUtils.populate(user, map);
            System.out.println(user.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
