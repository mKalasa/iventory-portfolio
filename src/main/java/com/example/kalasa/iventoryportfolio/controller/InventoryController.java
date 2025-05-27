package com.example.kalasa.iventoryportfolio.controller;

import com.example.kalasa.iventoryportfolio.response.EventInventoryResponse;
import com.example.kalasa.iventoryportfolio.response.VenueInventoryResponse;
import com.example.kalasa.iventoryportfolio.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/inventory/events")
    public @ResponseBody List<EventInventoryResponse> inventoryGetAllEvents() {
        // Logic to fetch all events
        return inventoryService.getAllEvents();
    }

    @GetMapping("/inventory/venue/{venueId}")
    public @ResponseBody VenueInventoryResponse getLocationInventory(@PathVariable("venueId") Long venueId) {
        // Logic to fetch inventory for a specific venue
        return inventoryService.getVenueInformation(venueId);
    }

    @GetMapping("/inventory/event/{eventId}")
    public @ResponseBody EventInventoryResponse inventoryForEvent(@PathVariable("eventId") Long eventId) {
        // Logic to fetch all events
        return inventoryService.getEventInventory(eventId);
    }

    @PutMapping("/inventory/event/{eventId}/capacity/{capacity}")
    public ResponseEntity<Void> updateEventCapacity(@PathVariable("eventId") Long eventId, @PathVariable("capacity") Long capacity) {
        // Logic to update the capacity of an event
        inventoryService.updateEventCapacity(eventId, capacity);
        return ResponseEntity.ok().build();
    }
}
