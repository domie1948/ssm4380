package com.entity.model;

import com.entity.JianshenshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 健身商品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-22 17:14:52
 */
public class JianshenshangpinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品种类
	 */
	
	private String shangpinzhonglei;
		
	/**
	 * 商品图片
	 */
	
	private String shangpintupian;
		
	/**
	 * 商品价格
	 */
	
	private Integer shangpinjiage;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 作用
	 */
	
	private String zuoyong;
		
	/**
	 * 保质期
	 */
	
	private String baozhiqi;
		
	/**
	 * 商品详情
	 */
	
	private String shangpinxiangqing;
				
	
	/**
	 * 设置：商品种类
	 */
	 
	public void setShangpinzhonglei(String shangpinzhonglei) {
		this.shangpinzhonglei = shangpinzhonglei;
	}
	
	/**
	 * 获取：商品种类
	 */
	public String getShangpinzhonglei() {
		return shangpinzhonglei;
	}
				
	
	/**
	 * 设置：商品图片
	 */
	 
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
				
	
	/**
	 * 设置：商品价格
	 */
	 
	public void setShangpinjiage(Integer shangpinjiage) {
		this.shangpinjiage = shangpinjiage;
	}
	
	/**
	 * 获取：商品价格
	 */
	public Integer getShangpinjiage() {
		return shangpinjiage;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：作用
	 */
	 
	public void setZuoyong(String zuoyong) {
		this.zuoyong = zuoyong;
	}
	
	/**
	 * 获取：作用
	 */
	public String getZuoyong() {
		return zuoyong;
	}
				
	
	/**
	 * 设置：保质期
	 */
	 
	public void setBaozhiqi(String baozhiqi) {
		this.baozhiqi = baozhiqi;
	}
	
	/**
	 * 获取：保质期
	 */
	public String getBaozhiqi() {
		return baozhiqi;
	}
				
	
	/**
	 * 设置：商品详情
	 */
	 
	public void setShangpinxiangqing(String shangpinxiangqing) {
		this.shangpinxiangqing = shangpinxiangqing;
	}
	
	/**
	 * 获取：商品详情
	 */
	public String getShangpinxiangqing() {
		return shangpinxiangqing;
	}
			
}
