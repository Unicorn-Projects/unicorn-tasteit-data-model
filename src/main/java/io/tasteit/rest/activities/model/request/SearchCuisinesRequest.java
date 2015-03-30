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
public class SearchCuisinesRequest {

    public enum SortingCriteria {
        DISTANCE("distance"),
        RESTAURANT_POPULARITY("restaurant_popularity"),
        CUISINE_POPULARITY("cuisine_popularity");

        private String sortingCriteria;

        private SortingCriteria(String sortingCriteria) {
            this.sortingCriteria = sortingCriteria;
        }

        @Override
        public String toString() {
            return sortingCriteria;
        }

        public static SortingCriteria fromString(String sortingCriteria) {
            if (DISTANCE.toString().equals(sortingCriteria)) {
                return SortingCriteria.DISTANCE;
            } else if (RESTAURANT_POPULARITY.toString().equals(sortingCriteria)) {
                return SortingCriteria.RESTAURANT_POPULARITY;
            } else if (CUISINE_POPULARITY.toString().equals(sortingCriteria)) {
                return SortingCriteria.CUISINE_POPULARITY;
            }
            throw new IllegalArgumentException(String.format("unrecognized sorting criteria:  %s", sortingCriteria));
        }
    }

    @JsonProperty(required = true)
    private Double latitude;
    @JsonProperty(required = true)
    private Double longitude;
    @JsonProperty(required = true)
    private SortingCriteria sortedBy;
    @JsonProperty(required = true)
    private DayOfWeek dayOfWeek;
    @JsonProperty(required = true)
    private Float localTime;
    
    private Integer radius;
    private Integer offset;
    private Integer limit;
    private List<String> cuisineCategories;
    private List<String> cuisineTypes;
    private List<String> mealTypes;
    private Boolean vegetarian;
    private Boolean glutenFree;
    private Boolean openNowOnly;
}
