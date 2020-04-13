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
    describe('V1Hyperband', function() {
      beforeEach(function() {
        instance = new PolyaxonSdk.V1Hyperband();
      });

      it('should create an instance of V1Hyperband', function() {
        // TODO: update the code to test V1Hyperband
        expect(instance).to.be.a(PolyaxonSdk.V1Hyperband);
      });

      it('should have the property kind (base name: "kind")', function() {
        // TODO: update the code to test the property kind
        expect(instance).to.have.property('kind');
        // expect(instance.kind).to.be(expectedValueLiteral);
      });

      it('should have the property params (base name: "params")', function() {
        // TODO: update the code to test the property params
        expect(instance).to.have.property('params');
        // expect(instance.params).to.be(expectedValueLiteral);
      });

      it('should have the property max_iterations (base name: "max_iterations")', function() {
        // TODO: update the code to test the property max_iterations
        expect(instance).to.have.property('max_iterations');
        // expect(instance.max_iterations).to.be(expectedValueLiteral);
      });

      it('should have the property eta (base name: "eta")', function() {
        // TODO: update the code to test the property eta
        expect(instance).to.have.property('eta');
        // expect(instance.eta).to.be(expectedValueLiteral);
      });

      it('should have the property resource (base name: "resource")', function() {
        // TODO: update the code to test the property resource
        expect(instance).to.have.property('resource');
        // expect(instance.resource).to.be(expectedValueLiteral);
      });

      it('should have the property metric (base name: "metric")', function() {
        // TODO: update the code to test the property metric
        expect(instance).to.have.property('metric');
        // expect(instance.metric).to.be(expectedValueLiteral);
      });

      it('should have the property resume (base name: "resume")', function() {
        // TODO: update the code to test the property resume
        expect(instance).to.have.property('resume');
        // expect(instance.resume).to.be(expectedValueLiteral);
      });

      it('should have the property seed (base name: "seed")', function() {
        // TODO: update the code to test the property seed
        expect(instance).to.have.property('seed');
        // expect(instance.seed).to.be(expectedValueLiteral);
      });

      it('should have the property concurrency (base name: "concurrency")', function() {
        // TODO: update the code to test the property concurrency
        expect(instance).to.have.property('concurrency');
        // expect(instance.concurrency).to.be(expectedValueLiteral);
      });

      it('should have the property early_stopping (base name: "early_stopping")', function() {
        // TODO: update the code to test the property early_stopping
        expect(instance).to.have.property('early_stopping');
        // expect(instance.early_stopping).to.be(expectedValueLiteral);
      });

    });
  });

}));
