package org.camunda.community.webmodeler.cli;

import picocli.CommandLine;

import java.util.UUID;

@CommandLine.Command(
        name = "listFiles",
        description = "Prints out files in project (only metadata, no file contents).",
        mixinStandardHelpOptions = true)
public class ListFilesCommand extends AbstractCommand {

    @CommandLine.Option(
            names = {"--project", "-p"},
            description = "project UUID",
            scope = CommandLine.ScopeType.LOCAL,
            required = true)
    private UUID projectUUID;

    @Override
    public Integer call() throws Exception {
        var projects = parent.buildClient().listFiles(projectUUID);
        System.out.println(projects);
        return 0;
    }
}
