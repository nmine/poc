package be.nmine.sweetycup.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("server")
//@PropertySource("file:${java:comp/env/config/calculationforms}")
public class ServerDataSourceConfiguration {
	
//	@Resource(name = "dataSource", mappedName = "java:comp/env/jdbc/sweetycup")
//	private DataSource jndiDataSource;
//
//	@Bean
//	public DataSource dataSource() throws Exception {
//		return jndiDataSource;
//	}
}
