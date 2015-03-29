package io.tasteit.rest.activities.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement(name="restaurant_cuisines")
@JsonInclude(value=Include.NON_NULL)

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class RestaurantCuisines {
    
    @JsonProperty(required = true)
    private Restaurant restaurant;
    @JsonProperty(required = true)
    private List<Cuisine> restaurantCuisines;
}