package week3.mediator_pattern.model;

import week3.mediator_pattern.mediator.Mediator;

public class EmergencyRoom extends Colleague {
    public EmergencyRoom(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("Emergency Room sends message: " + message);
        mediator.send(message, this);
    }

    public void receive(String message) {
        System.out.println("Emergency Room receives message: " + message);
    }
}