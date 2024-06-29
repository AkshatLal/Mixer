package com.example.parket.music.Mixer.config;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Host;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.config.AbstractAerospikeDataConfiguration;
import org.springframework.data.aerospike.mapping.AerospikeMappingContext;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;

import java.util.Collection;
import java.util.List;

@Configuration
@EnableAerospikeRepositories(basePackages = "com.example.parket.music.Mixer.repositories")
public class AerospikeConfig extends AbstractAerospikeDataConfiguration {

    @Bean
    @Override
    public AerospikeClient aerospikeClient() {
        return new AerospikeClient("localhost", 3000);
    }

    @Override
    protected Collection<Host> getHosts() {
        return List.of();
    }

    @Bean
    public AerospikeMappingContext aerospikeMappingContext() {
        return new AerospikeMappingContext();
    }

    @Override
    protected String nameSpace() {
        return "test";
    }
}