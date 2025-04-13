import authprocessors.AuthenticationProcessor;
import authprocessors.OAuthProcessor;
import authprocessors.SamlAuthProcessor;
import authprocessors.UsernamePasswordProcessor;
import authproviders.AuthenticationProvider;
import authproviders.OAuthProvider;
import authproviders.SamlAuthProvider;
import authproviders.UsernamePasswordProvider;

public class Main {
    public static void main(String[] args) {
        AuthenticationProcessor authProcessor = new UsernamePasswordProcessor(new OAuthProcessor(new UsernamePasswordProcessor(null)));
        AuthenticationProvider usernamePasswordProvider = new SamlAuthProvider();
        System.out.println(authProcessor.isAuthorized(usernamePasswordProvider));
    }
}