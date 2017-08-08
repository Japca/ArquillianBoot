package com.example.demo;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@RunWith(Arquillian.class)
@SpringBootTest
public class DemoApplicationTests {

	@Deployment
	public static Archive<?> createTestArchive() {
//
//		File[] files = Maven.resolver()
//				.loadPomFromFile("pom.xml")
//				.importRuntimeDependencies()
//				.resolve().withTransitivity()
//				.asFile();

		return ShrinkWrap.create(WebArchive.class, "FileUploadIssue.war")
				.addPackages(true,"com.example");
	}


	@Test
	public void contextLoads() {
	}

}
