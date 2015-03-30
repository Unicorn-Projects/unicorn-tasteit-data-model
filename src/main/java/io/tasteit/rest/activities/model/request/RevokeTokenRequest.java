package io.tasteit.rest.activities.model.request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_NULL)

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class RevokeTokenRequest {

    @JsonProperty(required = true)
    private String tokenType;
    @JsonProperty(required = true)
    private String token;
    @JsonProperty(required = true)
    private Long principal;
}