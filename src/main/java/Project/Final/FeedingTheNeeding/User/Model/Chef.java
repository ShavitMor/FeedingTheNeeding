package Project.Final.FeedingTheNeeding.User.Model;

import Project.Final.FeedingTheNeeding.cook.Model.ChefConstraint;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "chefs")
@Data
@EqualsAndHashCode(callSuper = true)
public class Chef extends BaseUser{
    private ChefConstraint[] chefConstraints;
}
