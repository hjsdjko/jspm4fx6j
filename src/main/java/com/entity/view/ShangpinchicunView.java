package com.entity.view;

import com.entity.ShangpinchicunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品尺寸
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-05 20:48:47
 */
@TableName("shangpinchicun")
public class ShangpinchicunView  extends ShangpinchicunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinchicunView(){
	}
 
 	public ShangpinchicunView(ShangpinchicunEntity shangpinchicunEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinchicunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
