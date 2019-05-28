package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SourceVerifyParams extends ApiRequestParams {

    /**
     * Specifies which fields in the response should be expanded.
     */
    @SerializedName("expand")
    List<String> expand;

    /**
     * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /**
     * The values needed to verify the source.
     */
    @SerializedName("values")
    List<String> values;

    private SourceVerifyParams(
        List<String> expand,
        Map<String, Object> extraParams,
        List<String> values) {

        this.expand = expand;
        this.extraParams = extraParams;
        this.values = values;
    }
    public static SourceVerifyParams.Builder builder() {
        return new SourceVerifyParams.Builder();
    }
    public static class Builder {
        private List<String> expand;
        private Map<String, Object> extraParams;
        private List<String> values;
        public SourceVerifyParams build() {
            return new SourceVerifyParams(
                this.expand,
                this.extraParams,
                this.values
            );
        }

        /**
         * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link SourceVerifyParams#expand} for the field documentation.
         */
        public SourceVerifyParams.Builder addExpand(String element) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.add(element);
            return this;
        }

        /**
         * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link SourceVerifyParams#expand} for the field documentation.
         */
        public SourceVerifyParams.Builder addAllExpand(List<String> list) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.addAll(list);
            return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SourceVerifyParams#extraParams} for the field documentation.
         */
        public SourceVerifyParams.Builder putExtraParam(
            String key,
            Object value) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SourceVerifyParams#extraParams} for the field documentation.
         */
        public SourceVerifyParams.Builder putAllExtraParam(
            Map<String, Object> map) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
        }

        /**
         * Add an element to `values` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link SourceVerifyParams#values} for the field documentation.
         */
        public SourceVerifyParams.Builder addValue(String element) {
            if (this.values == null) {
                this.values = new ArrayList<>();
            }
            this.values.add(element);
            return this;
        }

        /**
         * Add all elements to `values` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link SourceVerifyParams#values} for the field documentation.
         */
        public SourceVerifyParams.Builder addAllValue(List<String> list) {
            if (this.values == null) {
                this.values = new ArrayList<>();
            }
            this.values.addAll(list);
            return this;
        }

    }
}