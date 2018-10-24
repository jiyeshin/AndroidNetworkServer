package com.pk.android.service;

import javax.servlet.http.HttpServletRequest;
import com.pk.android.domain.AndroidUserDomain;

public interface AndroidUserService {
	public AndroidUserDomain login(HttpServletRequest request);	
}
