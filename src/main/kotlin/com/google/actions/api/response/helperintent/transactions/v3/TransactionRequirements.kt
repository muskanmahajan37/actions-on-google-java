/*
 * Copyright 2019 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.actions.api.response.helperintent.transactions.v3

import com.google.actions.api.response.helperintent.HelperIntent
import com.google.api.services.actions_fulfillment.v2.model.TransactionRequirementsCheckSpecV3

class TransactionRequirements : HelperIntent {
    private val map: HashMap<String, Any> = HashMap<String, Any>()

    override val name: String
        get() = "actions.intent.TRANSACTION_REQUIREMENTS_CHECK"

    override val parameters: Map<String, Any>
        get() {
            prepareMap()
            map.put("@type",
                    "type.googleapis.com/google.actions.transactions.v3.TransactionRequirementsCheckSpec")
            return map
        }

    private fun prepareMap() {
        val spec = TransactionRequirementsCheckSpecV3()
        spec.toMap(map)
    }
}