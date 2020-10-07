package com.four.security.token;

import com.four.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserDao userDao;
 
	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		com.four.entity.User user = userDao.queryByName(username);
		if (user == null) {
			throw new UsernameNotFoundException(username + "该用户信息不存在");
		}else{
			List<GrantedAuthority> authList = new ArrayList<>();
			// 具体具有什么的权限
//			authList.add(new SimpleGrantedAuthority(user.getRole()));
			return new User(user.getUserName(),user.getUserPwd(),authList);
		}
	}
}