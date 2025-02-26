/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.client.opensearch.core.explain;

import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.function.Function;

// typedef: _global.explain.Explanation


@JsonpDeserializable
public class Explanation implements JsonpSerializable {
	private final String description;

	private final List<ExplanationDetail> details;

	private final float value;

	// ---------------------------------------------------------------------------------------------

	private Explanation(Builder builder) {

		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.details = ApiTypeHelper.unmodifiableRequired(builder.details, this, "details");
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static Explanation of(Function<Builder, ObjectBuilder<Explanation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code details}
	 */
	public final List<ExplanationDetail> details() {
		return this.details;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final float value() {
		return this.value;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("description");
		generator.write(this.description);

		if (ApiTypeHelper.isDefined(this.details)) {
			generator.writeKey("details");
			generator.writeStartArray();
			for (ExplanationDetail item0 : this.details) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("value");
		generator.write(this.value);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Explanation}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Explanation> {
		private String description;

		private List<ExplanationDetail> details;

		private Float value;

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code details}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>details</code>.
		 */
		public final Builder details(List<ExplanationDetail> list) {
			this.details = _listAddAll(this.details, list);
			return this;
		}

		/**
		 * Required - API name: {@code details}
		 * <p>
		 * Adds one or more values to <code>details</code>.
		 */
		public final Builder details(ExplanationDetail value, ExplanationDetail... values) {
			this.details = _listAdd(this.details, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code details}
		 * <p>
		 * Adds a value to <code>details</code> using a builder lambda.
		 */
		public final Builder details(Function<ExplanationDetail.Builder, ObjectBuilder<ExplanationDetail>> fn) {
			return details(fn.apply(new ExplanationDetail.Builder()).build());
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(float value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link Explanation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Explanation build() {
			_checkSingleUse();

			return new Explanation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Explanation}
	 */
	public static final JsonpDeserializer<Explanation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Explanation::setupExplanationDeserializer);

	protected static void setupExplanationDeserializer(ObjectDeserializer<Explanation.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::details, JsonpDeserializer.arrayDeserializer(ExplanationDetail._DESERIALIZER), "details");
		op.add(Builder::value, JsonpDeserializer.floatDeserializer(), "value");

	}

}
