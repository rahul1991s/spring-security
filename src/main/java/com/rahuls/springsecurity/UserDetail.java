package com.rahuls.springsecurity;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Rahul S
 *
 */
public class UserDetail implements UserDetails {

	private static final long serialVersionUID = 1L;

	private String uname;
	private String password;
	private String active;

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	private List<GrantedAuthority> auth;

	public UserDetail(UserEntity u) {
		super();
		this.uname = u.getUserId();
		this.password = u.getPassword();
		this.active = u.getActive();
		String[] s = { u.getRoles() };
		this.auth = Arrays.stream(s).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}

	public UserDetail() {

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return auth;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return uname;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
