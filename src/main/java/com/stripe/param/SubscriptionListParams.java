package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class SubscriptionListParams extends ApiRequestParams {

    /**
     * The billing mode of the subscriptions to retrieve. Either `charge_automatically` or `send_invoice`.
     */
    @SerializedName("billing")
    SubscriptionListParams.Billing billing;
    @SerializedName("created")
    Object created;
    @SerializedName("current_period_end")
    Object currentPeriodEnd;
    @SerializedName("current_period_start")
    Object currentPeriodStart;

    /**
     * The ID of the customer whose subscriptions will be retrieved.
     */
    @SerializedName("customer")
    String customer;

    /**
     * A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
     */
    @SerializedName("ending_before")
    String endingBefore;

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
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
     */
    @SerializedName("limit")
    Long limit;

    /**
     * The ID of the plan whose subscriptions will be retrieved.
     */
    @SerializedName("plan")
    String plan;

    /**
     * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
     */
    @SerializedName("starting_after")
    String startingAfter;

    /**
     * The status of the subscriptions to retrieve. One of: `incomplete`, `incomplete_expired`, `trialing`, `active`, `past_due`, `unpaid`, `canceled`, or `all`. Passing in a value of `canceled` will return all canceled subscriptions, including those belonging to deleted customers. Passing in a value of `all` will return subscriptions of all statuses.
     */
    @SerializedName("status")
    SubscriptionListParams.Status status;

    private SubscriptionListParams(
        SubscriptionListParams.Billing billing,
        Object created,
        Object currentPeriodEnd,
        Object currentPeriodStart,
        String customer,
        String endingBefore,
        List<String> expand,
        Map<String, Object> extraParams,
        Long limit,
        String plan,
        String startingAfter,
        SubscriptionListParams.Status status) {

        this.billing = billing;
        this.created = created;
        this.currentPeriodEnd = currentPeriodEnd;
        this.currentPeriodStart = currentPeriodStart;
        this.customer = customer;
        this.endingBefore = endingBefore;
        this.expand = expand;
        this.extraParams = extraParams;
        this.limit = limit;
        this.plan = plan;
        this.startingAfter = startingAfter;
        this.status = status;
    }
    public static SubscriptionListParams.Builder builder() {
        return new SubscriptionListParams.Builder();
    }
    public static class Builder {
        private SubscriptionListParams.Billing billing;
        private Object created;
        private Object currentPeriodEnd;
        private Object currentPeriodStart;
        private String customer;
        private String endingBefore;
        private List<String> expand;
        private Map<String, Object> extraParams;
        private Long limit;
        private String plan;
        private String startingAfter;
        private SubscriptionListParams.Status status;
        public SubscriptionListParams build() {
            return new SubscriptionListParams(
                this.billing,
                this.created,
                this.currentPeriodEnd,
                this.currentPeriodStart,
                this.customer,
                this.endingBefore,
                this.expand,
                this.extraParams,
                this.limit,
                this.plan,
                this.startingAfter,
                this.status
            );
        }

        /**
         * The billing mode of the subscriptions to retrieve. Either `charge_automatically` or `send_invoice`.
         */
        public SubscriptionListParams.Builder setBilling(
            SubscriptionListParams.Billing billing) {

            this.billing = billing;
            return this;
        }
        public SubscriptionListParams.Builder setCreated(
            SubscriptionListParams.Created created) {

            this.created = created;
            return this;
        }
        public SubscriptionListParams.Builder setCreated(Long created) {
            this.created = created;
            return this;
        }
        public SubscriptionListParams.Builder setCurrentPeriodEnd(
            SubscriptionListParams.CurrentPeriodEnd currentPeriodEnd) {

            this.currentPeriodEnd = currentPeriodEnd;
            return this;
        }
        public SubscriptionListParams.Builder setCurrentPeriodEnd(
            Long currentPeriodEnd) {

            this.currentPeriodEnd = currentPeriodEnd;
            return this;
        }
        public SubscriptionListParams.Builder setCurrentPeriodStart(
            SubscriptionListParams.CurrentPeriodStart currentPeriodStart) {

            this.currentPeriodStart = currentPeriodStart;
            return this;
        }
        public SubscriptionListParams.Builder setCurrentPeriodStart(
            Long currentPeriodStart) {

            this.currentPeriodStart = currentPeriodStart;
            return this;
        }

        /**
         * The ID of the customer whose subscriptions will be retrieved.
         */
        public SubscriptionListParams.Builder setCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        /**
         * A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
         */
        public SubscriptionListParams.Builder setEndingBefore(
            String endingBefore) {

            this.endingBefore = endingBefore;
            return this;
        }

        /**
         * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link SubscriptionListParams#expand} for the field documentation.
         */
        public SubscriptionListParams.Builder addExpand(String element) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.add(element);
            return this;
        }

        /**
         * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link SubscriptionListParams#expand} for the field documentation.
         */
        public SubscriptionListParams.Builder addAllExpand(List<String> list) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.addAll(list);
            return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SubscriptionListParams#extraParams} for the field documentation.
         */
        public SubscriptionListParams.Builder putExtraParam(
            String key,
            Object value) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SubscriptionListParams#extraParams} for the field documentation.
         */
        public SubscriptionListParams.Builder putAllExtraParam(
            Map<String, Object> map) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
        }

        /**
         * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
         */
        public SubscriptionListParams.Builder setLimit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The ID of the plan whose subscriptions will be retrieved.
         */
        public SubscriptionListParams.Builder setPlan(String plan) {
            this.plan = plan;
            return this;
        }

        /**
         * A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent call can include `starting_after=obj_foo` in order to fetch the next page of the list.
         */
        public SubscriptionListParams.Builder setStartingAfter(
            String startingAfter) {

            this.startingAfter = startingAfter;
            return this;
        }

        /**
         * The status of the subscriptions to retrieve. One of: `incomplete`, `incomplete_expired`, `trialing`, `active`, `past_due`, `unpaid`, `canceled`, or `all`. Passing in a value of `canceled` will return all canceled subscriptions, including those belonging to deleted customers. Passing in a value of `all` will return subscriptions of all statuses.
         */
        public SubscriptionListParams.Builder setStatus(
            SubscriptionListParams.Status status) {

            this.status = status;
            return this;
        }

    }
    public static class Created {

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum value to filter by (exclusive).
         */
        @SerializedName("gt")
        Long gt;

        /**
         * Minimum value to filter by (inclusive).
         */
        @SerializedName("gte")
        Long gte;

        /**
         * Maximum value to filter by (exclusive).
         */
        @SerializedName("lt")
        Long lt;

        /**
         * Maximum value to filter by (inclusive).
         */
        @SerializedName("lte")
        Long lte;

        private Created(
            Map<String, Object> extraParams,
            Long gt,
            Long gte,
            Long lt,
            Long lte) {

            this.extraParams = extraParams;
            this.gt = gt;
            this.gte = gte;
            this.lt = lt;
            this.lte = lte;
        }
        public static SubscriptionListParams.Created.Builder builder() {
            return new SubscriptionListParams.Created.Builder();
        }
        public static class Builder {
            private Map<String, Object> extraParams;
            private Long gt;
            private Long gte;
            private Long lt;
            private Long lte;
            public SubscriptionListParams.Created build() {
                return new SubscriptionListParams.Created(
                    this.extraParams,
                    this.gt,
                    this.gte,
                    this.lt,
                    this.lte
                );
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SubscriptionListParams.Created#extraParams} for the field documentation.
             */
            public SubscriptionListParams.Created.Builder putExtraParam(
                String key,
                Object value) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SubscriptionListParams.Created#extraParams} for the field documentation.
             */
            public SubscriptionListParams.Created.Builder putAllExtraParam(
                Map<String, Object> map) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
            }

            /**
             * Minimum value to filter by (exclusive).
             */
            public SubscriptionListParams.Created.Builder setGt(Long gt) {
                this.gt = gt;
                return this;
            }

            /**
             * Minimum value to filter by (inclusive).
             */
            public SubscriptionListParams.Created.Builder setGte(Long gte) {
                this.gte = gte;
                return this;
            }

            /**
             * Maximum value to filter by (exclusive).
             */
            public SubscriptionListParams.Created.Builder setLt(Long lt) {
                this.lt = lt;
                return this;
            }

            /**
             * Maximum value to filter by (inclusive).
             */
            public SubscriptionListParams.Created.Builder setLte(Long lte) {
                this.lte = lte;
                return this;
            }

        }
    }
    public static class CurrentPeriodEnd {

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum value to filter by (exclusive).
         */
        @SerializedName("gt")
        Long gt;

        /**
         * Minimum value to filter by (inclusive).
         */
        @SerializedName("gte")
        Long gte;

        /**
         * Maximum value to filter by (exclusive).
         */
        @SerializedName("lt")
        Long lt;

        /**
         * Maximum value to filter by (inclusive).
         */
        @SerializedName("lte")
        Long lte;

        private CurrentPeriodEnd(
            Map<String, Object> extraParams,
            Long gt,
            Long gte,
            Long lt,
            Long lte) {

            this.extraParams = extraParams;
            this.gt = gt;
            this.gte = gte;
            this.lt = lt;
            this.lte = lte;
        }
        public static SubscriptionListParams.CurrentPeriodEnd.Builder builder()
            {

            return new SubscriptionListParams.CurrentPeriodEnd.Builder();
        }
        public static class Builder {
            private Map<String, Object> extraParams;
            private Long gt;
            private Long gte;
            private Long lt;
            private Long lte;
            public SubscriptionListParams.CurrentPeriodEnd build() {
                return new SubscriptionListParams.CurrentPeriodEnd(
                    this.extraParams,
                    this.gt,
                    this.gte,
                    this.lt,
                    this.lte
                );
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SubscriptionListParams.CurrentPeriodEnd#extraParams} for the field documentation.
             */
            public SubscriptionListParams.CurrentPeriodEnd.Builder putExtraParam(
                String key,
                Object value) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SubscriptionListParams.CurrentPeriodEnd#extraParams} for the field documentation.
             */
            public SubscriptionListParams.CurrentPeriodEnd.Builder putAllExtraParam(
                Map<String, Object> map) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
            }

            /**
             * Minimum value to filter by (exclusive).
             */
            public SubscriptionListParams.CurrentPeriodEnd.Builder setGt(
                Long gt) {

                this.gt = gt;
                return this;
            }

            /**
             * Minimum value to filter by (inclusive).
             */
            public SubscriptionListParams.CurrentPeriodEnd.Builder setGte(
                Long gte) {

                this.gte = gte;
                return this;
            }

            /**
             * Maximum value to filter by (exclusive).
             */
            public SubscriptionListParams.CurrentPeriodEnd.Builder setLt(
                Long lt) {

                this.lt = lt;
                return this;
            }

            /**
             * Maximum value to filter by (inclusive).
             */
            public SubscriptionListParams.CurrentPeriodEnd.Builder setLte(
                Long lte) {

                this.lte = lte;
                return this;
            }

        }
    }
    public static class CurrentPeriodStart {

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Minimum value to filter by (exclusive).
         */
        @SerializedName("gt")
        Long gt;

        /**
         * Minimum value to filter by (inclusive).
         */
        @SerializedName("gte")
        Long gte;

        /**
         * Maximum value to filter by (exclusive).
         */
        @SerializedName("lt")
        Long lt;

        /**
         * Maximum value to filter by (inclusive).
         */
        @SerializedName("lte")
        Long lte;

        private CurrentPeriodStart(
            Map<String, Object> extraParams,
            Long gt,
            Long gte,
            Long lt,
            Long lte) {

            this.extraParams = extraParams;
            this.gt = gt;
            this.gte = gte;
            this.lt = lt;
            this.lte = lte;
        }
        public static SubscriptionListParams.CurrentPeriodStart.Builder builder()
            {

            return new SubscriptionListParams.CurrentPeriodStart.Builder();
        }
        public static class Builder {
            private Map<String, Object> extraParams;
            private Long gt;
            private Long gte;
            private Long lt;
            private Long lte;
            public SubscriptionListParams.CurrentPeriodStart build() {
                return new SubscriptionListParams.CurrentPeriodStart(
                    this.extraParams,
                    this.gt,
                    this.gte,
                    this.lt,
                    this.lte
                );
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SubscriptionListParams.CurrentPeriodStart#extraParams} for the field documentation.
             */
            public SubscriptionListParams.CurrentPeriodStart.Builder putExtraParam(
                String key,
                Object value) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link SubscriptionListParams.CurrentPeriodStart#extraParams} for the field documentation.
             */
            public SubscriptionListParams.CurrentPeriodStart.Builder putAllExtraParam(
                Map<String, Object> map) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
            }

            /**
             * Minimum value to filter by (exclusive).
             */
            public SubscriptionListParams.CurrentPeriodStart.Builder setGt(
                Long gt) {

                this.gt = gt;
                return this;
            }

            /**
             * Minimum value to filter by (inclusive).
             */
            public SubscriptionListParams.CurrentPeriodStart.Builder setGte(
                Long gte) {

                this.gte = gte;
                return this;
            }

            /**
             * Maximum value to filter by (exclusive).
             */
            public SubscriptionListParams.CurrentPeriodStart.Builder setLt(
                Long lt) {

                this.lt = lt;
                return this;
            }

            /**
             * Maximum value to filter by (inclusive).
             */
            public SubscriptionListParams.CurrentPeriodStart.Builder setLte(
                Long lte) {

                this.lte = lte;
                return this;
            }

        }
    }
    public enum Billing implements ApiRequestParams.EnumParam {
        @SerializedName("charge_automatically")
        CHARGE_AUTOMATICALLY("charge_automatically"),
        @SerializedName("send_invoice")
        SEND_INVOICE("send_invoice");
        @Getter(onMethod_ = {@Override})
        private final String value;
        private Billing(String value) {
            this.value = value;
        }

    }
    public enum Status implements ApiRequestParams.EnumParam {
        @SerializedName("active")
        ACTIVE("active"),
        @SerializedName("all")
        ALL("all"),
        @SerializedName("canceled")
        CANCELED("canceled"),
        @SerializedName("ended")
        ENDED("ended"),
        @SerializedName("incomplete")
        INCOMPLETE("incomplete"),
        @SerializedName("incomplete_expired")
        INCOMPLETE_EXPIRED("incomplete_expired"),
        @SerializedName("past_due")
        PAST_DUE("past_due"),
        @SerializedName("trialing")
        TRIALING("trialing"),
        @SerializedName("unpaid")
        UNPAID("unpaid");
        @Getter(onMethod_ = {@Override})
        private final String value;
        private Status(String value) {
            this.value = value;
        }

    }
}