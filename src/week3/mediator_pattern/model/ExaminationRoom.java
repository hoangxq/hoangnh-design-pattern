package week3.mediator_pattern.model;

import week3.mediator_pattern.mediator.Mediator;

public class ExaminationRoom extends Colleague {
    public ExaminationRoom(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        System.out.println("Examination Room sends message: " + message);
        mediator.send(message, this);
    }

    public void receive(String message) {
        System.out.println("Examination Room receives message: " + message);
    }
}