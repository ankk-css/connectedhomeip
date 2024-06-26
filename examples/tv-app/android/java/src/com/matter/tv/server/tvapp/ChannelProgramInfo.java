/*
 *   Copyright (c) 2024 Project CHIP Authors
 *   All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package com.matter.tv.server.tvapp;

import java.util.Map;

public class ChannelProgramInfo {

  public String identifier;
  public ChannelInfo channel;
  public long startTime;
  public long endTime;
  public String title;
  public String subTitle;
  public String description;
  public boolean recordFlagScheduled = false;
  public boolean recordFlagSeries = false;
  public boolean recordFlagRecorded = false;
  public Map.Entry<String, String>[] externalIDList;

  public ChannelProgramInfo(
      String identifier,
      ChannelInfo channel,
      long startTime,
      long endTime,
      String title,
      String subTitle,
      String description) {
    this.identifier = identifier;
    this.channel = channel;
    this.startTime = startTime;
    this.endTime = endTime;
    this.title = title;
    this.subTitle = subTitle;
    this.description = description;
  }
}
