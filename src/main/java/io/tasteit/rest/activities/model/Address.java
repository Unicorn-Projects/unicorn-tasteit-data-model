package io.tasteit.rest.activities.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement(name="address")
@JsonInclude(value=Include.NON_NULL)

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Address {

    @JsonProperty(required = true)
    private String localAddress;
    @JsonProperty(required = true)
    private String city;
    @JsonProperty(required = true)
    private String zipCode;
    @JsonProperty(required = true)
    private String state;
    @JsonProperty(required = true)
    private String country;
}
