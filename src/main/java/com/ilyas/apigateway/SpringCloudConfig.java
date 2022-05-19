// package com.ilyas.apigateway;

// import org.springframework.cloud.gateway.route.RouteLocator;
// import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class SpringCloudConfig{
//     @Bean
//     public RouteLocator gLocator(RouteLocatorBuilder builder){
//         return builder.routes()
//             .route(r -> r.path("/transaction/**")
//                 .uri("http://localhost:8081/")                    
//             )
//             .route(r -> r.path("/product/**")
//                 .uri("http://localhost:8082/")                    
//             )
//             .route(r -> r.path("/customer/**")
//                 .uri("http://localhost:8083/")                    
//             )
//             .build();
//     }
// }