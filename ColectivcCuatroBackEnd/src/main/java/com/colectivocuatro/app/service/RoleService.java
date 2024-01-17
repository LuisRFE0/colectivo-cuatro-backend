package com.colectivocuatro.app.service;

import java.util.List;

import com.colectivocuatro.app.entities.Role;

public interface RoleService {
	Role getRoleById(Integer id);
	Role createRole(Role role);
	List<Role> getAllRoles();
	Role updateRole(Role user, Integer id);
	void deleteRole(Integer id);
}
