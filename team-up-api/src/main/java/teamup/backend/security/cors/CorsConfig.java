package teamup.backend.security.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    //FIXME WHEN WE IMPLEMENT SPRING SECURITY
//    @Bean
//    public CorsConfigurationSource corsConfiguration(CorsProperties corsProperties) {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.setAllowCredentials(corsProperties.isAllowCredentials());
//        corsConfiguration.setAllowedOrigins(corsProperties.getAllowedOrigins());
//        corsConfiguration.setAllowedMethods(corsProperties.getAllowedMethods());
//        corsConfiguration.setAllowedHeaders(corsProperties.getAllowedHeaders());
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfiguration);
//        return source;
//    }
}
