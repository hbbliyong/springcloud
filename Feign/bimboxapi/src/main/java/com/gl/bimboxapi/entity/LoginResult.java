package com.gl.bimboxapi.entity;

public class LoginResult {
    /**
     * access_token : eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTQ5MDE2MjEsInVzZXJfbmFtZSI6IkY4bGpzOUJWUTAiLCJhdXRob3JpdGllcyI6WyJST0xFX1VTRVIiLCJST0xFX1VTRVJfQURNSU4iXSwianRpIjoiYjBiMjM1MWEtYWQyMC00YTNlLThmNWQtMTE5YzRmODgxY2Y5IiwiY2xpZW50X2lkIjoiNFdMN2psNDF0NGpRMllkUzQ1MXdHOWR1Iiwic2NvcGUiOlsib2J2OnJlYWQiLCJvYnY6d3JpdGUiLCJjb2xsYWI6cmVhZCIsImNvbGxhYjp3cml0ZSJdfQ.Nxaw3aJmr0u6uc3s1zCF3bzImjLzB7bFHwdad4DCKicigoHN4thPIvLv06kW2qIgha2W89BaSLLX45nFIkReMAHB2ucAtCEte-UdOigtvyyrMyMR0WU2ZFMKHSH6mowcKgznMBZvDt-1uwwh51U_BXWtX4vixqDIPKpmkAC0hWzMaP4H2zujWHSOk211BWRG9x9nWNda2hu5pPAWRJ_RMvSDM6uYiKAtN7p7VCnbqfuq7mVKU4yHOIAPJUuFkNjP6mSiWvSkqsJzvpEGoUfCSOFV_6z4LdWilcMkMLzHBm7jVxmOcWu1JJ4jqhD3oHbDei5sTAjtqVwCX_yfx32G5w
     * token_type : bearer
     * expires_in : 43199
     * scope : obv:read obv:write collab:read collab:write
     * jti : b0b2351a-ad20-4a3e-8f5d-119c4f881cf9
     */

    private String access_token;
    private String token_type;
    private int expires_in;
    private String scope;
    private String jti;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }
}
