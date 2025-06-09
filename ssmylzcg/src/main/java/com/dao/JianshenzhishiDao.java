package com.dao;

import com.entity.JianshenzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenzhishiVO;
import com.entity.view.JianshenzhishiView;


/**
 * 健身知识
 * 
 * @author 
 * @email 
 * @date 2021-01-22 17:14:52
 */
public interface JianshenzhishiDao extends BaseMapper<JianshenzhishiEntity> {
	
	List<JianshenzhishiVO> selectListVO(@Param("ew") Wrapper<JianshenzhishiEntity> wrapper);
	
	JianshenzhishiVO selectVO(@Param("ew") Wrapper<JianshenzhishiEntity> wrapper);
	
	List<JianshenzhishiView> selectListView(@Param("ew") Wrapper<JianshenzhishiEntity> wrapper);

	List<JianshenzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenzhishiEntity> wrapper);
	
	JianshenzhishiView selectView(@Param("ew") Wrapper<JianshenzhishiEntity> wrapper);
	
}
