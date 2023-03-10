package week3.mediator_pattern.mediator;

import week3.mediator_pattern.model.Colleague;

public interface Mediator {
    public void send(String message, Colleague colleague);
}
