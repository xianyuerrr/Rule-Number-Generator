package com.xianyue.common.rulenumbergenerator.interfaces.controller;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.xianyue.common.exception.CommonException;
import com.xianyue.common.rulenumbergenerator.domain.test.repository.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

/**
 * 测试 Controller
 *
 * @author bishenbo
 * @date Created in 2023-06-11 19:35
 */
@Slf4j
@RequestMapping("/bi")
@RestController
public class TestController {
    @Autowired
    private UserDao userDao;

    /**
     * 测试方法
     *
     * @param who 测试参数
     * @return {@link Dict}
     */
    @GetMapping("/test")
    public Dict test(String who) {
        if (StrUtil.isBlank(who)) {
            throw new CommonException("100002");
        }
        return Dict.create().set("who", StrUtil.isBlank(who) ? "me" : who);
    }

    /**
     *  测试post json方法
     * @param map 请求的json参数
     * @return {@link Dict}
     */
    @PostMapping("/testJson")
    public Dict testJson(@RequestBody Map<String, Object> map) {

        final String jsonStr = JSONUtil.toJsonStr(map);
        log.info(jsonStr);
        return Dict.create().set("json", map);
    }
}
