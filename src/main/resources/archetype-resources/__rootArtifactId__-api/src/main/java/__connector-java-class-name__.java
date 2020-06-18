package ${package};

import com.wavemaker.runtime.connector.annotation.WMConnector;


@WMConnector(name = "${connector-name}",
        description = "${connector-description}")
public interface ${connector-java-class-name} {

    public String helloConnector();

}