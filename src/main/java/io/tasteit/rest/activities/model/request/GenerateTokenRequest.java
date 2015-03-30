package io.tasteit.rest.activities.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(value=Include.NON_NULL)

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class GenerateTokenRequest {

    public enum GrantType {
        /**
         * user_password is used by end users and customer_credential is used by business customers
         */
        USER_PASSWORD("user_password"),
        CUSTOMER_CREDENTIAL("customer_credential"),
        FACEBOOK("facebook");

        private String grantType;

        private GrantType(String grantType) {
            this.grantType = grantType;
        }

        @Override
        public String toString() {
            return grantType;
        }
        
        public static GrantType fromString(String grantType) {
            if (USER_PASSWORD.toString().equals(grantType)) {
                return GrantType.USER_PASSWORD;
            } else if (CUSTOMER_CREDENTIAL.toString().equals(grantType)) {
                return GrantType.CUSTOMER_CREDENTIAL;
            } else if (FACEBOOK.toString().equals(grantType)) {
                return GrantType.FACEBOOK;
            }
            throw new IllegalArgumentException(String.format("unrecognized grant type %s", grantType));
        }
    }

    @JsonProperty(required = true)
    private GrantType grantType;
    
    private String loginName;
    private String password;
    private String credential;
    private String fbUserToken;
}