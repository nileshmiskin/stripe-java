package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CapabilityUpdateParams extends ApiRequestParams {

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
     * Passing true requests the capability for the account, if it is not already requested. A requested capability may not immediately become active. Any requirements to activate the capability are returned in the `requirements` arrays.
     */
    @SerializedName("requested")
    Boolean requested;

    private CapabilityUpdateParams(
        List<String> expand,
        Map<String, Object> extraParams,
        Boolean requested) {

        this.expand = expand;
        this.extraParams = extraParams;
        this.requested = requested;
    }
    public static CapabilityUpdateParams.Builder builder() {
        return new CapabilityUpdateParams.Builder();
    }
    public static class Builder {
        private List<String> expand;
        private Map<String, Object> extraParams;
        private Boolean requested;
        public CapabilityUpdateParams build() {
            return new CapabilityUpdateParams(
                this.expand,
                this.extraParams,
                this.requested
            );
        }

        /**
         * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link CapabilityUpdateParams#expand} for the field documentation.
         */
        public CapabilityUpdateParams.Builder addExpand(String element) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.add(element);
            return this;
        }

        /**
         * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link CapabilityUpdateParams#expand} for the field documentation.
         */
        public CapabilityUpdateParams.Builder addAllExpand(List<String> list) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.addAll(list);
            return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CapabilityUpdateParams#extraParams} for the field documentation.
         */
        public CapabilityUpdateParams.Builder putExtraParam(
            String key,
            Object value) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CapabilityUpdateParams#extraParams} for the field documentation.
         */
        public CapabilityUpdateParams.Builder putAllExtraParam(
            Map<String, Object> map) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
        }

        /**
         * Passing true requests the capability for the account, if it is not already requested. A requested capability may not immediately become active. Any requirements to activate the capability are returned in the `requirements` arrays.
         */
        public CapabilityUpdateParams.Builder setRequested(Boolean requested) {
            this.requested = requested;
            return this;
        }

    }
}