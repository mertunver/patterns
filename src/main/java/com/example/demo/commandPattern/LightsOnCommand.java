package com.example.demo.commandPattern;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LightsOnCommand implements ICommand{

    private final Light light;

    @Override
    public void execute() {

    }

    @Override
    public void unExecute() {

    }
}
