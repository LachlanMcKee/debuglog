/*
 * Copyright (C) 2020 Brian Norman
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

package com.bnorm.debug.log

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property

open class DebugLogGradleExtension(objects: ObjectFactory) {
  private val enabledProperty: Property<Boolean> = objects.property(Boolean::class.java)
    .apply { convention(true) }

  var enabled: Boolean
    get() = enabledProperty.get()
    set(value) = enabledProperty.set(value)
}
