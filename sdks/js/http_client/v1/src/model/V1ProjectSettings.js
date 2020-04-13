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
 *
 * Swagger Codegen version: 2.4.10
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.PolyaxonSdk) {
      root.PolyaxonSdk = {};
    }
    root.PolyaxonSdk.V1ProjectSettings = factory(root.PolyaxonSdk.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The V1ProjectSettings model module.
   * @module model/V1ProjectSettings
   * @version 1.0.76
   */

  /**
   * Constructs a new <code>V1ProjectSettings</code>.
   * @alias module:model/V1ProjectSettings
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>V1ProjectSettings</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V1ProjectSettings} obj Optional instance to populate.
   * @return {module:model/V1ProjectSettings} The populated <code>V1ProjectSettings</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('artifacts_store'))
        obj.artifacts_store = ApiClient.convertToType(data['artifacts_store'], 'String');
      if (data.hasOwnProperty('connections'))
        obj.connections = ApiClient.convertToType(data['connections'], ['String']);
      if (data.hasOwnProperty('run_profile'))
        obj.run_profile = ApiClient.convertToType(data['run_profile'], 'String');
      if (data.hasOwnProperty('run_profiles'))
        obj.run_profiles = ApiClient.convertToType(data['run_profiles'], ['String']);
    }
    return obj;
  }

  /**
   * @member {String} artifacts_store
   */
  exports.prototype.artifacts_store = undefined;

  /**
   * @member {Array.<String>} connections
   */
  exports.prototype.connections = undefined;

  /**
   * @member {String} run_profile
   */
  exports.prototype.run_profile = undefined;

  /**
   * @member {Array.<String>} run_profiles
   */
  exports.prototype.run_profiles = undefined;

  return exports;

}));
