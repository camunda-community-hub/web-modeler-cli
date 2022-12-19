package org.camunda.community.webmodeler.cli;

import picocli.CommandLine;

@CommandLine.Command(
        name = "info",
        description = "Prints out info (permissions, authorized organization).",
        mixinStandardHelpOptions = true)
public class InfoCommand extends AbstractCommand {
    @Override
    public Integer call() throws Exception {
        var info = parent.buildClient().getInfo();
        System.out.println(info);
        return 0;
    }
}
