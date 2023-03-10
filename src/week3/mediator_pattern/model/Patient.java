package week3.mediator_pattern.model;

import week3.mediator_pattern.mediator.Mediator;

public class Patient extends Colleague {
    public Patient(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("Patient sends message: " + message);
        mediator.send(message, this);
    }

    public void receive(String message) {
        System.out.println("Patient receives message: " + message);
    }
}
