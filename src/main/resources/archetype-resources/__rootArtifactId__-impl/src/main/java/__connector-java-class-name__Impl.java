package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ${package}.${connector-java-class-name};

@Service
@Primary
public class ${connector-java-class-name}Impl implements ${connector-java-class-name}{

    private static final Logger logger = LoggerFactory.getLogger(${connector-java-class-name}Impl.class);

    @Override
    public String helloConnector(){
        return "Hey, this is Hello World connector";
    }
}