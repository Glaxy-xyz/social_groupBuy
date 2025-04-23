
package io.sixlaws.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import io.sixlaws.common.utils.PageUtils;
import io.sixlaws.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
