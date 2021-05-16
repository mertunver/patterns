package com.example.demo.commandPattern;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LightsOffCommand implements ICommand{

    /**
     * this could be set of light.
     */
    private final Light light;

    @Override
    public void execute() {

    }

    @Override
    public void unExecute() {

    }
}
