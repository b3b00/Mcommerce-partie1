package com.ecommerce.microcommerce.model;

import groovy.transform.EqualsAndHashCode;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(includes = {"first","second","count"})
@ToString(of={"first","second","count"})
public class Data {
    @Getter
    String first;
    @Getter
    String second;
    @Getter
    int count;
}