/*
 * This source file is part of the eureka-server open source project.
 *
 * Copyright (c) 2018 willy and the eureka-server project authors.
 * Licensed under GNU General Public License v3.0.
 *
 * See /LICENSE for license information.
 * 
 */
package io.github.thewilly.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Instance of Server.java
 * 
 * @author Guillermo Facundo Colunga
 * @version 201803271329
 */
@ComponentScan
@Configuration
@EnableAutoConfiguration
@EnableEurekaServer
public class Server {

	public static void main(String... args) {
		SpringApplication.run( Server.class, args );
	}
}
