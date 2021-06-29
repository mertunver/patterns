package com.example.demo.bridgePattern;

import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Component;

@Component
@SuperBuilder
public class LongForm extends View {

    @Override
    public String show() {
        return this.resource.show() + this.resource.image() + this.resource.title();
    }
}
