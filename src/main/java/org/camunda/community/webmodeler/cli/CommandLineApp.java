package org.camunda.community.webmodeler.cli;

import org.camunda.community.webmodeler.client.ApiClient;
import org.camunda.community.webmodeler.client.api.ApiBetaApi;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(description = "Web Modeler CLI", mixinStandardHelpOptions = true)
public class CommandLineApp {

    @Option(
            names = {"--token", "-t"},
            description = "JWT token",
            scope = CommandLine.ScopeType.INHERIT,
            required = true)
    private String token;

    @Option(
            names = {"--basePath", "-b"},
            description = "base path of API (default to Camunda Cloud path)",
            scope = CommandLine.ScopeType.INHERIT,
            required = false)
    private String basePath = new ApiClient().getBasePath();

    protected ApiBetaApi buildClient() {
        var result = new ApiBetaApi();
        var apiClient = result.getApiClient();
        apiClient.setAccessToken(token);
        apiClient.setBasePath(basePath);
        return result;
    }

    public static void main(String[] args) {
        new CommandLine(new CommandLineApp())
                .addSubcommand(InfoCommand.class)
                .addSubcommand(ListProjectsCommand.class)
                .addSubcommand(ListFilesCommand.class)
                .addSubcommand(DownloadFileCommand.class)
                .addSubcommand(DownloadProjectCommand.class)
                .execute(args);
    }
}
