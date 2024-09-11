package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Testtset extends AbstractEvent {

    private Long id;

    public Testtset(Point aggregate) {
        super(aggregate);
    }

    public Testtset() {
        super();
    }
}
//>>> DDD / Domain Event
