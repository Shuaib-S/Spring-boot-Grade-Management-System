package uk.ac.rhul.cs2800.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import uk.ac.rhul.cs2800.model.Grade;
import uk.ac.rhul.cs2800.model.Module;
import uk.ac.rhul.cs2800.model.Student;

/**
 * Configuration class for exposing entity IDs in the REST API.
 */
@Configuration
public class RestConfiguration implements RepositoryRestConfigurer {

  /**
   * Configures the REST repository to expose entity IDs for specific classes.
   *
   * @param config the repository configuration to modify
   * @param cors the CORS registry to configure
   */
  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config,
      CorsRegistry cors) {
    config.exposeIdsFor(Student.class);
    config.exposeIdsFor(Module.class);
    config.exposeIdsFor(Grade.class);
  }
}
