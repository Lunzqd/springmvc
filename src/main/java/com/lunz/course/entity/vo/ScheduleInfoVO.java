package com.lunz.course.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author al
 * @date 2019/11/27 10:36
 * @description
 */
@Data
public class ScheduleInfoVO implements Serializable {

    /**
     * 任务名称
     */
    private String jobName;

    /**
     * 触发器名称
     */
    private String triggerName;

    /**
     * 任务所在组名
     */
    private String jobGroupName;

    /**
     * 触发器所在组名
     */
    private String triggerGroupName;

    /**
     * 任务类名
     */
    private String jobClassName;

    /**
     * cron表达式
     */
    private String cron;

    /**
     * 任务状态（NONE: 不存在，NORMAL: 正常，PAUSED: 暂停，COMPLETE:完成，ERROR : 错误）
     */
    private String triggerStatus;

}
