package io.tasteit.rest.activities.model.response;

import javax.annotation.Nonnull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_NULL)

@NoArgsConstructor
@AllArgsConstructor()
@Getter
@EqualsAndHashCode
@ToString
public class ErrorResponse {

    @JsonProperty(required = true)
    @Nonnull private String errorType;
    @JsonProperty(required = true)
    @Nonnull private String errorCode;
    @JsonProperty(required = true)
    @Nonnull private String errorDesc;
}