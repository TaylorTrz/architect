package com.inspur.architect.controller;

import com.inspur.architect.entity.ArchEntity;
import com.inspur.architect.service.ArchitectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * main
 *
 * @author taoruizhe
 * @date   2020/10/03  10:10
 */
@RestController
@Slf4j
public class architectController {
    @Autowired
    private ArchitectService architectService;


    /**
     * check app health status
     */
    @RequestMapping(method = RequestMethod.GET, value = "/v1/health")
    public ResponseEntity<ArchEntity> healthStatus() {
        ArchEntity archEntity = new ArchEntity(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), "architect app is running!");
        return new ResponseEntity<>(archEntity, HttpStatus.OK);
    }


    /**
     * <p>主功能1</p>
     * 完成定时任务提醒功能，预设定节日与出发目的地
     *
     * @author taoruizhe
     * @date   2020/10/03
     */
    public ResponseEntity<ArchEntity> scheduleWarning(@RequestBody String preCondition,
                                                    @RequestHeader(name = "Authorization") String zuulToken)
                                                    throws Throwable {
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
        architectService.scheduleWarning(preCondition, zuulToken);
        return null;
    }


    /**
     * <p>主功能2</p>
     * 完成刷新余票信息功能
     */


    /**
     * <p>主功能3</p>
     * 完成抢票动作并提示结果
     */
}
