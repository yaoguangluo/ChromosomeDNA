package org.deta.pixes.process;
//2.1 像素的区间定义
//2.2 像素的主要颜色区间
//2.3 像素的特殊颜色区间
//2.4 像素的特征颜色的区间
//2.5 像素的区间提取

//在设计这个api之前，我的德塔数据预测包已经有了像素的坐标存储函数
//AMV_MVS_VSQ_2D，2维坐标，对应图片中像素的坐标。
//那就开始了
//作者 罗瑶光
public class RangeProcess{
	
	//2.1 像素的区间定义
	//首先，我需要一个图片，然后从图片中读取标准的三原色，和它的总数和区间定义规范。
	
	//2.2 像素的主要颜色区间
	//关于像素的主要颜色 我定位在七彩色，红橙黄绿青靛紫 区间定义规范。
	
	//2.3 像素的特殊颜色区间
	//关于像素的主要颜色 我定位在21颜色阶， 浅红深， 浅橙深， 浅黄深， 浅绿深， 浅青深， 浅靛深， 浅紫深 ,区间定义规范。
	
	//2.4 像素的特征颜色的区间
	//关于像素的特征颜色 我定位在输入某一个rgb ，某一个颜色阶段， 某一个区间，输出需求的颜色统计。区间定义规范。
	
	//2.5 像素的区间提取
	//输入一个区间，得到这个区间的像素总数。和区间的涉及，或者涉及区间的内的像素统计分类。
	
	//2.6 区间的增量设计
	//如设计一个 增量[x， 那么0 ,x，2x，3x，4x.....nx, 255]然后增量区间划分。
	
	
	
}
