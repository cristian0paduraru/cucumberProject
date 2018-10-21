package Config;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//import javax.validation.constraints.NotNull;

/**
 * Created by Xristi on 9/20/2018.
 */

@Getter
@Component
@PropertySource("classpath:common.properties")
@ConfigurationProperties
public class Properties {
    // FIXME: 9/20/2018 Getters not available
    @NotNull
    public int port;

    public class Credentials {
        @NotNull
        public String authMethod;
        @NotNull
        public String username;
        @NotNull
        public String password;

    }

    public class Google {
        @NotNull
        public String url;

    }
}


