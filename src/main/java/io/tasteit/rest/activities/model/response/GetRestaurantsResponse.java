package io.tasteit.rest.activities.model.response;

import io.tasteit.rest.activities.model.Restaurant;

import java.util.Map;

import javax.annotation.Nonnull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_NULL)

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class GetRestaurantsResponse {

    @JsonProperty(required = true)
    @Nonnull private Map<String, Restaurant> restaurants;
}
