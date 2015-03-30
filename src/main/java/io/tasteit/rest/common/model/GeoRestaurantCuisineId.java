package io.tasteit.rest.common.model;

import javax.annotation.Nonnull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor()
@Getter
@EqualsAndHashCode
public class GeoRestaurantCuisineId implements Comparable<GeoRestaurantCuisineId> {

    private static final Integer CUISINE_ID_LENGTH = 4;
    private static final String RESTAURANT_CUISINE_ID_SEPARATOR = "-";

    @Nonnull private final String geoHashPrefix;
    @Nonnull private final String restaurantCuisineId;

    public static @Nonnull GeoRestaurantCuisineId plusGeoRestaurantCuisineId(GeoRestaurantCuisineId geoRestaurantCuisineId) {
        try {
            String restaurantCuisineId = geoRestaurantCuisineId.getRestaurantCuisineId();
            int index = restaurantCuisineId.lastIndexOf(RESTAURANT_CUISINE_ID_SEPARATOR);
            long restaurantId = Long.parseLong(restaurantCuisineId.substring(0, index));
            int cuisineId = Integer.parseInt(restaurantCuisineId.substring(index + 1));

            return new GeoRestaurantCuisineId(geoRestaurantCuisineId.geoHashPrefix, generateRestaurantCuisineId(restaurantId, cuisineId + 1));
        } catch (Exception error) {
            throw new IllegalArgumentException(String.format("missing or malformed required parameter geo_restaurant_cuisine_id: %s", geoRestaurantCuisineId));
        }
    }

    public static @Nonnull String generateRestaurantCuisineId(long restaurantId, int cuisineId) {
        if (cuisineId <= 0) {
            throw new IllegalArgumentException(
                    String.format("Expecting request paramter cuisineId no less than 1, but received: cuisineId=%s", cuisineId));
        }

        String cuisineIdStr = String.valueOf(cuisineId);
        int length = cuisineIdStr.length();
        if (length > CUISINE_ID_LENGTH) {
            throw new IllegalArgumentException(
                    String.format("Expecting request paramter cuisineId with length no more than %s, but received: cuisineId=%s", CUISINE_ID_LENGTH, cuisineId));
        }
        StringBuilder builder = new StringBuilder().append(restaurantId).append(RESTAURANT_CUISINE_ID_SEPARATOR);
        while (length++ < CUISINE_ID_LENGTH) {
            builder.append("0");
        }
        builder.append(cuisineIdStr);
        return builder.toString();
    }

    public static @Nonnull GeoRestaurantCuisineId parseGeoRestaurantCuisineId(@Nonnull String geoRestaurantCuisineId) {
        try {
            int index = geoRestaurantCuisineId.indexOf(GeoRestaurantId.GEO_RESTAURANT_ID_SEPARATOR);
            String restaurantCuisineId = geoRestaurantCuisineId.substring(index + 1);

            return new GeoRestaurantCuisineId(geoRestaurantCuisineId.substring(0, index), restaurantCuisineId);
        } catch (Exception error) {
            throw new IllegalArgumentException(String.format("invalid geo_restaurant_cuisine_id: %s", geoRestaurantCuisineId));
        }
    }

    public GeoRestaurantCuisineId(@Nonnull String geoHashPrefix, @Nonnull Long restaurantId, @Nonnull Integer cuisineId) {
        this.geoHashPrefix = geoHashPrefix;
        this.restaurantCuisineId = generateRestaurantCuisineId(restaurantId, cuisineId);
    }

    public @Nonnull GeoRestaurantId getGeoRestaurantId() {
        try {
            String[] restaurantCuisineIdArr = restaurantCuisineId.split(RESTAURANT_CUISINE_ID_SEPARATOR);
            Long restaurantId = Long.parseLong(restaurantCuisineIdArr[0]);

            return new GeoRestaurantId(geoHashPrefix, restaurantId);
        } catch (Exception error) {
            throw new IllegalArgumentException(String.format("invalid geo_restaurant_cuisine_id: %s", restaurantCuisineId));
        }
    }
    
    public @Nonnull String getCuisineId() {
        try {
            return restaurantCuisineId.split(RESTAURANT_CUISINE_ID_SEPARATOR)[1];
        } catch (Exception error) {
            throw new IllegalArgumentException(String.format("invalid geo_restaurant_cuisine_id: %s", restaurantCuisineId));
        }
    }

    public int compareTo(GeoRestaurantCuisineId other) {
        return restaurantCuisineId.compareTo(other.restaurantCuisineId);
    }

    @Override
    public String toString() {
        return geoHashPrefix + GeoRestaurantId.GEO_RESTAURANT_ID_SEPARATOR + restaurantCuisineId;
    }
}
