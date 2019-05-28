package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiRequestParams.EnumParam;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class CustomerUpdateParams extends ApiRequestParams {

    /**
     * An integer amount in %s that represents the account balance for your customer. Account balances only affect invoices. A negative amount represents a credit that decreases the amount due on an invoice; a positive amount increases the amount due on an invoice.
     */
    @SerializedName("account_balance")
    Long accountBalance;

    /**
     * The customer's address.
     */
    @SerializedName("address")
    Object address;
    @SerializedName("coupon")
    String coupon;

    /**
     * Provide the ID of a payment source already attached to this customer to make it this customer's default payment source. If you want to add a new payment source and make it the default, see the [source](https://stripe.com/docs/api/customers/update#update_customer-source) property.
     */
    @SerializedName("default_source")
    String defaultSource;

    /**
     * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the dashboard.
     */
    @SerializedName("description")
    String description;

    /**
     * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching and tracking. This may be up to *512 characters*.
     */
    @SerializedName("email")
    String email;

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
     * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase letters or numbers.
     */
    @SerializedName("invoice_prefix")
    String invoicePrefix;

    /**
     * Default invoice settings for this customer.
     */
    @SerializedName("invoice_settings")
    CustomerUpdateParams.InvoiceSettings invoiceSettings;

    /**
     * A set of key-value pairs that you can attach to a customer object. It can be useful for storing additional information about the customer in a structured format.
     */
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * The customer's full name or business name.
     */
    @SerializedName("name")
    String name;

    /**
     * The customer's phone number.
     */
    @SerializedName("phone")
    String phone;

    /**
     * Customer's preferred languages, ordered by preference.
     */
    @SerializedName("preferred_locales")
    List<String> preferredLocales;

    /**
     * The customer's shipping information. Appears on invoices emailed to this customer.
     */
    @SerializedName("shipping")
    Object shipping;
    @SerializedName("source")
    String source;

    /**
     * The customer's tax exemption. One of `none`, `exempt`, or `reverse`.
     */
    @SerializedName("tax_exempt")
    ApiRequestParams.EnumParam taxExempt;

    /**
     * The customer's tax information. Appears on invoices emailed to this customer. This parameter has been deprecated and will be removed in a future API version, for further information view the [migration guide](https://stripe.com/docs/billing/migration/taxes#moving-from-taxinfo-to-customer-tax-ids).
     */
    @SerializedName("tax_info")
    CustomerUpdateParams.TaxInfo taxInfo;

    /**
     * Unix timestamp representing the end of the trial period the customer will get before being charged for the first time. This will always overwrite any trials that might apply via a subscribed plan. If set, trial_end will override the default trial period of the plan the customer is being subscribed to. The special value `now` can be provided to end the customer's trial immediately. Can be at most two years from `billing_cycle_anchor`.
     */
    @SerializedName("trial_end")
    Object trialEnd;

    private CustomerUpdateParams(
        Long accountBalance,
        Object address,
        String coupon,
        String defaultSource,
        String description,
        String email,
        List<String> expand,
        Map<String, Object> extraParams,
        String invoicePrefix,
        CustomerUpdateParams.InvoiceSettings invoiceSettings,
        Map<String, String> metadata,
        String name,
        String phone,
        List<String> preferredLocales,
        Object shipping,
        String source,
        ApiRequestParams.EnumParam taxExempt,
        CustomerUpdateParams.TaxInfo taxInfo,
        Object trialEnd) {

        this.accountBalance = accountBalance;
        this.address = address;
        this.coupon = coupon;
        this.defaultSource = defaultSource;
        this.description = description;
        this.email = email;
        this.expand = expand;
        this.extraParams = extraParams;
        this.invoicePrefix = invoicePrefix;
        this.invoiceSettings = invoiceSettings;
        this.metadata = metadata;
        this.name = name;
        this.phone = phone;
        this.preferredLocales = preferredLocales;
        this.shipping = shipping;
        this.source = source;
        this.taxExempt = taxExempt;
        this.taxInfo = taxInfo;
        this.trialEnd = trialEnd;
    }
    public static CustomerUpdateParams.Builder builder() {
        return new CustomerUpdateParams.Builder();
    }
    public static class Builder {
        private Long accountBalance;
        private Object address;
        private String coupon;
        private String defaultSource;
        private String description;
        private String email;
        private List<String> expand;
        private Map<String, Object> extraParams;
        private String invoicePrefix;
        private CustomerUpdateParams.InvoiceSettings invoiceSettings;
        private Map<String, String> metadata;
        private String name;
        private String phone;
        private List<String> preferredLocales;
        private Object shipping;
        private String source;
        private ApiRequestParams.EnumParam taxExempt;
        private CustomerUpdateParams.TaxInfo taxInfo;
        private Object trialEnd;
        public CustomerUpdateParams build() {
            return new CustomerUpdateParams(
                this.accountBalance,
                this.address,
                this.coupon,
                this.defaultSource,
                this.description,
                this.email,
                this.expand,
                this.extraParams,
                this.invoicePrefix,
                this.invoiceSettings,
                this.metadata,
                this.name,
                this.phone,
                this.preferredLocales,
                this.shipping,
                this.source,
                this.taxExempt,
                this.taxInfo,
                this.trialEnd
            );
        }

        /**
         * An integer amount in %s that represents the account balance for your customer. Account balances only affect invoices. A negative amount represents a credit that decreases the amount due on an invoice; a positive amount increases the amount due on an invoice.
         */
        public CustomerUpdateParams.Builder setAccountBalance(
            Long accountBalance) {

            this.accountBalance = accountBalance;
            return this;
        }

        /**
         * The customer's address.
         */
        public CustomerUpdateParams.Builder setAddress(
            CustomerUpdateParams.Address address) {

            this.address = address;
            return this;
        }

        /**
         * The customer's address.
         */
        public CustomerUpdateParams.Builder setAddress(EmptyParam address) {
            this.address = address;
            return this;
        }
        public CustomerUpdateParams.Builder setCoupon(String coupon) {
            this.coupon = coupon;
            return this;
        }

        /**
         * Provide the ID of a payment source already attached to this customer to make it this customer's default payment source. If you want to add a new payment source and make it the default, see the [source](https://stripe.com/docs/api/customers/update#update_customer-source) property.
         */
        public CustomerUpdateParams.Builder setDefaultSource(
            String defaultSource) {

            this.defaultSource = defaultSource;
            return this;
        }

        /**
         * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the dashboard.
         */
        public CustomerUpdateParams.Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching and tracking. This may be up to *512 characters*.
         */
        public CustomerUpdateParams.Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link CustomerUpdateParams#expand} for the field documentation.
         */
        public CustomerUpdateParams.Builder addExpand(String element) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.add(element);
            return this;
        }

        /**
         * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link CustomerUpdateParams#expand} for the field documentation.
         */
        public CustomerUpdateParams.Builder addAllExpand(List<String> list) {
            if (this.expand == null) {
                this.expand = new ArrayList<>();
            }
            this.expand.addAll(list);
            return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams#extraParams} for the field documentation.
         */
        public CustomerUpdateParams.Builder putExtraParam(
            String key,
            Object value) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.put(key, value);
            return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams#extraParams} for the field documentation.
         */
        public CustomerUpdateParams.Builder putAllExtraParam(
            Map<String, Object> map) {

            if (this.extraParams == null) {
                this.extraParams = new HashMap<>();
            }
            this.extraParams.putAll(map);
            return this;
        }

        /**
         * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase letters or numbers.
         */
        public CustomerUpdateParams.Builder setInvoicePrefix(
            String invoicePrefix) {

            this.invoicePrefix = invoicePrefix;
            return this;
        }

        /**
         * Default invoice settings for this customer.
         */
        public CustomerUpdateParams.Builder setInvoiceSettings(
            CustomerUpdateParams.InvoiceSettings invoiceSettings) {

            this.invoiceSettings = invoiceSettings;
            return this;
        }

        /**
         * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams#metadata} for the field documentation.
         */
        public CustomerUpdateParams.Builder putMetadata(
            String key,
            String value) {

            if (this.metadata == null) {
                this.metadata = new HashMap<>();
            }
            this.metadata.put(key, value);
            return this;
        }

        /**
         * Add all map key/value pairs to `metadata` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams#metadata} for the field documentation.
         */
        public CustomerUpdateParams.Builder putAllMetadata(
            Map<String, String> map) {

            if (this.metadata == null) {
                this.metadata = new HashMap<>();
            }
            this.metadata.putAll(map);
            return this;
        }

        /**
         * The customer's full name or business name.
         */
        public CustomerUpdateParams.Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The customer's phone number.
         */
        public CustomerUpdateParams.Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Add an element to `preferredLocales` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link CustomerUpdateParams#preferredLocales} for the field documentation.
         */
        public CustomerUpdateParams.Builder addPreferredLocale(String element) {
            if (this.preferredLocales == null) {
                this.preferredLocales = new ArrayList<>();
            }
            this.preferredLocales.add(element);
            return this;
        }

        /**
         * Add all elements to `preferredLocales` list. A list is initialized for the first `add/addAll` call, and subsequent calls adds additional elements to the original list. See {@link CustomerUpdateParams#preferredLocales} for the field documentation.
         */
        public CustomerUpdateParams.Builder addAllPreferredLocale(
            List<String> list) {

            if (this.preferredLocales == null) {
                this.preferredLocales = new ArrayList<>();
            }
            this.preferredLocales.addAll(list);
            return this;
        }

        /**
         * The customer's shipping information. Appears on invoices emailed to this customer.
         */
        public CustomerUpdateParams.Builder setShipping(
            CustomerUpdateParams.Shipping shipping) {

            this.shipping = shipping;
            return this;
        }

        /**
         * The customer's shipping information. Appears on invoices emailed to this customer.
         */
        public CustomerUpdateParams.Builder setShipping(EmptyParam shipping) {
            this.shipping = shipping;
            return this;
        }
        public CustomerUpdateParams.Builder setSource(String source) {
            this.source = source;
            return this;
        }

        /**
         * The customer's tax exemption. One of `none`, `exempt`, or `reverse`.
         */
        public CustomerUpdateParams.Builder setTaxExempt(EmptyParam taxExempt) {
            this.taxExempt = taxExempt;
            return this;
        }

        /**
         * The customer's tax exemption. One of `none`, `exempt`, or `reverse`.
         */
        public CustomerUpdateParams.Builder setTaxExempt(
            CustomerUpdateParams.TaxExempt taxExempt) {

            this.taxExempt = taxExempt;
            return this;
        }

        /**
         * The customer's tax information. Appears on invoices emailed to this customer. This parameter has been deprecated and will be removed in a future API version, for further information view the [migration guide](https://stripe.com/docs/billing/migration/taxes#moving-from-taxinfo-to-customer-tax-ids).
         */
        public CustomerUpdateParams.Builder setTaxInfo(
            CustomerUpdateParams.TaxInfo taxInfo) {

            this.taxInfo = taxInfo;
            return this;
        }

        /**
         * Unix timestamp representing the end of the trial period the customer will get before being charged for the first time. This will always overwrite any trials that might apply via a subscribed plan. If set, trial_end will override the default trial period of the plan the customer is being subscribed to. The special value `now` can be provided to end the customer's trial immediately. Can be at most two years from `billing_cycle_anchor`.
         */
        public CustomerUpdateParams.Builder setTrialEnd(
            CustomerUpdateParams.TrialEnd trialEnd) {

            this.trialEnd = trialEnd;
            return this;
        }

        /**
         * Unix timestamp representing the end of the trial period the customer will get before being charged for the first time. This will always overwrite any trials that might apply via a subscribed plan. If set, trial_end will override the default trial period of the plan the customer is being subscribed to. The special value `now` can be provided to end the customer's trial immediately. Can be at most two years from `billing_cycle_anchor`.
         */
        public CustomerUpdateParams.Builder setTrialEnd(Long trialEnd) {
            this.trialEnd = trialEnd;
            return this;
        }

    }
    public static class Address {
        @SerializedName("city")
        String city;
        @SerializedName("country")
        String country;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;
        @SerializedName("line1")
        String line1;
        @SerializedName("line2")
        String line2;
        @SerializedName("postal_code")
        String postalCode;
        @SerializedName("state")
        String state;

        private Address(
            String city,
            String country,
            Map<String, Object> extraParams,
            String line1,
            String line2,
            String postalCode,
            String state) {

            this.city = city;
            this.country = country;
            this.extraParams = extraParams;
            this.line1 = line1;
            this.line2 = line2;
            this.postalCode = postalCode;
            this.state = state;
        }
        public static CustomerUpdateParams.Address.Builder builder() {
            return new CustomerUpdateParams.Address.Builder();
        }
        public static class Builder {
            private String city;
            private String country;
            private Map<String, Object> extraParams;
            private String line1;
            private String line2;
            private String postalCode;
            private String state;
            public CustomerUpdateParams.Address build() {
                return new CustomerUpdateParams.Address(
                    this.city,
                    this.country,
                    this.extraParams,
                    this.line1,
                    this.line2,
                    this.postalCode,
                    this.state
                );
            }
            public CustomerUpdateParams.Address.Builder setCity(String city) {
                this.city = city;
                return this;
            }
            public CustomerUpdateParams.Address.Builder setCountry(
                String country) {

                this.country = country;
                return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.Address#extraParams} for the field documentation.
             */
            public CustomerUpdateParams.Address.Builder putExtraParam(
                String key,
                Object value) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.Address#extraParams} for the field documentation.
             */
            public CustomerUpdateParams.Address.Builder putAllExtraParam(
                Map<String, Object> map) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
            }
            public CustomerUpdateParams.Address.Builder setLine1(String line1) {
                this.line1 = line1;
                return this;
            }
            public CustomerUpdateParams.Address.Builder setLine2(String line2) {
                this.line2 = line2;
                return this;
            }
            public CustomerUpdateParams.Address.Builder setPostalCode(
                String postalCode) {

                this.postalCode = postalCode;
                return this;
            }
            public CustomerUpdateParams.Address.Builder setState(String state) {
                this.state = state;
                return this;
            }

        }
    }
    public static class InvoiceSettings {

        /**
         * Default custom fields to be displayed on invoices for this customer.
         */
        @SerializedName("custom_fields")
        Object customFields;

        /**
         * ID of the default payment method used for subscriptions and invoices for the customer.
         */
        @SerializedName("default_payment_method")
        String defaultPaymentMethod;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Default footer to be displayed on invoices for this customer.
         */
        @SerializedName("footer")
        String footer;

        private InvoiceSettings(
            Object customFields,
            String defaultPaymentMethod,
            Map<String, Object> extraParams,
            String footer) {

            this.customFields = customFields;
            this.defaultPaymentMethod = defaultPaymentMethod;
            this.extraParams = extraParams;
            this.footer = footer;
        }
        public static CustomerUpdateParams.InvoiceSettings.Builder builder() {
            return new CustomerUpdateParams.InvoiceSettings.Builder();
        }
        public static class Builder {
            private Object customFields;
            private String defaultPaymentMethod;
            private Map<String, Object> extraParams;
            private String footer;
            public CustomerUpdateParams.InvoiceSettings build() {
                return new CustomerUpdateParams.InvoiceSettings(
                    this.customFields,
                    this.defaultPaymentMethod,
                    this.extraParams,
                    this.footer
                );
            }

            /**
             * Default custom fields to be displayed on invoices for this customer.
             */
            public CustomerUpdateParams.InvoiceSettings.Builder setCustomFields(
                List<
                    CustomerUpdateParams.InvoiceSettings.CustomField
                > customFields) {

                this.customFields = customFields;
                return this;
            }

            /**
             * Default custom fields to be displayed on invoices for this customer.
             */
            public CustomerUpdateParams.InvoiceSettings.Builder setCustomFields(
                EmptyParam customFields) {

                this.customFields = customFields;
                return this;
            }

            /**
             * ID of the default payment method used for subscriptions and invoices for the customer.
             */
            public CustomerUpdateParams.InvoiceSettings.Builder setDefaultPaymentMethod(
                String defaultPaymentMethod) {

                this.defaultPaymentMethod = defaultPaymentMethod;
                return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.InvoiceSettings#extraParams} for the field documentation.
             */
            public CustomerUpdateParams.InvoiceSettings.Builder putExtraParam(
                String key,
                Object value) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.InvoiceSettings#extraParams} for the field documentation.
             */
            public CustomerUpdateParams.InvoiceSettings.Builder putAllExtraParam(
                Map<String, Object> map) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
            }

            /**
             * Default footer to be displayed on invoices for this customer.
             */
            public CustomerUpdateParams.InvoiceSettings.Builder setFooter(
                String footer) {

                this.footer = footer;
                return this;
            }

        }
        public static class CustomField {

            /**
             * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;

            /**
             * The name of the custom field. This may be up to 30 characters.
             */
            @SerializedName("name")
            String name;

            /**
             * The value of the custom field. This may be up to 30 characters.
             */
            @SerializedName("value")
            String value;

            private CustomField(
                Map<String, Object> extraParams,
                String name,
                String value) {

                this.extraParams = extraParams;
                this.name = name;
                this.value = value;
            }
            public static CustomerUpdateParams.InvoiceSettings.CustomField.Builder builder()
                {

                return new CustomerUpdateParams.InvoiceSettings.CustomField.Builder(

                );
            }
            public static class Builder {
                private Map<String, Object> extraParams;
                private String name;
                private String value;
                public CustomerUpdateParams.InvoiceSettings.CustomField build()
                    {

                    return new CustomerUpdateParams.InvoiceSettings.CustomField(
                        this.extraParams,
                        this.name,
                        this.value
                    );
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.InvoiceSettings.CustomField#extraParams} for the field documentation.
                 */
                public CustomerUpdateParams.InvoiceSettings.CustomField.Builder putExtraParam(
                    String key,
                    Object value) {

                    if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                    }
                    this.extraParams.put(key, value);
                    return this;
                }

                /**
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.InvoiceSettings.CustomField#extraParams} for the field documentation.
                 */
                public CustomerUpdateParams.InvoiceSettings.CustomField.Builder putAllExtraParam(
                    Map<String, Object> map) {

                    if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                }

                /**
                 * The name of the custom field. This may be up to 30 characters.
                 */
                public CustomerUpdateParams.InvoiceSettings.CustomField.Builder setName(
                    String name) {

                    this.name = name;
                    return this;
                }

                /**
                 * The value of the custom field. This may be up to 30 characters.
                 */
                public CustomerUpdateParams.InvoiceSettings.CustomField.Builder setValue(
                    String value) {

                    this.value = value;
                    return this;
                }

            }
        }
    }
    public static class Shipping {

        /**
         * Customer shipping address.
         */
        @SerializedName("address")
        CustomerUpdateParams.Shipping.Address address;

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * Customer name.
         */
        @SerializedName("name")
        String name;

        /**
         * Customer phone (including extension).
         */
        @SerializedName("phone")
        String phone;

        private Shipping(
            CustomerUpdateParams.Shipping.Address address,
            Map<String, Object> extraParams,
            String name,
            String phone) {

            this.address = address;
            this.extraParams = extraParams;
            this.name = name;
            this.phone = phone;
        }
        public static CustomerUpdateParams.Shipping.Builder builder() {
            return new CustomerUpdateParams.Shipping.Builder();
        }
        public static class Builder {
            private CustomerUpdateParams.Shipping.Address address;
            private Map<String, Object> extraParams;
            private String name;
            private String phone;
            public CustomerUpdateParams.Shipping build() {
                return new CustomerUpdateParams.Shipping(
                    this.address,
                    this.extraParams,
                    this.name,
                    this.phone
                );
            }

            /**
             * Customer shipping address.
             */
            public CustomerUpdateParams.Shipping.Builder setAddress(
                CustomerUpdateParams.Shipping.Address address) {

                this.address = address;
                return this;
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.Shipping#extraParams} for the field documentation.
             */
            public CustomerUpdateParams.Shipping.Builder putExtraParam(
                String key,
                Object value) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.Shipping#extraParams} for the field documentation.
             */
            public CustomerUpdateParams.Shipping.Builder putAllExtraParam(
                Map<String, Object> map) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
            }

            /**
             * Customer name.
             */
            public CustomerUpdateParams.Shipping.Builder setName(String name) {
                this.name = name;
                return this;
            }

            /**
             * Customer phone (including extension).
             */
            public CustomerUpdateParams.Shipping.Builder setPhone(
                String phone) {

                this.phone = phone;
                return this;
            }

        }
        public static class Address {
            @SerializedName("city")
            String city;
            @SerializedName("country")
            String country;

            /**
             * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
             */
            @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
            Map<String, Object> extraParams;
            @SerializedName("line1")
            String line1;
            @SerializedName("line2")
            String line2;
            @SerializedName("postal_code")
            String postalCode;
            @SerializedName("state")
            String state;

            private Address(
                String city,
                String country,
                Map<String, Object> extraParams,
                String line1,
                String line2,
                String postalCode,
                String state) {

                this.city = city;
                this.country = country;
                this.extraParams = extraParams;
                this.line1 = line1;
                this.line2 = line2;
                this.postalCode = postalCode;
                this.state = state;
            }
            public static CustomerUpdateParams.Shipping.Address.Builder builder()
                {

                return new CustomerUpdateParams.Shipping.Address.Builder();
            }
            public static class Builder {
                private String city;
                private String country;
                private Map<String, Object> extraParams;
                private String line1;
                private String line2;
                private String postalCode;
                private String state;
                public CustomerUpdateParams.Shipping.Address build() {
                    return new CustomerUpdateParams.Shipping.Address(
                        this.city,
                        this.country,
                        this.extraParams,
                        this.line1,
                        this.line2,
                        this.postalCode,
                        this.state
                    );
                }
                public CustomerUpdateParams.Shipping.Address.Builder setCity(
                    String city) {

                    this.city = city;
                    return this;
                }
                public CustomerUpdateParams.Shipping.Address.Builder setCountry(
                    String country) {

                    this.country = country;
                    return this;
                }

                /**
                 * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.Shipping.Address#extraParams} for the field documentation.
                 */
                public CustomerUpdateParams.Shipping.Address.Builder putExtraParam(
                    String key,
                    Object value) {

                    if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                    }
                    this.extraParams.put(key, value);
                    return this;
                }

                /**
                 * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.Shipping.Address#extraParams} for the field documentation.
                 */
                public CustomerUpdateParams.Shipping.Address.Builder putAllExtraParam(
                    Map<String, Object> map) {

                    if (this.extraParams == null) {
                        this.extraParams = new HashMap<>();
                    }
                    this.extraParams.putAll(map);
                    return this;
                }
                public CustomerUpdateParams.Shipping.Address.Builder setLine1(
                    String line1) {

                    this.line1 = line1;
                    return this;
                }
                public CustomerUpdateParams.Shipping.Address.Builder setLine2(
                    String line2) {

                    this.line2 = line2;
                    return this;
                }
                public CustomerUpdateParams.Shipping.Address.Builder setPostalCode(
                    String postalCode) {

                    this.postalCode = postalCode;
                    return this;
                }
                public CustomerUpdateParams.Shipping.Address.Builder setState(
                    String state) {

                    this.state = state;
                    return this;
                }

            }
        }
    }
    public static class TaxInfo {

        /**
         * Map of extra parameters for custom features not available in this client library. The content in this map is not serialized under this field's {@code @SerializedName} value. Instead, each key/value pair is serialized as if the key is a root-level field (serialized) name in this param object. Effectively, this map is flattened to its parent instance.
         */
        @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
        Map<String, Object> extraParams;

        /**
         * The customer's tax ID number.
         */
        @SerializedName("tax_id")
        String taxId;

        /**
         * The type of ID number. The only possible value is `vat`
         */
        @SerializedName("type")
        CustomerUpdateParams.TaxInfo.Type type;

        private TaxInfo(
            Map<String, Object> extraParams,
            String taxId,
            CustomerUpdateParams.TaxInfo.Type type) {

            this.extraParams = extraParams;
            this.taxId = taxId;
            this.type = type;
        }
        public static CustomerUpdateParams.TaxInfo.Builder builder() {
            return new CustomerUpdateParams.TaxInfo.Builder();
        }
        public static class Builder {
            private Map<String, Object> extraParams;
            private String taxId;
            private CustomerUpdateParams.TaxInfo.Type type;
            public CustomerUpdateParams.TaxInfo build() {
                return new CustomerUpdateParams.TaxInfo(
                    this.extraParams,
                    this.taxId,
                    this.type
                );
            }

            /**
             * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.TaxInfo#extraParams} for the field documentation.
             */
            public CustomerUpdateParams.TaxInfo.Builder putExtraParam(
                String key,
                Object value) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.put(key, value);
                return this;
            }

            /**
             * Add all map key/value pairs to `extraParams` map. A map is initialized for the first `put/putAll` call, and subsequent calls add additional key/value pairs to the original map. See {@link CustomerUpdateParams.TaxInfo#extraParams} for the field documentation.
             */
            public CustomerUpdateParams.TaxInfo.Builder putAllExtraParam(
                Map<String, Object> map) {

                if (this.extraParams == null) {
                    this.extraParams = new HashMap<>();
                }
                this.extraParams.putAll(map);
                return this;
            }

            /**
             * The customer's tax ID number.
             */
            public CustomerUpdateParams.TaxInfo.Builder setTaxId(String taxId) {
                this.taxId = taxId;
                return this;
            }

            /**
             * The type of ID number. The only possible value is `vat`
             */
            public CustomerUpdateParams.TaxInfo.Builder setType(
                CustomerUpdateParams.TaxInfo.Type type) {

                this.type = type;
                return this;
            }

        }
        public enum Type implements ApiRequestParams.EnumParam {
            @SerializedName("vat")
            VAT("vat");
            @Getter(onMethod_ = {@Override})
            private final String value;
            private Type(String value) {
                this.value = value;
            }

        }
    }
    public enum TaxExempt implements ApiRequestParams.EnumParam {
        @SerializedName("exempt")
        EXEMPT("exempt"),
        @SerializedName("none")
        NONE("none"),
        @SerializedName("reverse")
        REVERSE("reverse");
        @Getter(onMethod_ = {@Override})
        private final String value;
        private TaxExempt(String value) {
            this.value = value;
        }

    }
    public enum TrialEnd implements ApiRequestParams.EnumParam {
        @SerializedName("now")
        NOW("now");
        @Getter(onMethod_ = {@Override})
        private final String value;
        private TrialEnd(String value) {
            this.value = value;
        }

    }
}