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

@XmlRootElement(name="cuisine")
@JsonInclude(value=Include.NON_NULL)

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Cuisine {

    @JsonProperty(required = true)
    private String cuisineId;
    @JsonProperty(required = true)
    private String cuisineName;
    @JsonProperty(required = true)
    private String cuisineDesc;
    @JsonProperty(required = true)
    private Boolean vegetarian;
    @JsonProperty(required = true)
    private Boolean glutenFree;
    @JsonProperty(required = true)
    private List<String> mealTypes;
    @JsonProperty(required = true)
    private Float imageRatio;
    private String imageUrl;
    @JsonProperty(required = true)
    private Float price;
    @JsonProperty(required = true)
    private Long favorites;
    
    private Boolean favorited;
}
