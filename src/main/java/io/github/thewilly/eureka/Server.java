/*
 * This source file is part of the eureka-server open source project.
 *
 * Copyright (c) 2018 willy and the eureka-server project authors.
 * Licensed under GNU General Public License v3.0.
 *
 * See /LICENSE for license information.
 * 
 */
package io.github.thewilly.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Instance of Server.java
 * 
 * @author Guillermo Facundo Colunga
 * @version 201803271329
 */
@SpringBootApplication
@EnableEurekaServer
public class Server {

	public static void main(String... args) {
		SpringApplication.run( Server.class, args );
	}
}
