package org.camunda.community.webmodeler.cli;

import picocli.CommandLine;

@CommandLine.Command(
    name = "listProjects",
    description = "Prints out projects in the organization.",
    mixinStandardHelpOptions = true)
public class ListProjectsCommand extends AbstractCommand {
  @Override
  public Integer call() throws Exception {
    var projects = parent.buildClient().listProjects();
    System.out.println(projects);
    return 0;
  }
}
