/*
 * Copyright (C) 2016 Cognifide Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.knotx.server.configuration;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true, publicConverter = false)
public class RepositoryEntry {

  public final static boolean DEFAULT_DO_PROCESSING = true;

  private String path;
  private String address;
  private boolean doProcessing;

  /**
   * Default constructor
   */
  public RepositoryEntry() {
    init();
  }


  /**
   * Copy constructor
   *
   * @param other the instance to copy
   */
  public RepositoryEntry(RepositoryEntry other) {
    this.path = other.path;
    this.address = other.address;
    this.doProcessing = other.doProcessing;
  }

  /**
   * Create an settings from JSON
   *
   * @param json the JSON
   */
  public RepositoryEntry(JsonObject json) {
    init();
    RepositoryEntryConverter.fromJson(json, this);
  }

  /**
   * Convert to JSON
   *
   * @return the JSON
   */
  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    RepositoryEntryConverter.toJson(this, json);
    return json;
  }

  private void init() {
    doProcessing = DEFAULT_DO_PROCESSING;
  }

  public String getPath() {
    return path;
  }

  public RepositoryEntry setPath(String path) {
    this.path = path;
    return this;
  }

  public String getAddress() {
    return address;
  }

  public RepositoryEntry setAddress(String address) {
    this.address = address;
    return this;
  }

  public boolean isDoProcessing() {
    return doProcessing;
  }

  public RepositoryEntry setDoProcessing(boolean doProcessing) {
    this.doProcessing = doProcessing;
    return this;
  }
}
