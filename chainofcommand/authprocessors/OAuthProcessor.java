package authprocessors;

import authproviders.AuthenticationProvider;
import authproviders.OAuthProvider;

public class OAuthProcessor extends AuthenticationProcessor{
    public OAuthProcessor(AuthenticationProcessor authenticationProcessor) {
        super(authenticationProcessor);
    }
    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof OAuthProvider) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }
        return false;
    }
}
