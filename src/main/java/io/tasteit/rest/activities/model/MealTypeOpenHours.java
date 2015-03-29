package io.tasteit.rest.activities.model;

import javax.annotation.Nonnull;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement(name="meal_type_open_hours")
@JsonInclude(value=Include.NON_NULL)

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class MealTypeOpenHours {

    @JsonProperty(required = true)
    private String mealType;
    @JsonProperty(required = true)
    @Nonnull private OpenHours openHours;
}
