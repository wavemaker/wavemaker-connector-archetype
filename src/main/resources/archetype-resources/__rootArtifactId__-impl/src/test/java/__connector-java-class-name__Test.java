package ${package};

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import ${package}.${connector-java-class-name};


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ${connector-java-class-name}TestConfiguration.class)
public class ${connector-java-class-name}Test {

    @Autowired
    private ${connector-java-class-name} connectorInstance;

    @Test
    public void helloConnector(){
        Assert.assertEquals("Hey, this is Hello World connector", connectorInstance.helloConnector());
    }
}