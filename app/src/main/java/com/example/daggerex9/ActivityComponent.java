package com.example.daggerex9;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PreActivity
@Component (dependencies = AppComponent.class, modules = {WheelModule.class, PetrolEngineModule.class})

public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();

    }

}
