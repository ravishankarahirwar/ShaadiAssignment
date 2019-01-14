package com.shaadi.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ravishankar
 * @version 1.0
 * @since 13-01-2019
 */
public class UserList {
   private List<User> results = new ArrayList<>();

    public List<User> getResults() {
        return results;
    }

    public void setResults(List<User> results) {
        this.results = results;
    }
}
