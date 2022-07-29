package com.RestProject1.springrestapi.service;

import java.util.List;

import com.RestProject1.springrestapi.model.Manager;



public interface ManagerService {
	
	public List<Manager> getManagers();
	public Manager saveManager(Manager m);
	public Manager getManager(Long id);
	public void deleteManager(Long id);
	public Manager updateManager(Manager m);
	
	public Manager getManagerByNameAndId(String n, Long id);

}
