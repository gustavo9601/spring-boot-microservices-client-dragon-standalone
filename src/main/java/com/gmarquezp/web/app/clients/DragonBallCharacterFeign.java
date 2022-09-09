package com.gmarquezp.web.app.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "dragon-ball") // Indica el nombre del microservicio registrado en eureka, y que se va a consumir
public interface DragonBallCharacterFeign {

    /*
    * Se especifican todas las rutas que se van a consumir del microservicio
    * */
    @GetMapping("/application-name")
    public ResponseEntity<String> getApplicationName();
}
