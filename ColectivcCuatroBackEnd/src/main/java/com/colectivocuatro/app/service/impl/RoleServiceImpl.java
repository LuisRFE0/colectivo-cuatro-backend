package com.colectivocuatro.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colectivocuatro.app.entities.Role;
import com.colectivocuatro.app.repository.RoleRepository;
import com.colectivocuatro.app.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleRepository roleRepository;
	@Override
	public Role getRoleById(Integer id) {
		return roleRepository.findById(id)
				.orElseThrow( ()-> new IllegalStateException("Role does not exist with id " + id));
	}

	@Override
	public Role createRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public List<Role> getAllRoles() {
		return (List<Role>) roleRepository.findAll();
	}

	@Override
	public Role updateRole(Role role, Integer id) {
		Role existingRole = getRoleById(id);
		existingRole.setName( role.getName() );
		return roleRepository.save(existingRole);
	}

	@Override
	public void deleteRole(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
