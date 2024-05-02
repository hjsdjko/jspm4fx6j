package com.dao;

import com.entity.ShangpinchicunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinchicunVO;
import com.entity.view.ShangpinchicunView;


/**
 * 商品尺寸
 * 
 * @author 
 * @email 
 * @date 2022-04-05 20:48:47
 */
public interface ShangpinchicunDao extends BaseMapper<ShangpinchicunEntity> {
	
	List<ShangpinchicunVO> selectListVO(@Param("ew") Wrapper<ShangpinchicunEntity> wrapper);
	
	ShangpinchicunVO selectVO(@Param("ew") Wrapper<ShangpinchicunEntity> wrapper);
	
	List<ShangpinchicunView> selectListView(@Param("ew") Wrapper<ShangpinchicunEntity> wrapper);

	List<ShangpinchicunView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinchicunEntity> wrapper);
	
	ShangpinchicunView selectView(@Param("ew") Wrapper<ShangpinchicunEntity> wrapper);
	

}
