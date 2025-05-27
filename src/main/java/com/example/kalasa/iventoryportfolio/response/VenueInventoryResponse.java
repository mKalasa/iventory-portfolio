package com.example.kalasa.iventoryportfolio.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueInventoryResponse {
    private Long venueId;
    private String venueName;
    private Long totalCapacity;
}
