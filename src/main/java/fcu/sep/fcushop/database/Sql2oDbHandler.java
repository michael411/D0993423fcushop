package fcu.sep.fcushop.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.sql2o.Sql2o;
/** CA. */

@Service

@PropertySource("classpath:application.properties")
public class Sql2oDbHandler {
  @Value("${db.jdbc_url}")
	private String jdbcUrl;
  @Value("${db.username}")
  private String userName;
  @Value("${db.password}")
  private String password;
  private Sql2o connector;
  /**
 * Get sql2o connector.
 *
 * @return connector
 */

  @SuppressWarnings("checkstyle:Indentation")
public Sql2o getConnector() {
    if (connector == null) {
      connector = new Sql2o(jdbcUrl, userName, password);
    }
    return connector;
  }
}
