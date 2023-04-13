package org.camunda.community.webmodeler.cli;

import org.camunda.community.webmodeler.client.ApiClient;
import org.camunda.community.webmodeler.client.api.*;
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
            scope = CommandLine.ScopeType.INHERIT)
    private String basePath = new ApiClient().getBasePath();

    protected FilesApi buildFilesClient() {
        var result = new FilesApi();
        var apiClient = result.getApiClient();
        configureClient(apiClient);
        return result;
    }

    protected FoldersApi buildFoldersClient() {
        var result = new FoldersApi();
        var apiClient = result.getApiClient();
        configureClient(apiClient);
        return result;
    }

    protected InfoApi buildInfoClient() {
        var result = new InfoApi();
        var apiClient = result.getApiClient();
        configureClient(apiClient);
        return result;
    }

    protected MilestonesApi buildMilestonesClient() {
        var result = new MilestonesApi();
        var apiClient = result.getApiClient();
        configureClient(apiClient);
        return result;
    }

    protected ProjectsApi buildProjectsClient() {
        var result = new ProjectsApi();
        var apiClient = result.getApiClient();
        configureClient(apiClient);
        return result;
    }

    private void configureClient(ApiClient apiClient) {
        apiClient.setAccessToken(token);
        apiClient.setBasePath(basePath);
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
