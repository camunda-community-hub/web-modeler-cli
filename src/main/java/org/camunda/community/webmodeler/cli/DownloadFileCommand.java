package org.camunda.community.webmodeler.cli;

import java.util.UUID;
import picocli.CommandLine;

@CommandLine.Command(name = "downloadFile", description = "Prints out file content.", mixinStandardHelpOptions = true)
public class DownloadFileCommand extends AbstractCommand {

    @CommandLine.Option(
            names = {"--file", "-f"},
            description = "file UUID",
            scope = CommandLine.ScopeType.LOCAL,
            required = true)
    private UUID fileUUID;

    @Override
    public Integer call() throws Exception {
        var file = parent.buildClient().getFile(fileUUID);
        System.out.println(file.getContent());
        return 0;
    }
}
