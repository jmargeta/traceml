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
    root.PolyaxonSdk.V1ClaimConnection = factory(root.PolyaxonSdk.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The V1ClaimConnection model module.
   * @module model/V1ClaimConnection
   * @version 1.0.76
   */

  /**
   * Constructs a new <code>V1ClaimConnection</code>.
   * @alias module:model/V1ClaimConnection
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>V1ClaimConnection</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V1ClaimConnection} obj Optional instance to populate.
   * @return {module:model/V1ClaimConnection} The populated <code>V1ClaimConnection</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('volume_claim'))
        obj.volume_claim = ApiClient.convertToType(data['volume_claim'], 'String');
      if (data.hasOwnProperty('mount_path'))
        obj.mount_path = ApiClient.convertToType(data['mount_path'], 'String');
      if (data.hasOwnProperty('read_only'))
        obj.read_only = ApiClient.convertToType(data['read_only'], 'Boolean');
      if (data.hasOwnProperty('kind'))
        obj.kind = ApiClient.convertToType(data['kind'], Object);
    }
    return obj;
  }

  /**
   * @member {String} volume_claim
   */
  exports.prototype.volume_claim = undefined;

  /**
   * @member {String} mount_path
   */
  exports.prototype.mount_path = undefined;

  /**
   * @member {Boolean} read_only
   */
  exports.prototype.read_only = undefined;

  /**
   * @member {Object} kind
   */
  exports.prototype.kind = undefined;

  return exports;

}));
