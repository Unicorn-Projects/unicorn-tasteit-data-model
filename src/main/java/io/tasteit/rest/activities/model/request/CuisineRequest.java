package io.tasteit.rest.activities.model.request;

import io.tasteit.rest.common.model.GeoRestaurantCuisineId;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor()
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CuisineRequest {
    
    public static final String GEO_RESTAURANT_CUISINE_ID = "cuisine_id";
    
    @JsonProperty(required = true)
    private GeoRestaurantCuisineId cuisineId;
}
