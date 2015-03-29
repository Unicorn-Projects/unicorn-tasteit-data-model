package io.tasteit.rest.activities.model;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement(name="restaurant")
@JsonInclude(value=Include.NON_NULL)

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Restaurant {

    @JsonProperty(required = true)
    private String restaurantId;
    @JsonProperty(required = true)
    private String restaurantName;
    @JsonProperty(required = true)
    private Double latitude;
    @JsonProperty(required = true)
    private Double longitude;
    
    private String logoUrl;
    private Double distance;
    private Set<String> servingMealTypes;
   
    private Boolean followed;
}