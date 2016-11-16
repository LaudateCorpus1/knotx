/*
 * Knot.x - Reactive microservice assembler - API
 *
 * Copyright (C) 2016 Cognifide Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cognifide.knotx.codec;

import com.cognifide.knotx.dataobjects.ClientResponse;

public class ClientResponseCodec extends AbstractMessageCodec<ClientResponse> {

  private ClientResponseCodecFactory factory = new ClientResponseCodecFactory();

  @Override
  protected ClientResponseCodecFactory getFactory() {
    return factory;
  }

  private class ClientResponseCodecFactory extends AbstractMessageCodec.CodecFactory {
    @Override
    ClientResponse newInstance() {
      return new ClientResponse();
    }
  }

}
