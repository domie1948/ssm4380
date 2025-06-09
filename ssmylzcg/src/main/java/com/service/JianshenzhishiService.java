package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenzhishiView;


/**
 * 健身知识
 *
 * @author 
 * @email 
 * @date 2021-01-22 17:14:52
 */
public interface JianshenzhishiService extends IService<JianshenzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenzhishiVO> selectListVO(Wrapper<JianshenzhishiEntity> wrapper);
   	
   	JianshenzhishiVO selectVO(@Param("ew") Wrapper<JianshenzhishiEntity> wrapper);
   	
   	List<JianshenzhishiView> selectListView(Wrapper<JianshenzhishiEntity> wrapper);
   	
   	JianshenzhishiView selectView(@Param("ew") Wrapper<JianshenzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenzhishiEntity> wrapper);
   	
}

