package io.tasteit.rest.common.model;

import javax.annotation.Nonnull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor()
@Getter
@EqualsAndHashCode
public class GeoRestaurantId {

    protected static final String GEO_RESTAURANT_ID_SEPARATOR = "-";

    @Nonnull private final String geoHashPrefix;
    @Nonnull private final Long restaurantId;

    public static @Nonnull GeoRestaurantId parseGeoRestaurantId(@Nonnull String geoRestaurantId) {
        try {
            String[] geoRestaurantIdArr = geoRestaurantId.split(GEO_RESTAURANT_ID_SEPARATOR);
            Long restaurantId = Long.parseLong(geoRestaurantIdArr[1]);

            return new GeoRestaurantId(geoRestaurantIdArr[0], restaurantId);
        } catch (Exception error) {
            throw new IllegalArgumentException(String.format("invalid geo_restaurant_id: %s", geoRestaurantId));
        }
    }

    @Override
    public String toString() {
        return geoHashPrefix + GEO_RESTAURANT_ID_SEPARATOR + restaurantId;
    }
}