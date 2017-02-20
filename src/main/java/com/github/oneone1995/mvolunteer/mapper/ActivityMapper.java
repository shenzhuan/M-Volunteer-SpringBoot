package com.github.oneone1995.mvolunteer.mapper;

import com.github.oneone1995.mvolunteer.domain.HomeActivity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wangl on 2017/2/19.
 */
@Mapper
public interface ActivityMapper {
    /**
     * 根据活动添加时间排序查询活动列表返回
     * 并根据参数中的经纬度求出距离并将其包装进HomeActivity中的mapper接口
     * @param coordLong 经度
     * @param coordLat  维度
     * @return  首页展示的活动列表
     */
    List<HomeActivity> selectAllOderByTime(
            @Param("coordLong") double coordLong, @Param("coordLat") double coordLat);

    List<HomeActivity> selectByActivityName(
            @Param("coordLong") double coordLong, @Param("coordLat") double coordLat,
            @Param("activityName") String activityName
    );
}
