/**
 * Copyright 2016, Luca Burgazzoli and contributors as indicated by the @author tags
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
package com.github.lburgazzoli.gradle.plugin.karaf.features

import groovy.xml.MarkupBuilder

/**
 * @author lburgazzoli
 */
class KarafFeaturesBuilder extends MarkupBuilder {
    private final Writer writer;

    public KarafFeaturesBuilder() {
        this(new StringWriter())
    }

    public KarafFeaturesBuilder(Writer writer) {
        super(writer)

        this.writer = writer

        super.setOmitNullAttributes(true)
        super.setDoubleQuotes(true)
    }

    public getWriter() {
        return this.writer;
    }

    @Override
    public String toString() {
        return writer.toString();
    }
}
