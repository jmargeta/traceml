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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.PolyaxonSdk);
  }
}(this, function(expect, PolyaxonSdk) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('V1Notification', function() {
      beforeEach(function() {
        instance = new PolyaxonSdk.V1Notification();
      });

      it('should create an instance of V1Notification', function() {
        // TODO: update the code to test V1Notification
        expect(instance).to.be.a(PolyaxonSdk.V1Notification);
      });

      it('should have the property connection (base name: "connection")', function() {
        // TODO: update the code to test the property connection
        expect(instance).to.have.property('connection');
        // expect(instance.connection).to.be(expectedValueLiteral);
      });

      it('should have the property trigger (base name: "trigger")', function() {
        // TODO: update the code to test the property trigger
        expect(instance).to.have.property('trigger');
        // expect(instance.trigger).to.be(expectedValueLiteral);
      });

    });
  });

}));
