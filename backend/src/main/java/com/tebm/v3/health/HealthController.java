package com.tebm.v3.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Simple liveness endpoint used by the frontend to confirm
 * the backend is reachable.
 *
 * GET /api/health → { "status": "UP", "service": "tebm-backend" }
 */
@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "status",  "UP",
                "service", "tebm-backend"
        );
    }
}
