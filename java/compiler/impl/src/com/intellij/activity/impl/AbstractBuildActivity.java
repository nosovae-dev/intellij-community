/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.activity.impl;

import com.intellij.activity.Activity;
import com.intellij.activity.BuildActivity;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

/**
 * @author Vladislav.Soroka
 * @since 7/13/2016
 */
public abstract class AbstractBuildActivity extends AbstractActivity implements BuildActivity {
  private final boolean myIsIncrementalBuild;

  public AbstractBuildActivity(boolean isIncrementalBuild) {
    this(isIncrementalBuild, Collections.emptyList());
  }

  public AbstractBuildActivity(boolean isIncrementalBuild, @NotNull List<Activity> dependencies) {
    super(dependencies);
    myIsIncrementalBuild = isIncrementalBuild;
  }

  @Override
  public boolean isIncrementalBuild() {
    return myIsIncrementalBuild;
  }
}
