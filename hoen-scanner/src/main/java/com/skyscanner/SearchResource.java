package com.skyscanner;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.*;

@Path("/search")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SearchResource {

    @POST
    public List<SearchResult> search(Search search) {

        List<SearchResult> results = new ArrayList<>();

        results.add(new SearchResult(search.getCity(), "Hoen Hotel", "hotel"));
        results.add(new SearchResult(search.getCity(), "Rapid Cars", "rental_car"));

        return results;
    }
}