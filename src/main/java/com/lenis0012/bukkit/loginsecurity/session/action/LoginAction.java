package com.lenis0012.bukkit.loginsecurity.session.action;

import com.lenis0012.bukkit.loginsecurity.session.*;
import org.bukkit.entity.Player;

public class LoginAction extends AuthAction {

    public <T> LoginAction(AuthService<T> service, T serviceProvider) {
        super(AuthActionType.LOGIN, service, serviceProvider);
    }

    @Override
    public AuthMode run(final PlayerSession session, ActionResponse response) {
        return AuthMode.AUTHENTICATED;
    }
}