package io.tasteit.rest.activities.model.request;

import java.time.DayOfWeek;
import java.util.List;

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
public class GetCuisinesForRestaurantRequest {

    @JsonProperty(required = true)
    private String restaurantId;
    @JsonProperty(required = true)
    private DayOfWeek dayOfWeek;
    @JsonProperty(required = true)
    private Float localTime;
    
    private Integer offset;
    private Integer limit;
    private List<String> cuisineCategories;
    private List<String> cuisineTypes;
    private List<String> mealTypes;
    private Boolean vegetarian;
    private Boolean glutenFree;
    private Boolean serveNowOnly;
}
