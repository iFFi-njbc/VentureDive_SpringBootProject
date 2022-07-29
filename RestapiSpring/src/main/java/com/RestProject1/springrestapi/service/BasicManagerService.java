package com.RestProject1.springrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestProject1.springrestapi.model.Employee;
import com.RestProject1.springrestapi.model.Manager;
import com.RestProject1.springrestapi.repository.ManagerRepository;

@Service
public class BasicManagerService implements ManagerService{
	
	@Autowired
	private ManagerRepository mrepo;

	@Override
	public List<Manager> getManagers() {
		return mrepo.findAll();	}

	@Override
	public Manager saveManager(Manager m) {
		return mrepo.save(m);
	}

	@Override
	public Manager getManager(Long id) {
		Optional<Manager> m =  mrepo.findById(id);
		if(m.isPresent())
		{
			return m.get();
		}
		else
			throw new RuntimeException("Manager is not found for the ID : " + id);
	}
	

	@Override
	public void deleteManager(Long id) {
		mrepo.deleteById(id);
		
	}

	@Override
	public Manager updateManager(Manager m) {
		return mrepo.save(m);
	}

	@Override
	public Manager getManagerByNameAndId(String n, Long id) {
		return mrepo.findByNameAndId(n,id);
	}

}
