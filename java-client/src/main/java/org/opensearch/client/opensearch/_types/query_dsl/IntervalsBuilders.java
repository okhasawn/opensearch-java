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

package org.opensearch.client.opensearch._types.query_dsl;

/**
 * Builders for {@link Intervals} variants.
 */
public class IntervalsBuilders {
	private IntervalsBuilders() {
	}

	/**
	 * Creates a builder for the {@link IntervalsAllOf all_of} {@code Intervals}
	 * variant.
	 */
	public static IntervalsAllOf.Builder allOf() {
		return new IntervalsAllOf.Builder();
	}

	/**
	 * Creates a builder for the {@link IntervalsAnyOf any_of} {@code Intervals}
	 * variant.
	 */
	public static IntervalsAnyOf.Builder anyOf() {
		return new IntervalsAnyOf.Builder();
	}

	/**
	 * Creates a builder for the {@link IntervalsFuzzy fuzzy} {@code Intervals}
	 * variant.
	 */
	public static IntervalsFuzzy.Builder fuzzy() {
		return new IntervalsFuzzy.Builder();
	}

	/**
	 * Creates a builder for the {@link IntervalsMatch match} {@code Intervals}
	 * variant.
	 */
	public static IntervalsMatch.Builder match() {
		return new IntervalsMatch.Builder();
	}

	/**
	 * Creates a builder for the {@link IntervalsPrefix prefix} {@code Intervals}
	 * variant.
	 */
	public static IntervalsPrefix.Builder prefix() {
		return new IntervalsPrefix.Builder();
	}

	/**
	 * Creates a builder for the {@link IntervalsWildcard wildcard}
	 * {@code Intervals} variant.
	 */
	public static IntervalsWildcard.Builder wildcard() {
		return new IntervalsWildcard.Builder();
	}

}
