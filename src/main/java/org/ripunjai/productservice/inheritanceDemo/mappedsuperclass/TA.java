package org.ripunjai.productservice.inheritanceDemo.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_tas")
public class TA extends User {
    private int numberOfHRs;
}
