package authprocessors;

import authproviders.AuthenticationProvider;
import authproviders.SamlAuthProvider;

public class SamlAuthProcessor extends AuthenticationProcessor{
    public SamlAuthProcessor(AuthenticationProcessor authenticationProcessor) {
        super(authenticationProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof SamlAuthProvider){
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }
        return false;
    }
}
