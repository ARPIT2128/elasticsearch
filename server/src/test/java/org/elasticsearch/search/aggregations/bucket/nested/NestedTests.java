/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the "Elastic License
 * 2.0", the "GNU Affero General Public License v3.0 only", and the "Server Side
 * Public License v 1"; you may not use this file except in compliance with, at
 * your election, the "Elastic License 2.0", the "GNU Affero General Public
 * License v3.0 only", or the "Server Side Public License, v 1".
 */

package org.elasticsearch.search.aggregations.bucket.nested;

import org.elasticsearch.search.aggregations.BaseAggregationTestCase;

public class NestedTests extends BaseAggregationTestCase<NestedAggregationBuilder> {

    @Override
    protected NestedAggregationBuilder createTestAggregatorBuilder() {
        return new NestedAggregationBuilder(randomAlphaOfLengthBetween(1, 20), randomAlphaOfLengthBetween(3, 40));
    }

}
