package cn.com.lxk.springcloud.service.impl;

import java.util.List;

import cn.com.lxk.springcloud.dao.DeptDao;
import cn.com.lxk.springcloud.entity.Dept;
import cn.com.lxk.springcloud.service.DeptService;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}
