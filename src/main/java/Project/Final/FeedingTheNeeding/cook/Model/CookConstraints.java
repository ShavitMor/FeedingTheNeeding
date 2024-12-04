package Project.Final.FeedingTheNeeding.cook.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CookConstraints {
    @Id
    private long cookId;

    private double TakingTime; //maybe change later to hours and minutes differently
    private int PlatesNum;

    private String location;
    private LocalDate date;  
    //TODO: later, add somehow different food types and food constraints like vegeterian or else
}
