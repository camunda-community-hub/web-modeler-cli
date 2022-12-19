package org.camunda.community.webmodeler.cli;

import picocli.CommandLine.Command;
import picocli.CommandLine.ParentCommand;

import java.util.concurrent.Callable;

@Command
public abstract class AbstractCommand implements Callable<Integer> {

    @ParentCommand
    protected CommandLineApp parent;
}
