package com.example.sample.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//User.java

@Entity
@Table
@Data
public class User implements UserDetails {
	@Id
	private String username;
	@Column
	private String password;
	@Column
	private String details;

	@Column
    private String groupPermission;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getGroupPermission() {
		return groupPermission;
	}

	public void setGroupPermission(String groupPermission) {
		this.groupPermission = groupPermission;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		String[] userPermissions = groupPermission.split(",");
		List<GrantedAuthority> list = new ArrayList<>();
		//list.add(new SimpleGrantedAuthority("ADMIN"));
		for (String s : userPermissions) {
			list.add(new SimpleGrantedAuthority(s));
		}
		return list;
	}
}
