package io.github.meritepk.cucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.spring.CucumberContextConfiguration;

@Suite
@SelectClasspathResource("features")
@CucumberContextConfiguration
@ConfigurationParameter(key = "cucumber.glue", value = "io.github.meritepk.cucumber")
@ConfigurationParameter(key = "cucumber.plugin", value = "html:target/cucumber.html")
@SpringBootTest
public class CucumberTest {
}
