
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "com.qudini" })
public class CustomerServiceApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CustomerServiceApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	/*
	 * public static void main(String[] args) { ObjectMapper mapper = new
	 * ObjectMapper(); mapper.registerModule(new JodaModule());
	 * 
	 * SpringApplication.run(CustomerServiceApplication.class, args); }
	 */

}
