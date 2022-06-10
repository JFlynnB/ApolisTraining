package com.apolis.Day15_June9;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class AppConfigurations {

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sF = new LocalSessionFactoryBean();
		sF.setDataSource(datasource());      //You must give connection properties
		sF.setPackagesToScan(new String[] {"com.apolis.Day15_June9"});  //This lets it scan for entities
		sF.setHibernateProperties(hibernateProperties());   //you must give it the Hibernate properties
		return sF;
	}
	
	@Bean
	public DataSource datasource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test2");
		ds.setUsername("root");
		ds.setPassword("Datumbazo1");
		return ds;
	}
	
	@Bean
	public Properties hibernateProperties() {
		Properties prop = new Properties();
		prop.put("hibernate.show_sql", true);
		prop.put("hibernate.hbm2ddl.auto", "create");
		return prop;
	}
	@Bean
	public CustomerDao customerDao() {
		CustomerDao dao = new CustomerDao();
		dao.setFactory(sessionFactory().getObject());
		return dao;
	}
}
