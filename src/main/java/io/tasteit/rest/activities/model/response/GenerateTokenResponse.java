package io.tasteit.rest.activities.model.response;

import java.util.Date;

import javax.annotation.Nonnull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(value=Include.NON_NULL)

@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
public class GenerateTokenResponse {

    @JsonProperty(required = true)
    @Nonnull private String tokenType;
    @JsonProperty(required = true)
    @Nonnull private String accessToken;
    @JsonProperty(required = true)
    @Nonnull private Date expireAt;
    @JsonProperty(required = true)
    @Nonnull private Long principal;
}