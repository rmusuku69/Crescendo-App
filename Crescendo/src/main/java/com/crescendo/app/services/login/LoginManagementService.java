package com.crescendo.app.services.login;

import com.crescendo.app.components.Login;
import com.crescendo.app.components.User;

public interface LoginManagementService {
	void execute(Login login);
	User authenticate(Login login);
}
