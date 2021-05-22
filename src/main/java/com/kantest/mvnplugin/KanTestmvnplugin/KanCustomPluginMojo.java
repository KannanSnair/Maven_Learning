package com.kantest.mvnplugin.KanTestmvnplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

/**
 * 
 * An example of mavenMojo to create a sample maven plugin.
 * @author kannannair
 */
@Mojo(name="version", defaultPhase=LifecyclePhase.INITIALIZE)
public class KanCustomPluginMojo extends AbstractMojo {

	
	@Parameter(property="git.command",defaultValue="abcd")
	private String command;
	
	@Parameter(property="project", readonly=true)
	private MavenProject project;
	
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("command value is : " + command);
		project.getProperties().put("Git hash", "2.1111");
		
	}
//command to run the plugin : mvn com.kantest.mvnplugin:KanTestmvnplugin:version
	
}
