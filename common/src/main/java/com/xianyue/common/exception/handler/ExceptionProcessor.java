package com.xianyue.common.exception.handler;

import cn.hutool.core.collection.CollectionUtil;
import com.xianyue.common.core.response.ApiResponse;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @Title: ExceptionProcessor
 * @Package: com.xianyue.common.exception.handler
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/17 13:57
 */
@Component
public class ExceptionProcessor implements ApplicationContextAware {
    @Autowired
    private List<ExceptionHandler> exceptionHandlerList;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (CollectionUtil.isNotEmpty(exceptionHandlerList)) {
            this.exceptionHandlerList.sort(Comparator.comparingInt(ExceptionHandler::order));
        }
    }

    public ApiResponse handleException(Exception exception) {
        if (Objects.isNull(exceptionHandlerList)) {
            return new ApiResponse();
        }
        ExceptionHandler exceptionHandler;
        Iterator<ExceptionHandler> iterator = exceptionHandlerList.iterator();
        do {
            if (!iterator.hasNext()) {
                return new ApiResponse();
            }
            exceptionHandler = iterator.next();
        } while (!exceptionHandler.isSupport(exception));
        return exceptionHandler.handleException(exception);
    }
}
