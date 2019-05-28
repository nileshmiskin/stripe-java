package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class AccountLinkCreateParams extends ApiRequestParams {

    /**
     * The identifier of the account to create an account link for.
     */
    @SerializedName("account")
    String account;

    /**
     * The information the platform wants to collect from users up-front. Possible values are `currently_due` and `eventually_due`.
     */
    @SerializedName("collect")
    AccountLinkCreateParams.Collect collect;

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
     * The URL that the user will be redirected to if the account link is no longer valid.
     */
    @SerializedName("failure_url")
    String failureUrl;

    /**
     * The URL that the user will be redirected to upon completing the linked flow successfully.
     */
    @SerializedName("success_url")
    String successUrl;

    /**
     * The type of account link the user is requesting. Possible values are `custom_account_verification` or `custom_account_update`.
     */
    @SerializedName("type")
    String type;

    private AccountLinkCreateParams(
        String account,
        AccountLinkCreateParams.Collect collect,
        List<String> expand,
        Map<String, Object> extraParams,
        String failureUrl,
        String successUrl,
        String type) {

        this.account = account;
        this.collect = collect;
        this.expand = expand;
        this.extraParams = extraParams;
        this.failureUrl = failureUrl;
        this.successUrl = successUrl;
        this.type = type;
    }
    public static AccountLinkCreateParams.Builder builder() {
        return new AccountLinkCreateParams.Builder();
    }
    public static class Builder {
        private String account;
        private AccountLinkCreateParams.Collect collect;
        private List<String> expand;
        private Map<String, Object> extraParams;
        private String failureUrl;
        private String successUrl;
        private String type;
        public AccountLinkCreateParams build() {
            return new AccountLinkCreateParams(
                this.account,
                this.collect,
                this.expand,
                this.extraParams,
                this.failureUrl,
                this.successUrl,
                this.type
            );
        }

        /**
         * The identifier of the account to create an account link for.
         */
        public AccountLinkCreateParams.Builder setAccount(String account) {
            this.account = account;
            return this;
        }

        /**
         * The information the platform wants to collect from users up-front. Possible values are `currently_due` and `eventually_due`.
         */
        public AccountLinkCreateParams.Builder setCollect(
            AccountLinkCreateParams.Collect collect) {

            this.collect = collect;
            return this;
        }

        /**
         * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link AccountLinkCreateParams#expand} for the field documentation.
         */
        public AccountLinkCreateParams.Builder addExpand(String element) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.add(element);
            return this;
        }

        /**
         * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link AccountLinkCreateParams#expand} for the field documentation.
         */
        public AccountLinkCreateParams.Builder addAllExpand(List<String> list) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.addAll(list);
            return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link AccountLinkCreateParams#extraParams} for the field documentation.
         */
        public AccountLinkCreateParams.Builder putExtraParam(
            String key,
            Object value) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link AccountLinkCreateParams#extraParams} for the field documentation.
         */
        public AccountLinkCreateParams.Builder putAllExtraParam(
            Map<String, Object> map) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
        }

        /**
         * The URL that the user will be redirected to if the account link is no longer valid.
         */
        public AccountLinkCreateParams.Builder setFailureUrl(
            String failureUrl) {

            this.failureUrl = failureUrl;
            return this;
        }

        /**
         * The URL that the user will be redirected to upon completing the linked flow successfully.
         */
        public AccountLinkCreateParams.Builder setSuccessUrl(
            String successUrl) {

            this.successUrl = successUrl;
            return this;
        }

        /**
         * The type of account link the user is requesting. Possible values are `custom_account_verification` or `custom_account_update`.
         */
        public AccountLinkCreateParams.Builder setType(String type) {
            this.type = type;
            return this;
        }

    }
    public enum Collect implements ApiRequestParams.EnumParam {
        @SerializedName("currently_due")
        CURRENTLY_DUE("currently_due"),
        @SerializedName("eventually_due")
        EVENTUALLY_DUE("eventually_due");
        @Getter(onMethod_ = {@Override})
        private final String value;
        private Collect(String value) {
            this.value = value;
        }

    }
}