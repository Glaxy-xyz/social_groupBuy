
package io.sixlaws.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.sixlaws.common.utils.PageUtils;
import io.sixlaws.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
