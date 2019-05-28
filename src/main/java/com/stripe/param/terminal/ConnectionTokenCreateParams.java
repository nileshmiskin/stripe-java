package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionTokenCreateParams extends ApiRequestParams {

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
     * To [group objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account) on your platform account by connected account, set this parameter to the connected account ID.
     */
    @SerializedName("operator_account")
    String operatorAccount;

    private ConnectionTokenCreateParams(
        List<String> expand,
        Map<String, Object> extraParams,
        String operatorAccount) {

        this.expand = expand;
        this.extraParams = extraParams;
        this.operatorAccount = operatorAccount;
    }
    public static ConnectionTokenCreateParams.Builder builder() {
        return new ConnectionTokenCreateParams.Builder();
    }
    public static class Builder {
        private List<String> expand;
        private Map<String, Object> extraParams;
        private String operatorAccount;
        public ConnectionTokenCreateParams build() {
            return new ConnectionTokenCreateParams(
                this.expand,
                this.extraParams,
                this.operatorAccount
            );
        }

        /**
         * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link ConnectionTokenCreateParams#expand} for the field documentation.
         */
        public ConnectionTokenCreateParams.Builder addExpand(String element) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.add(element);
            return this;
        }

        /**
         * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link ConnectionTokenCreateParams#expand} for the field documentation.
         */
        public ConnectionTokenCreateParams.Builder addAllExpand(
            List<String> list) {

            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.addAll(list);
            return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ConnectionTokenCreateParams#extraParams} for the field documentation.
         */
        public ConnectionTokenCreateParams.Builder putExtraParam(
            String key,
            Object value) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ConnectionTokenCreateParams#extraParams} for the field documentation.
         */
        public ConnectionTokenCreateParams.Builder putAllExtraParam(
            Map<String, Object> map) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
        }

        /**
         * To [group objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account) on your platform account by connected account, set this parameter to the connected account ID.
         */
        public ConnectionTokenCreateParams.Builder setOperatorAccount(
            String operatorAccount) {

            this.operatorAccount = operatorAccount;
            return this;
        }

    }
}