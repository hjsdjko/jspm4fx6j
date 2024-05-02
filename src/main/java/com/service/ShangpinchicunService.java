package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinchicunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinchicunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinchicunView;


/**
 * 商品尺寸
 *
 * @author 
 * @email 
 * @date 2022-04-05 20:48:47
 */
public interface ShangpinchicunService extends IService<ShangpinchicunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinchicunVO> selectListVO(Wrapper<ShangpinchicunEntity> wrapper);
   	
   	ShangpinchicunVO selectVO(@Param("ew") Wrapper<ShangpinchicunEntity> wrapper);
   	
   	List<ShangpinchicunView> selectListView(Wrapper<ShangpinchicunEntity> wrapper);
   	
   	ShangpinchicunView selectView(@Param("ew") Wrapper<ShangpinchicunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinchicunEntity> wrapper);
   	

}

