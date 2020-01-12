package com.windigital.spring04.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class MySHell {

    private final MyService myService;

    @Autowired
    public MySHell(MyService myService) {
        this.myService = myService;
    }

    @ShellMethod("Translate text from one language to another.")
    public String translate(
            @ShellOption String name
    ) {
        // invoke service
        return myService.hello(name);
    }
}
