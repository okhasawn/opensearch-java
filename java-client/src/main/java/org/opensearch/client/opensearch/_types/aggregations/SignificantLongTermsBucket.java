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

package org.opensearch.client.opensearch._types.aggregations;

import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.SignificantLongTermsBucket


@JsonpDeserializable
public class SignificantLongTermsBucket extends SignificantTermsBucketBase {
	private final long key;

	@Nullable
	private final String keyAsString;

	// ---------------------------------------------------------------------------------------------

	private SignificantLongTermsBucket(Builder builder) {
		super(builder);

		this.key = ApiTypeHelper.requireNonNull(builder.key, this, "key");
		this.keyAsString = builder.keyAsString;

	}

	public static SignificantLongTermsBucket of(Function<Builder, ObjectBuilder<SignificantLongTermsBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final long key() {
		return this.key;
	}

	/**
	 * API name: {@code key_as_string}
	 */
	@Nullable
	public final String keyAsString() {
		return this.keyAsString;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("key");
		generator.write(this.key);

		if (this.keyAsString != null) {
			generator.writeKey("key_as_string");
			generator.write(this.keyAsString);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SignificantLongTermsBucket}.
	 */

	public static class Builder extends SignificantTermsBucketBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SignificantLongTermsBucket> {
		private Long key;

		@Nullable
		private String keyAsString;

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(long value) {
			this.key = value;
			return this;
		}

		/**
		 * API name: {@code key_as_string}
		 */
		public final Builder keyAsString(@Nullable String value) {
			this.keyAsString = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SignificantLongTermsBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SignificantLongTermsBucket build() {
			_checkSingleUse();

			return new SignificantLongTermsBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SignificantLongTermsBucket}
	 */
	public static final JsonpDeserializer<SignificantLongTermsBucket> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SignificantLongTermsBucket::setupSignificantLongTermsBucketDeserializer);

	protected static void setupSignificantLongTermsBucketDeserializer(
			ObjectDeserializer<SignificantLongTermsBucket.Builder> op) {
		setupSignificantTermsBucketBaseDeserializer(op);
		op.add(Builder::key, JsonpDeserializer.longDeserializer(), "key");
		op.add(Builder::keyAsString, JsonpDeserializer.stringDeserializer(), "key_as_string");

	}

}
