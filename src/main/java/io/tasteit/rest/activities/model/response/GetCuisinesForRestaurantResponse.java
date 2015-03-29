package io.tasteit.rest.activities.model.response;

import io.tasteit.rest.activities.model.Cuisine;

import java.util.List;

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
public class GetCuisinesForRestaurantResponse {
    
    @JsonProperty(required = true)
    @Nonnull private List<Cuisine> restaurantCuisines;
}
