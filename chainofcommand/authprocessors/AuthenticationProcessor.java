package authprocessors;

import authproviders.AuthenticationProvider;

public abstract class AuthenticationProcessor {
    public AuthenticationProcessor nextProcessor;

    public AuthenticationProcessor(AuthenticationProcessor authenticationProcessor) {
        this.nextProcessor = authenticationProcessor;
    }

    public abstract boolean isAuthorized(AuthenticationProvider authProvider);
}
