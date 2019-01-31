package com.aaa.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.aaa.biz.RepostBiz;
import com.aaa.entity.Repost;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 *@class_name：PostController 
 *@param: 6.controller控制层
 *@return: 实现业务逻辑控制
 *@author:Zoutao
 *@createtime:2018年3月22日
 */
@Controller
@RequestMapping("/repost")
public class RepostController {
	
	@Autowired
	private RepostBiz repostBiz;
	
	
	//分页查询数据
	@RequestMapping("/queryRepost")
	public String queryPost(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
		//1.引入分页插件,pn是第几页，5是每页显示多少行
		PageHelper.startPage(pn,5);
		//2.紧跟的查询就是一个分页查询
		List<Repost>list =repostBiz.findAllRepost();
		//3.使用PageInfo包装查询后的结果,5是连续显示的条数
		PageInfo<Repost> pageInfo =new PageInfo<Repost>(list,5);
		//4.使用model设置到前端
		model.addAttribute("pageInfo",pageInfo);
		//5.最后设置返回的jsp
		return "showRepost";
		
	}
	
	// 添加帖子
	@RequestMapping("/addRepost")
	public String addRepost(Repost repost,MultipartFile post_pic,HttpServletRequest request,HttpServletResponse response) throws IllegalStateException, IOException{
		/**
		//设置图片上传的路径
		String path =request.getServletContext().getRealPath("/upload");
		System.out.println("上传路径是：" + path);
		
		// 获取图片文件名
		String pic_name = post_pic.getOriginalFilename();
		System.out.println("原文件名是：" + pic_name);
		
		// 为了防止上传同名图片导致覆盖文件，引入随机数UUID解决。
		String newname = UUID.randomUUID().toString() + pic_name.substring(pic_name.lastIndexOf("."));
		System.out.println("新文件名是:" + newname);

		// 创建文件流对象picfile
		File picFile = new File(path, newname);
		System.out.println("文件流为：" + picFile);
		
		// 如果不存在则创建
		if (!picFile.exists()) {
			picFile.mkdirs();
			}
		post_pic.transferTo(picFile);
		post.setPic(newname);
			// 添加进去
		*/
		repostBiz.add(repost);
			// 内部转发
		return "redirect:queryRepost.action";
	}

	//删除帖子
	@RequestMapping("/del")
	public String del(int id){
		repostBiz.del(id);
		return "redirect:queryRepost.action";
	}
	

	//修改数据
	@RequestMapping("/upd")
	public String upd(Repost repost,MultipartFile post_pic1,HttpServletRequest request) throws IllegalStateException, IOException{
		/**
		//拿到单条数据
		post.setPic(postBiz.findOne(post.getId()).getPic());
		// 拿到该条数据的图片路径和名字
		String path = request.getServletContext().getRealPath("/upload");
		String pic_name = post_pic1.getOriginalFilename();
		
		//修改以后做新判断
		if (post_pic1 != null && pic_name != null && pic_name.length() > 0) {
			String newname = UUID.randomUUID().toString() + pic_name.substring(pic_name.lastIndexOf("."));
			File picFile = new File(path, newname);
			//文件夹不存在就创建 
			if (!picFile.exists()) {
				picFile.mkdirs();
			}
			post_pic1.transferTo(picFile);
			post.setPic(newname);
		}
		*/
		//修改完成以后调用更新方法
		repostBiz.upd(repost);
		
		return "redirect:queryRepost.action";
	}
	
}
