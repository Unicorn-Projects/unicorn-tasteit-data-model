package io.tasteit.rest.activities.model;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement(name="restaurant_detail")
@JsonInclude(value=Include.NON_NULL)

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class RestaurantDetail {

    private List<String> imageUrls;
    @JsonProperty(required = true)
    private Address address;
    @JsonProperty(required = true)
    private String contact;
    @JsonProperty(required = true)
    private String website;
    @JsonProperty(required = true)
    private Map<Integer, List<MealTypeOpenHours>> openHours;
}