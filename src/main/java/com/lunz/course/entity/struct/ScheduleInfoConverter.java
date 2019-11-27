package com.lunz.course.entity.struct;

import com.lunz.course.entity.domain.ScheduleInfo;
import com.lunz.course.entity.vo.ScheduleInfoVO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author al
 * @date 2019/8/22 16:50
 * @description
 */
@Mapper(componentModel = "spring")
public interface ScheduleInfoConverter {

    ScheduleInfo scheduleInfoVoToDo(ScheduleInfoVO vo);

    List<ScheduleInfo> scheduleInfoVoToDos(List<ScheduleInfoVO> vos);

}
