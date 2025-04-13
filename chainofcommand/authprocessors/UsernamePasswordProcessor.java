package authprocessors;

import authproviders.AuthenticationProvider;
import authproviders.UsernamePasswordProvider;

public class UsernamePasswordProcessor extends AuthenticationProcessor{
    public UsernamePasswordProcessor(AuthenticationProcessor authenticationProcessor) {
        super(authenticationProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof UsernamePasswordProvider) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }

        return false;
    }
}
