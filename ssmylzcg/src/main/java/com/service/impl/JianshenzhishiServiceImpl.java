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


import com.dao.JianshenzhishiDao;
import com.entity.JianshenzhishiEntity;
import com.service.JianshenzhishiService;
import com.entity.vo.JianshenzhishiVO;
import com.entity.view.JianshenzhishiView;

@Service("jianshenzhishiService")
public class JianshenzhishiServiceImpl extends ServiceImpl<JianshenzhishiDao, JianshenzhishiEntity> implements JianshenzhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenzhishiEntity> page = this.selectPage(
                new Query<JianshenzhishiEntity>(params).getPage(),
                new EntityWrapper<JianshenzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenzhishiEntity> wrapper) {
		  Page<JianshenzhishiView> page =new Query<JianshenzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianshenzhishiVO> selectListVO(Wrapper<JianshenzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianshenzhishiVO selectVO(Wrapper<JianshenzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianshenzhishiView> selectListView(Wrapper<JianshenzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenzhishiView selectView(Wrapper<JianshenzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
