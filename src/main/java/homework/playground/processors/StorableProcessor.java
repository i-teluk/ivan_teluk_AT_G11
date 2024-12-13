package homework.playground.processors;

import homework.playground.essence.craft.hand.Storable;
import homework.playground.essence.material.Pourable;
import homework.playground.utils.VolumeGenerator;

public class StorableProcessor {
    public void runStorable(Storable storable, Pourable pourable) {
        storable.store(pourable, VolumeGenerator.generateVolume(pourable));
    }

    public void runStorable(Storable storable, Pourable pourable, int volume) {
        storable.store(pourable, volume);
    }
}
