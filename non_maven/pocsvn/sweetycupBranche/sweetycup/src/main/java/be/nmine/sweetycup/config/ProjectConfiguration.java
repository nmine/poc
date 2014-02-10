package be.nmine.sweetycup.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		 dataSource.setUrl("jdbc:mysql://localhost:3306/scup");
//		 dataSource.setUsername("root");
		 dataSource.setPassword("root");
		dataSource
				.setUrl("jdbc:mysql://mysql-env-0532586.jelastichosting.nl/sweetycup");
		dataSource.setUsername("root");
		dataSource.setPassword("u2Q9xoQmme");
		return dataSource;
	}
}
