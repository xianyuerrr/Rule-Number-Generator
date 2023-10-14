package com.xianyue.common.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Title: EvadAuditorAware
 * @Package: com.xianyue.common.audit
 * @Description:
 * @Author: xianyue
 * @Date: 2023/10/14 22:05
 */
@Component
public class EvadAuditorAware implements AuditorAware<Integer> {
    @Override
    public Optional<Integer> getCurrentAuditor() {
        // 该值将在执行insert或update语句时赋值给创建人和修改人字段
        // 如果有权限模块就可以通过权限上下文对象获取用户信息，再赋值了
        return Optional.of(-1);
    }
}

