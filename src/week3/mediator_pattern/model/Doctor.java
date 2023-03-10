package week3.mediator_pattern.model;

import week3.mediator_pattern.mediator.Mediator;

public class Doctor extends Colleague {
    public Doctor(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("Doctor sends message: " + message);
        mediator.send(message, this);
    }

    public void receive(String message) {
        System.out.println("Doctor receives message: " + message);
    }
}
