package com.inspur.architect.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * main service
 *
 * @author taoruizhe
 * @date   2020/10/03  10:30
 */
@Service
@Slf4j
public class ArchitectService {
    public String scheduleWarning(String preCondition, String zuulToken) throws Exception{
        //******************************
        // 伪代码
        // uncrypted(zuulToken)
        // unboxing(preCondition)
        // getMap(festival)
        // getMap(destination + location)
        // getCalendar
        // time = calendar(festival - preTime)
        // sendMessage(zuulToken.user, time, festival, map(festival), map(destination + location))
        //******************************
        return "";
    }

}
