package io.tasteit.rest.activities.model.request;

import javax.annotation.Nonnull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class RestaurantRequest {

    public static final String GEO_RESTAURANT_ID = "restaurant_id";  
    @Nonnull private final String restaurantId;
    
    public RestaurantRequest(@Nonnull String restaurantId) {
        this.restaurantId = restaurantId;
    }
}
