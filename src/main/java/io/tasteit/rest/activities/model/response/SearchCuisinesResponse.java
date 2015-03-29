package io.tasteit.rest.activities.model.response;

import io.tasteit.rest.activities.model.RestaurantCuisines;

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
public class SearchCuisinesResponse {
    
    @JsonProperty(required = true)
    @Nonnull private List<RestaurantCuisines> restaurantsCuisines;
    @JsonProperty(required = true)
    @Nonnull private Integer nextOffset;
}
