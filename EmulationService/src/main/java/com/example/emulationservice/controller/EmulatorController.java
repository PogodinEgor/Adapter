package com.example.emulationservice.controller;

import com.example.adapter.dto.MsgB;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Эмулятор сервиса B
 */
@RestController
@RequestMapping("/emul")
public class EmulatorController {

    @PostMapping
    public ResponseEntity<MsgB> getMsg(@RequestBody MsgB msgB) {
        System.out.println("****************");
        System.out.println(msgB);
        return ResponseEntity.ok(msgB);

    }

}
