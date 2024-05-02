package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShangpinchicunDao;
import com.entity.ShangpinchicunEntity;
import com.service.ShangpinchicunService;
import com.entity.vo.ShangpinchicunVO;
import com.entity.view.ShangpinchicunView;

@Service("shangpinchicunService")
public class ShangpinchicunServiceImpl extends ServiceImpl<ShangpinchicunDao, ShangpinchicunEntity> implements ShangpinchicunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinchicunEntity> page = this.selectPage(
                new Query<ShangpinchicunEntity>(params).getPage(),
                new EntityWrapper<ShangpinchicunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinchicunEntity> wrapper) {
		  Page<ShangpinchicunView> page =new Query<ShangpinchicunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinchicunVO> selectListVO(Wrapper<ShangpinchicunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinchicunVO selectVO(Wrapper<ShangpinchicunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinchicunView> selectListView(Wrapper<ShangpinchicunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinchicunView selectView(Wrapper<ShangpinchicunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
