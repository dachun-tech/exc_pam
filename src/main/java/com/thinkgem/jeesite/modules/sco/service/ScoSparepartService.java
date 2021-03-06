/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sco.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.sco.entity.ScoFinalReport;
import com.thinkgem.jeesite.modules.sco.entity.ScoSparepart;
import com.thinkgem.jeesite.modules.sco.dao.ScoSparepartDao;
import com.thinkgem.jeesite.modules.sys.utils.DictUtils;

/**
 * 零配件维护Service
 * @author 段文昌
 * @version 2015-12-03
 */
@Service
@Transactional(readOnly = true)
public class ScoSparepartService extends CrudService<ScoSparepartDao, ScoSparepart> {

	public ScoSparepart get(String id) {
		return super.get(id);
	}
	
	public List<ScoSparepart> findList(ScoSparepart scoSparepart) {
		return super.findList(scoSparepart);
	}
	
	public Page<ScoSparepart> findPage(Page<ScoSparepart> page, ScoSparepart scoSparepart) {
		page.setOrderBy("a.create_date desc");
		return super.findPage(page, scoSparepart);
	}
	
	@Transactional(readOnly = false)
	public void save(ScoSparepart scoSparepart) {
		super.save(scoSparepart);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScoSparepart scoSparepart) {
		super.delete(scoSparepart);
	}
	
	
	
	/**
	 * 通过审核
	 * @param scoFinalReport
	 */
	@Transactional(readOnly = false)
	public void audit(ScoSparepart scoSparepart) {
		
		dao.updateState(scoSparepart);
	}
	
}