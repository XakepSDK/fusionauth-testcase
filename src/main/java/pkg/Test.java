package pkg;

import io.fusionauth.jwks.JSONWebKeySetHelper;

public class Test {
    public static void main(String[] args) {
        JSONWebKeySetHelper.retrieveKeysFromIssuer("https://accounts.google.com");
    }
}
