package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer extends Bulldozer implements MachineProducer {
    @Override
    public List<Machine> get() {
        return List.of(new Bulldozer(), new Bulldozer(), new Bulldozer());
    }
}
