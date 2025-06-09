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


import com.dao.JianshenshangpinDao;
import com.entity.JianshenshangpinEntity;
import com.service.JianshenshangpinService;
import com.entity.vo.JianshenshangpinVO;
import com.entity.view.JianshenshangpinView;

@Service("jianshenshangpinService")
public class JianshenshangpinServiceImpl extends ServiceImpl<JianshenshangpinDao, JianshenshangpinEntity> implements JianshenshangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenshangpinEntity> page = this.selectPage(
                new Query<JianshenshangpinEntity>(params).getPage(),
                new EntityWrapper<JianshenshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenshangpinEntity> wrapper) {
		  Page<JianshenshangpinView> page =new Query<JianshenshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianshenshangpinVO> selectListVO(Wrapper<JianshenshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianshenshangpinVO selectVO(Wrapper<JianshenshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianshenshangpinView> selectListView(Wrapper<JianshenshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenshangpinView selectView(Wrapper<JianshenshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
