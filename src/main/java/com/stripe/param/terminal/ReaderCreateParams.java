package com.stripe.param.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReaderCreateParams extends ApiRequestParams {

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
     * Custom label given to the reader for easier identification. If no label is specified, the registration code will be used.
     */
    @SerializedName("label")
    String label;

    /**
     * The location to assign the reader to. If no location is specified, the reader will be assigned to the account's default location.
     */
    @SerializedName("location")
    String location;

    /**
     * To [group objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account) on your platform account by connected account, set this parameter to the connected account ID.
     */
    @SerializedName("operator_account")
    String operatorAccount;

    /**
     * A code generated by the reader used for registering to an account.
     */
    @SerializedName("registration_code")
    String registrationCode;

    private ReaderCreateParams(
        List<String> expand,
        Map<String, Object> extraParams,
        String label,
        String location,
        String operatorAccount,
        String registrationCode) {

        this.expand = expand;
        this.extraParams = extraParams;
        this.label = label;
        this.location = location;
        this.operatorAccount = operatorAccount;
        this.registrationCode = registrationCode;
    }
    public static ReaderCreateParams.Builder builder() {
        return new ReaderCreateParams.Builder();
    }
    public static class Builder {
        private List<String> expand;
        private Map<String, Object> extraParams;
        private String label;
        private String location;
        private String operatorAccount;
        private String registrationCode;
        public ReaderCreateParams build() {
            return new ReaderCreateParams(
                this.expand,
                this.extraParams,
                this.label,
                this.location,
                this.operatorAccount,
                this.registrationCode
            );
        }

        /**
         * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link ReaderCreateParams#expand} for the field documentation.
         */
        public ReaderCreateParams.Builder addExpand(String element) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.add(element);
            return this;
        }

        /**
         * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link ReaderCreateParams#expand} for the field documentation.
         */
        public ReaderCreateParams.Builder addAllExpand(List<String> list) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.addAll(list);
            return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ReaderCreateParams#extraParams} for the field documentation.
         */
        public ReaderCreateParams.Builder putExtraParam(
            String key,
            Object value) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link ReaderCreateParams#extraParams} for the field documentation.
         */
        public ReaderCreateParams.Builder putAllExtraParam(
            Map<String, Object> map) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
        }

        /**
         * Custom label given to the reader for easier identification. If no label is specified, the registration code will be used.
         */
        public ReaderCreateParams.Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        /**
         * The location to assign the reader to. If no location is specified, the reader will be assigned to the account's default location.
         */
        public ReaderCreateParams.Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        /**
         * To [group objects](https://stripe.com/docs/terminal/payments/connect#grouping-objects-by-connected-account) on your platform account by connected account, set this parameter to the connected account ID.
         */
        public ReaderCreateParams.Builder setOperatorAccount(
            String operatorAccount) {

            this.operatorAccount = operatorAccount;
            return this;
        }

        /**
         * A code generated by the reader used for registering to an account.
         */
        public ReaderCreateParams.Builder setRegistrationCode(
            String registrationCode) {

            this.registrationCode = registrationCode;
            return this;
        }

    }
}