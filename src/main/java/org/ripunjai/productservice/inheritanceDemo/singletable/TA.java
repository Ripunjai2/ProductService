package org.ripunjai.productservice.inheritanceDemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.ripunjai.productservice.inheritanceDemo.singletable.User;

@Getter
@Setter
@Entity(name = "st_tas")
@DiscriminatorValue(value = "1")
public class TA extends User {
    private int numberOfHRs;
}
