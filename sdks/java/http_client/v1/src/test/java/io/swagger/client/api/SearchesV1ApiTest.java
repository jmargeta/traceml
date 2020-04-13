// Copyright 2018-2020 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/*
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * OpenAPI spec version: 1.0.76
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.RuntimeError;
import io.swagger.client.model.V1ListSearchesResponse;
import io.swagger.client.model.V1Search;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchesV1Api
 */
@Ignore
public class SearchesV1ApiTest {

    private final SearchesV1Api api = new SearchesV1Api();

    
    /**
     * Create search
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSearchTest() throws ApiException {
        String owner = null;
        V1Search body = null;
        V1Search response = api.createSearch(owner, body);

        // TODO: test validations
    }
    
    /**
     * Delete search
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSearchTest() throws ApiException {
        String owner = null;
        String uuid = null;
        api.deleteSearch(owner, uuid);

        // TODO: test validations
    }
    
    /**
     * Get search
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSearchTest() throws ApiException {
        String owner = null;
        String uuid = null;
        V1Search response = api.getSearch(owner, uuid);

        // TODO: test validations
    }
    
    /**
     * List search names
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSearchNamesTest() throws ApiException {
        String owner = null;
        Integer offset = null;
        Integer limit = null;
        String sort = null;
        String query = null;
        V1ListSearchesResponse response = api.listSearchNames(owner, offset, limit, sort, query);

        // TODO: test validations
    }
    
    /**
     * List searches
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSearchesTest() throws ApiException {
        String owner = null;
        Integer offset = null;
        Integer limit = null;
        String sort = null;
        String query = null;
        V1ListSearchesResponse response = api.listSearches(owner, offset, limit, sort, query);

        // TODO: test validations
    }
    
    /**
     * Patch search
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchSearchTest() throws ApiException {
        String owner = null;
        String searchUuid = null;
        V1Search body = null;
        V1Search response = api.patchSearch(owner, searchUuid, body);

        // TODO: test validations
    }
    
    /**
     * Update search
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSearchTest() throws ApiException {
        String owner = null;
        String searchUuid = null;
        V1Search body = null;
        V1Search response = api.updateSearch(owner, searchUuid, body);

        // TODO: test validations
    }
    
}
