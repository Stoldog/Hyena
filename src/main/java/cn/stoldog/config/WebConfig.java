package cn.stoldog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by RL on 2017/8/6.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"cn.stoldog"})
public class WebConfig extends WebMvcConfigurerAdapter{

}
