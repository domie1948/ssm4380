package com.entity.view;

import com.entity.JianshenzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-22 17:14:52
 */
@TableName("jianshenzhishi")
public class JianshenzhishiView  extends JianshenzhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianshenzhishiView(){
	}
 
 	public JianshenzhishiView(JianshenzhishiEntity jianshenzhishiEntity){
 	try {
			BeanUtils.copyProperties(this, jianshenzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
