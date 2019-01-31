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
 *@class_name��PostController 
 *@param: 6.controller���Ʋ�
 *@return: ʵ��ҵ���߼�����
 *@author:Zoutao
 *@createtime:2018��3��22��
 */
@Controller
@RequestMapping("/repost")
public class RepostController {
	
	@Autowired
	private RepostBiz repostBiz;
	
	
	//��ҳ��ѯ����
	@RequestMapping("/queryRepost")
	public String queryPost(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
		//1.�����ҳ���,pn�ǵڼ�ҳ��5��ÿҳ��ʾ������
		PageHelper.startPage(pn,5);
		//2.�����Ĳ�ѯ����һ����ҳ��ѯ
		List<Repost>list =repostBiz.findAllRepost();
		//3.ʹ��PageInfo��װ��ѯ��Ľ��,5��������ʾ������
		PageInfo<Repost> pageInfo =new PageInfo<Repost>(list,5);
		//4.ʹ��model���õ�ǰ��
		model.addAttribute("pageInfo",pageInfo);
		//5.������÷��ص�jsp
		return "showRepost";
		
	}
	
	// �������
	@RequestMapping("/addRepost")
	public String addRepost(Repost repost,MultipartFile post_pic,HttpServletRequest request,HttpServletResponse response) throws IllegalStateException, IOException{
		/**
		//����ͼƬ�ϴ���·��
		String path =request.getServletContext().getRealPath("/upload");
		System.out.println("�ϴ�·���ǣ�" + path);
		
		// ��ȡͼƬ�ļ���
		String pic_name = post_pic.getOriginalFilename();
		System.out.println("ԭ�ļ����ǣ�" + pic_name);
		
		// Ϊ�˷�ֹ�ϴ�ͬ��ͼƬ���¸����ļ������������UUID�����
		String newname = UUID.randomUUID().toString() + pic_name.substring(pic_name.lastIndexOf("."));
		System.out.println("���ļ�����:" + newname);

		// �����ļ�������picfile
		File picFile = new File(path, newname);
		System.out.println("�ļ���Ϊ��" + picFile);
		
		// ����������򴴽�
		if (!picFile.exists()) {
			picFile.mkdirs();
			}
		post_pic.transferTo(picFile);
		post.setPic(newname);
			// ��ӽ�ȥ
		*/
		repostBiz.add(repost);
			// �ڲ�ת��
		return "redirect:queryRepost.action";
	}

	//ɾ������
	@RequestMapping("/del")
	public String del(int id){
		repostBiz.del(id);
		return "redirect:queryRepost.action";
	}
	

	//�޸�����
	@RequestMapping("/upd")
	public String upd(Repost repost,MultipartFile post_pic1,HttpServletRequest request) throws IllegalStateException, IOException{
		/**
		//�õ���������
		post.setPic(postBiz.findOne(post.getId()).getPic());
		// �õ��������ݵ�ͼƬ·��������
		String path = request.getServletContext().getRealPath("/upload");
		String pic_name = post_pic1.getOriginalFilename();
		
		//�޸��Ժ������ж�
		if (post_pic1 != null && pic_name != null && pic_name.length() > 0) {
			String newname = UUID.randomUUID().toString() + pic_name.substring(pic_name.lastIndexOf("."));
			File picFile = new File(path, newname);
			//�ļ��в����ھʹ��� 
			if (!picFile.exists()) {
				picFile.mkdirs();
			}
			post_pic1.transferTo(picFile);
			post.setPic(newname);
		}
		*/
		//�޸�����Ժ���ø��·���
		repostBiz.upd(repost);
		
		return "redirect:queryRepost.action";
	}
	
}
