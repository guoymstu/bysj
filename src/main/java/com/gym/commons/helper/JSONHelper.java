package com.gym.commons.helper;



import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class JSONHelper {
    private static final Logger logger = LoggerFactory.getLogger(JSONHelper.class);


    /**
     * 对象转jsonStr
     * @param object
     * @return
     */
    public static String object2jsonStr(Object object){
        return JSON.toJSONString(object);
    }

}
