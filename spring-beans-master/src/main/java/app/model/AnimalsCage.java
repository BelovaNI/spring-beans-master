package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Timer nanoTime;
    private Animal animal;

    @Autowired
    public AnimalsCage(Timer nanoTime, @Qualifier("dog") Animal animal) {
        this.nanoTime = nanoTime;
        this.animal = animal;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(nanoTime.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return nanoTime;
    }
}
