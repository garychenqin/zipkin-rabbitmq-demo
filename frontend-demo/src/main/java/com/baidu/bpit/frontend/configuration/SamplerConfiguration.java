package com.baidu.bpit.frontend.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.PercentageBasedSampler;
import org.springframework.cloud.sleuth.sampler.SamplerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chenshouqin on 2016-11-20 19:32.
 */
@Configuration
public class SamplerConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.zipkin", ignoreUnknownFields = true)
    public SamplerProperties samplerProperties() {
        SamplerProperties samplerProperties = new SamplerProperties();
        return samplerProperties;
    }

    @Bean
    public Sampler defaultSampler(SamplerProperties samplerProperties) {
        return new PercentageBasedSampler(samplerProperties);
    }
}
