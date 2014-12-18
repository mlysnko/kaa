/*
 * Copyright 2014 CyberVision, Inc.
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
package org.kaaproject.kaa.server.operations.pojo.sync;  

public class ProfileClientSync {
   private java.nio.ByteBuffer endpointPublicKey;
   private java.nio.ByteBuffer profileBody;
   private org.kaaproject.kaa.server.operations.pojo.sync.EndpointVersionInfo versionInfo;
   private java.lang.String endpointAccessToken;

  @Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((endpointAccessToken == null) ? 0 : endpointAccessToken.hashCode());
    result = prime * result + ((endpointPublicKey == null) ? 0 : endpointPublicKey.hashCode());
    result = prime * result + ((profileBody == null) ? 0 : profileBody.hashCode());
    result = prime * result + ((versionInfo == null) ? 0 : versionInfo.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    ProfileClientSync other = (ProfileClientSync) obj;
    if (endpointAccessToken == null) {
        if (other.endpointAccessToken != null) {
            return false;
        }
    } else if (!endpointAccessToken.equals(other.endpointAccessToken)) {
        return false;
    }
    if (endpointPublicKey == null) {
        if (other.endpointPublicKey != null) {
            return false;
        }
    } else if (!endpointPublicKey.equals(other.endpointPublicKey)) {
        return false;
    }
    if (profileBody == null) {
        if (other.profileBody != null) {
            return false;
        }
    } else if (!profileBody.equals(other.profileBody)) {
        return false;
    }
    if (versionInfo == null) {
        if (other.versionInfo != null) {
            return false;
        }
    } else if (!versionInfo.equals(other.versionInfo)) {
        return false;
    }
    return true;
}

/**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public ProfileClientSync() {}

  /**
   * All-args constructor.
   */
  public ProfileClientSync(java.nio.ByteBuffer endpointPublicKey, java.nio.ByteBuffer profileBody, org.kaaproject.kaa.server.operations.pojo.sync.EndpointVersionInfo versionInfo, java.lang.String endpointAccessToken) {
    this.endpointPublicKey = endpointPublicKey;
    this.profileBody = profileBody;
    this.versionInfo = versionInfo;
    this.endpointAccessToken = endpointAccessToken;
  }

  /**
   * Gets the value of the 'endpointPublicKey' field.
   */
  public java.nio.ByteBuffer getEndpointPublicKey() {
    return endpointPublicKey;
  }

  /**
   * Sets the value of the 'endpointPublicKey' field.
   * @param value the value to set.
   */
  public void setEndpointPublicKey(java.nio.ByteBuffer value) {
    this.endpointPublicKey = value;
  }

  /**
   * Gets the value of the 'profileBody' field.
   */
  public java.nio.ByteBuffer getProfileBody() {
    return profileBody;
  }

  /**
   * Sets the value of the 'profileBody' field.
   * @param value the value to set.
   */
  public void setProfileBody(java.nio.ByteBuffer value) {
    this.profileBody = value;
  }

  /**
   * Gets the value of the 'versionInfo' field.
   */
  public org.kaaproject.kaa.server.operations.pojo.sync.EndpointVersionInfo getVersionInfo() {
    return versionInfo;
  }

  /**
   * Sets the value of the 'versionInfo' field.
   * @param value the value to set.
   */
  public void setVersionInfo(org.kaaproject.kaa.server.operations.pojo.sync.EndpointVersionInfo value) {
    this.versionInfo = value;
  }

  /**
   * Gets the value of the 'endpointAccessToken' field.
   */
  public java.lang.String getEndpointAccessToken() {
    return endpointAccessToken;
  }

  /**
   * Sets the value of the 'endpointAccessToken' field.
   * @param value the value to set.
   */
  public void setEndpointAccessToken(java.lang.String value) {
    this.endpointAccessToken = value;
  }
}
