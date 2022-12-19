package org.camunda.community.webmodeler.cli;

import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.ParentCommand;

@Command
public abstract class AbstractCommand implements Callable<Integer> {

    @ParentCommand
    protected CommandLineApp parent;
}
