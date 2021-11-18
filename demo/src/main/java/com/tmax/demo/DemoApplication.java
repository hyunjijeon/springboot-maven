package com.tmax.demo;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        
        


        
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);

		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		// sessionFactory.setMapperLocations(resolver.getResources("classpath:demo/mapper/emp-mapper.xml"));
		sessionFactory.setConfigLocation(resolver.getResource("classpath:demo/mapper-config/emp-config.xml"));
		return sessionFactory.getObject();
	}

}
